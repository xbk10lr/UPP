package com.upp.util;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.Map;

public class UppBeanUtils {

	
	/**
	 * map转换成bean
	 * @param map
	 * @param obj
	 */
	public static void transMap2Bean(Map<String, Object> map, Object obj) {

		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
			PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();

			for (PropertyDescriptor property : propertyDescriptors) {
				String key = property.getName();

				if (map.containsKey(key)) {
					Object value = map.get(key);
					// 得到property对应的setter方法
					Method setter = property.getWriteMethod();
					setter.invoke(obj, value);
				}

			}

		} catch (Exception e) {
			System.out.println("transMap2Bean Error " + e);
		}

		return;

	}
	
	
	/**
	 * bean转换成map
	 * @param obj
	 * @return
	 */
	public static void transBean2Map(Object obj,Map<String,Object> map) {

		if (obj == null) {
			return;
		}
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
			PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
			for (PropertyDescriptor property : propertyDescriptors) {
				String key = property.getName();

				// 过滤class属性
				if (!key.equals("class")) {
					// 得到property对应的getter方法
					Method getter = property.getReadMethod();
					Object value = getter.invoke(obj);

					map.put(key, value);
				}

			}
		} catch (Exception e) {
			System.out.println("transBean2Map Error " + e);
		}

	}
}
