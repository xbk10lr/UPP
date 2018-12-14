package com.upp.util;

import java.util.UUID;

public class UUIDUtil {
	
	/**
	 * 获取一个UUID随机数
	 * @return
	 */
	public static String getUUID(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
