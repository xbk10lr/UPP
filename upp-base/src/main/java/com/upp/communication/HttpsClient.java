package com.upp.communication;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Https客户端
 * @author xubingkun
 *
 */
public class HttpsClient {
	
	private static Logger logger = LoggerFactory.getLogger(HttpsClient.class);
	private static HttpClientBuilder builder;//http客户端创建类
	private static int maxTotal=2000;//连接池最大连接数
	private static int maxPerRoute=2000;//每个路由最大连接数
	private static int requestTimeout=30000;//从连接池获取连接超时时间
	
	//一些公用的配置只加载一次
	static{
		//创建SSL连接工厂类
		SSLConnectionSocketFactory sslsf = null;
		SSLContext sslc = null;
		try{
			sslc = SSLContext.getInstance("TLS");
			//初始化信任管理
			sslc.init(null, new TrustManager[]{new X509TrustManager() {
				
				@Override
				public X509Certificate[] getAcceptedIssuers() {
					return null;
				}
				
				@Override
				public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
					
				}
				
				@Override
				public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
					
				}
			}}, null);
			//创建SSL工厂类，允许所有主机名
			sslsf = new SSLConnectionSocketFactory(sslc, SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
			//创建注册类
			Registry<ConnectionSocketFactory> registry = RegistryBuilder.<ConnectionSocketFactory>create().register("https", sslsf).build();
			PoolingHttpClientConnectionManager ccm = new PoolingHttpClientConnectionManager(registry);
			//设置连接池大小
			ccm.setMaxTotal(maxTotal);
			ccm.setDefaultMaxPerRoute(maxPerRoute);
			builder = HttpClientBuilder.create();
			builder.setConnectionManager(ccm);
		}catch(Exception e){
			   logger.error("创建连接异常",e);
		}
	}
	/**
	 * 发送 SSL POST请求  K-V形式
	 * @param transUrl
	 * @param params
	 * @param reqConf
	 * @return
	 * @throws Exception
	 */
	public static String doPostMapSSL(String transUrl, Map<String,Object> params, String reqCharset, String resCharset, int connectionTimeout,int soTimeout) throws Exception{
		CloseableHttpClient httpClient = null;
		CloseableHttpResponse response = null;
		String resStr = null;
		try{
			//创建SSL安全连接
			httpClient = builder.setDefaultRequestConfig(getRequestConfig(connectionTimeout, soTimeout)).build();
		} catch(Exception e){
			logger.error("创建SSL安全连接失败",e);
			throw e;
		}
		HttpPost postMethod = new HttpPost(transUrl);
		try{
			List<BasicNameValuePair> reqList = new ArrayList<BasicNameValuePair>();
			for(String key: params.keySet()){
				BasicNameValuePair pairs = new BasicNameValuePair(key, params.get(key).toString());
				reqList.add(pairs);
			}
			//配置发送的信息
			postMethod.setEntity(new UrlEncodedFormEntity(reqList, reqCharset));
			long start = System.currentTimeMillis();
			//发送下游系统
			 response = httpClient.execute(postMethod);
			 logger.debug("调用下游系统耗时:" + (System.currentTimeMillis() - start) + "毫秒。");
			HttpEntity resEntity = response.getEntity();
			//返回内容为null，抛出异常
			if(resEntity == null){
				logger.error("下游返回报文为空");
				throw new Exception();
			}
			// 读取内容
			int statusCode = response.getStatusLine().getStatusCode();
			 resStr = EntityUtils.toString(resEntity, resCharset);
			//状态码不为200，抛出异常
			if(statusCode != HttpStatus.SC_OK){
				logger.error("Method failed: " + response.getStatusLine());
				logger.error(resStr);
				throw new Exception("返回状态码：" + statusCode + " ,返回信息:" + resStr);
			}
		}catch(Exception e){
			logger.error("与下游连接异常",e);
			throw e;
		}finally{
			//释放连接
			if(response != null){
				EntityUtils.consume(response.getEntity());
			}
			postMethod.abort();
		}
		
		return resStr;
	}
	
	public static String doPostStringSSL(String transUrl,String postString) throws Exception{
		return doPostStringSSL(transUrl, postString, "UTF-8", "UTF-8", 30000, 30000, "str");
	}
	
	/**
	 * 发送 SSL POST请求  String报文
	 * @param transUrl
	 * @param postString
	 * @param reqCharset
	 * @param resCharset
	 * @param reqConf
	 * @return
	 * @throws Exception
	 */
	public static String doPostStringSSL(String transUrl,String postString, String reqCharset, String resCharset, int connectionTimeout,int soTimeout,String type) throws Exception{
		CloseableHttpClient httpClient = null;
		CloseableHttpResponse response = null;
		String resStr = null;
		try{
			//创建SSL安全连接
			httpClient = builder.setDefaultRequestConfig(getRequestConfig(connectionTimeout, soTimeout)).build();
		} catch(Exception e){
			logger.error("创建SSL安全连接失败",e);
			throw e;
		}
		HttpPost postMethod = new HttpPost(transUrl);
		try{
			StringEntity entity = new StringEntity(postString, reqCharset);
			entity.setContentEncoding(reqCharset);
			if("xml".equals(type)){
				entity.setContentType("text/xml");//此处根据传入JSON或者xml进行修改
			}else if ("json".equals(type)){
				entity.setContentType("application/json");//此处根据传入JSON或者xml进行修改
			}else if("str".equals(type)){
                entity.setContentType("application/x-www-form-urlencoded");//普通字符串报文
            }
			postMethod.setEntity(entity);
			long start = System.currentTimeMillis();
			//发送post请求到下游
			 response = httpClient.execute(postMethod);
			 logger.debug("调用下游系统耗时:" + (System.currentTimeMillis() - start) + "毫秒。");
			HttpEntity resEntity = response.getEntity();
			//返回内容为null，抛出异常
			if(resEntity == null){
				logger.error("下游返回报文为空");
				throw new Exception();
			}
			// 读取内容
			int statusCode = response.getStatusLine().getStatusCode();
			 resStr = EntityUtils.toString(resEntity, resCharset);
			//状态码不为200，抛出异常
			if(statusCode != HttpStatus.SC_OK){
				logger.error("Method failed: " + response.getStatusLine());
				logger.error(resStr);
				throw new Exception("返回状态码：" + statusCode + " ,返回信息:" + resStr);
			}
		}catch(Exception e){
			logger.error("与下游连接异常",e);
			throw e;
		}finally{
			//释放连接
			if(response != null){
				EntityUtils.consume(response.getEntity());
			}
			postMethod.abort();
		}
		
		return resStr;
	}
	
	/**
	 * get请求HTTPS
	 * @param transUrl
	 * @param resCharset
	 * @param connectionTimeout
	 * @param soTimeout
	 * @return
	 * @throws Exception
	 */
	public static String doGetSSL(String transUrl, String resCharset, int connectionTimeout,int soTimeout) throws Exception{
		CloseableHttpClient httpClient = null;
		CloseableHttpResponse response = null;
		String resStr = null;
		try{
			//创建SSL安全连接
			httpClient = builder.setDefaultRequestConfig(getRequestConfig(connectionTimeout, soTimeout)).build();
		} catch(Exception e){
			logger.error("创建SSL安全连接失败",e);
			throw e;
		}
		HttpGet getMethod = new HttpGet(transUrl);
		logger.info("执行get请求：......"+getMethod.getURI());
		try{
			//开始调用下游
			long start = System.currentTimeMillis();
			response = httpClient.execute(getMethod);
			logger.debug("调用下游系统耗时:" + (System.currentTimeMillis() - start) + "毫秒。");
			HttpEntity resEntity = response.getEntity();
			//返回内容为null，抛出异常
			if(resEntity == null){
				logger.error("下游返回报文为空");
				throw new Exception();
			}
			// 读取内容
			int statusCode = response.getStatusLine().getStatusCode();
			 resStr = EntityUtils.toString(resEntity, resCharset);
			//状态码不为200，抛出异常
			if(statusCode != HttpStatus.SC_OK){
				logger.error("Method failed: " + response.getStatusLine());
				logger.error(resStr);
				throw new Exception("返回状态码：" + statusCode + " ,返回信息:" + resStr);
			}
		} catch (Exception e){
			logger.error("与下游连接异常",e);
			throw e;
		}finally{
			//释放连接
			if(response != null){
				EntityUtils.consume(response.getEntity());
			}
			getMethod.abort();
		}
		return resStr;
	}
	
	/**
	 * 配置请求参数
	 * @param connectionTimeout
	 * @param soTimeout
	 * @return
	 */
	private static RequestConfig getRequestConfig(int connectionTimeout, int soTimeout){
		RequestConfig.Builder builder = RequestConfig.custom();
		//设置连接超时时间
		builder.setConnectTimeout(connectionTimeout);
		//设置读取超时时间
		builder.setSocketTimeout(soTimeout);
		//设置从连接池获取实例超时时间
		builder.setConnectionRequestTimeout(requestTimeout);
		//builder.setStaleConnectionCheckEnabled(true);   //在提交请求前测试连接是否可用
		return builder.build();
	}

}
