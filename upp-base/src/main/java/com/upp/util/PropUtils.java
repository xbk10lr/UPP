package com.upp.util;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.upp.constant.DictErrors;
import com.upp.exception.UppException;


public class PropUtils {

	private static final Logger logger = LoggerFactory.getLogger(PropUtils.class);

	public static String readValue(String key, String path) throws UppException {
		if (key == null)
			return null;
		Properties props = new Properties();
		InputStreamReader is = null;
		try {
			is = new InputStreamReader(PropUtils.class.getClassLoader().getResourceAsStream(path), "UTF-8");
			props.load(is);
			String value = props.getProperty(key);
			return value;
		} catch (IOException e) {
			logger.error("读取文件异常" + e);
			throw new UppException(DictErrors.SYSTEM_ERROR);
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				logger.error("关流失败", e);
				throw new UppException(DictErrors.SYSTEM_ERROR);
			}
		}
	}

	/**
	 * 获取整个properties文件
	 * 
	 * @param path
	 * @return
	 * @throws PeException
	 */
	public static Properties getProperties(String path) throws UppException {
		Properties props = new Properties();
		InputStreamReader is = null;
		try {
			is = new InputStreamReader(PropUtils.class.getClassLoader().getResourceAsStream(path), "UTF-8");
			props.load(is);
			return props;
		} catch (IOException e) {
			logger.error("读取文件异常" + e);
			throw new UppException(DictErrors.SYSTEM_ERROR);
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				logger.error("关流失败", e);
				throw new UppException(DictErrors.SYSTEM_ERROR);
			}
		}
	}

}
