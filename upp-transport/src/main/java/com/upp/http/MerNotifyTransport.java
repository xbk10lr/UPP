package com.upp.http;

import org.springframework.stereotype.Component;

import com.upp.baseClass.BaseTransport;
import com.upp.constant.NotifyStatus;

@Component
public class MerNotifyTransport extends BaseTransport{

	/**
	 * 通知商户
	 */
	public String notifyMer(String message,String mertransurl){
		String retmsg = NotifyStatus.SUCCESS;
		try{
			HttpsClient.doPostStringSSL(mertransurl, message);
		} catch(Exception e){
			log.error("通知异常",e);
			retmsg=NotifyStatus.FAILURE;
		}
		return retmsg;
	}
	
}
