package com.upp.util;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.TreeMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SignUtils {
	
	private static final Log logger = LogFactory.getLog(SignUtils.class);
	
	public static Boolean verifySign(TreeMap<String,Object> treeMap, String keyWord, String signature){
		StringBuffer sb = new StringBuffer();
		for(String key : treeMap.keySet()){
			Object val = treeMap.get(key);
			sb.append(key+"="+val.toString()+"&");
		}
		sb.append("key="+keyWord);
		try{
			return signature.equals(getMd5String(sb.toString()));
		}catch (Exception e){
			logger.error(e.getMessage(),e);
			return false;
		}
	}
	
	public static String getMd5String(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(str.getBytes("utf-8"));
		return new BigInteger(1, md.digest()).toString(16);
	}
}
