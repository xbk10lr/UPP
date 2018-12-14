package com.upp.util;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import com.upp.constant.DateFormatCode;
import com.upp.constant.DictErrors;
import com.upp.exception.UppException;

/**
 * 日期时间工具类
 * 
 * @author lubiao
 * 
 */
public class DateUtil {

	public static final ThreadLocal<DateFormat> DATE_FORMATTER1 = new ThreadLocal<DateFormat>() {
		protected DateFormat initialValue() {
			return new SimpleDateFormat(DateFormatCode.DATE_FORMATTER1);
		}
	};
	public static final ThreadLocal<DateFormat> DATE_FORMATTER2 = new ThreadLocal<DateFormat>() {
		protected DateFormat initialValue() {
			return new SimpleDateFormat(DateFormatCode.DATE_FORMATTER2);
		}
	};
	public static final ThreadLocal<DateFormat> DATE_FORMATTER3 = new ThreadLocal<DateFormat>() {
		protected DateFormat initialValue() {
			return new SimpleDateFormat(DateFormatCode.DATE_FORMATTER3);
		}
	};
	public static final ThreadLocal<DateFormat> DATE_FORMATTER4 = new ThreadLocal<DateFormat>() {
		protected DateFormat initialValue() {
			return new SimpleDateFormat(DateFormatCode.DATE_FORMATTER4);
		}
	};
	public static final ThreadLocal<DateFormat> DATE_FORMATTER5 = new ThreadLocal<DateFormat>() {
		protected DateFormat initialValue() {
			return new SimpleDateFormat(DateFormatCode.DATE_FORMATTER5);
		}
	};
	public static final ThreadLocal<DateFormat> DATETIME_FORMATTER1 = new ThreadLocal<DateFormat>() {
		protected DateFormat initialValue() {
			return new SimpleDateFormat(DateFormatCode.DATETIME_FORMATTER1);
		}
	};
	public static final ThreadLocal<DateFormat> DATETIME_FORMATTER2 = new ThreadLocal<DateFormat>() {
		protected DateFormat initialValue() {
			return new SimpleDateFormat(DateFormatCode.DATETIME_FORMATTER2);
		}
	};
	public static final ThreadLocal<DateFormat> DATETIME_FORMATTER3 = new ThreadLocal<DateFormat>() {
		protected DateFormat initialValue() {
			return new SimpleDateFormat(DateFormatCode.DATETIME_FORMATTER3);
		}
	};
	public static final ThreadLocal<DateFormat> TIME_FORMATTER1 = new ThreadLocal<DateFormat>() {
		protected DateFormat initialValue() {
			return new SimpleDateFormat(DateFormatCode.TIME_FORMATTER1);
		}
	};

	public static final ThreadLocal<DateFormat> TIME_FORMATTER2 = new ThreadLocal<DateFormat>() {
		protected DateFormat initialValue() {
			return new SimpleDateFormat(DateFormatCode.TIME_FORMATTER2);
		}
	};

	public static final ThreadLocal<DateFormat> TIME_FORMATTER3 = new ThreadLocal<DateFormat>() {
		protected DateFormat initialValue() {
			return new SimpleDateFormat(DateFormatCode.TIME_FORMATTER3);
		}
	};

	public static String Date_To_DateFormat(Date date) {
		if (date == null) {
			return null;
		}

		try {
			return DATE_FORMATTER1.get().format(date);
		} catch (Exception e) {
			try {
				return DATE_FORMATTER2.get().format(date);
			} catch (Exception ex) {
				return DATE_FORMATTER3.get().format(date);
			}
		}
	}

	public static String Date_To_DateTimeFormat(Date date) {
		if (date == null) {
			return null;
		}

		try {
			return DATETIME_FORMATTER1.get().format(date);
		} catch (Exception e) {
			try {
				return DATETIME_FORMATTER2.get().format(date);
			} catch (Exception ex) {
				return DATETIME_FORMATTER3.get().format(date);
			}
		}
	}

	public static String Date_To_DateTimeFormat(Date date, DateFormat formator) {
		if (date == null) {
			return null;
		}
		return formator.format(date);
	}

	public static String Date_To_TimeFormat(Date date) {
		if (date == null) {
			return null;
		}
		return TIME_FORMATTER1.get().format(date);
	}

	public static String Date_To_TimeFormat(Date date, String strformatDefine) {
		if (date == null) {
			return null;
		}
		if (strformatDefine.equals(DateFormatCode.TIME_FORMATTER1)) {
			return TIME_FORMATTER1.get().format(date);
		} else if (strformatDefine.equals(DateFormatCode.TIME_FORMATTER2)) {
			return TIME_FORMATTER2.get().format(date);
		} else if (strformatDefine.equals(DateFormatCode.TIME_FORMATTER3)) {
			return TIME_FORMATTER3.get().format(date);
		} else {
			return null;
		}
	}

	public static Date TimeFormat_To_Date(Object formatObj) {
		if (formatObj == null) {
			return null;
		}
		try {
			return TIME_FORMATTER1.get().parse(
					StringUtil.parseObjectToString(formatObj));
		} catch (ParseException pe) {
			throw new RuntimeException(pe);
		}
	}

	public static Date DateFormat_To_Date(Object formatObj) throws UppException {
		if (formatObj == null || "".equals(formatObj)) {
			return null;
		}
		if(formatObj instanceof Date)
		{
			return (Date)formatObj;
		}
		String formatStr = StringUtil.parseObjectToString(formatObj);
		try {
			return DATE_FORMATTER1.get().parse(formatStr);
		} catch (Exception e) {
			try {
				return DATE_FORMATTER2.get().parse(formatStr);
			} catch (Exception ex) {
				try {
					return DATE_FORMATTER3.get().parse(formatStr);
				} catch (ParseException pe) {
					throw new UppException(DictErrors.DATE_FORMAT_ERROR);
				}
			}
		}
	}

	public static Date DateTimeFormat_To_Date(Object formatObj) throws UppException {
		if (formatObj == null||formatObj == "") {
			return null;
		}
		if(formatObj instanceof Date)
		{
			return (Date)formatObj;
		}
		String formatStr = StringUtil.parseObjectToString(formatObj);
		try {
			return DATETIME_FORMATTER1.get().parse(formatStr);
		} catch (Exception e) {
			try {
				return DATETIME_FORMATTER2.get().parse(formatStr);
			} catch (Exception ex) {
				try {
					return DATETIME_FORMATTER3.get().parse(formatStr);
				} catch (Exception exc) {
					throw new UppException(DictErrors.DATE_FORMAT_ERROR);
				}
			}
		}
	}

	public static String Date_To_DateTimeFormat(Date date,
			String strformatDefine) {
		if (date == null || strformatDefine == null) {
			return null;
		}
		if (strformatDefine.equals(DateFormatCode.DATE_FORMATTER1)) {
			return DATE_FORMATTER1.get().format(date);
		} else if (strformatDefine.equals(DateFormatCode.DATE_FORMATTER2)) {
			return DATE_FORMATTER2.get().format(date);
		} else if (strformatDefine.equals(DateFormatCode.DATE_FORMATTER3)) {
			return DATE_FORMATTER3.get().format(date);
		} else if (strformatDefine.equals(DateFormatCode.DATE_FORMATTER4)) {
			return DATE_FORMATTER4.get().format(date);
		}else if (strformatDefine.equals(DateFormatCode.DATE_FORMATTER5)) {
			return DATE_FORMATTER5.get().format(date);
		}
		if (strformatDefine.equals(DateFormatCode.DATETIME_FORMATTER1)) {
			return DATETIME_FORMATTER1.get().format(date);
		} else if (strformatDefine.equals(DateFormatCode.DATETIME_FORMATTER2)) {
			return DATETIME_FORMATTER2.get().format(date);
		} else if (strformatDefine.equals(DateFormatCode.DATETIME_FORMATTER3)) {
			return DATETIME_FORMATTER3.get().format(date);
		} else {
			return Date_To_TimeFormat(date);
		}

	}

	public static Date DateTimeFormat_To_Date(Object formatObj,
			String strformatDefine) {
		if (formatObj == null || strformatDefine == null) {
			return null;
		}
		String formatStr = StringUtil.parseObjectToString(formatObj);
		try {
			if (strformatDefine.equals(DateFormatCode.DATE_FORMATTER1)) {
				return DATE_FORMATTER1.get().parse(formatStr);
			} else if (strformatDefine.equals(DateFormatCode.DATE_FORMATTER2)) {
				return DATE_FORMATTER2.get().parse(formatStr);
			} else if (strformatDefine.equals(DateFormatCode.DATE_FORMATTER3)) {
				return DATE_FORMATTER3.get().parse(formatStr);
			}
			if (strformatDefine.equals(DateFormatCode.DATETIME_FORMATTER1)) {
				return DATETIME_FORMATTER1.get().parse(formatStr);
			} else if (strformatDefine
					.equals(DateFormatCode.DATETIME_FORMATTER2)) {
				return DATETIME_FORMATTER2.get().parse(formatStr);
			} else if (strformatDefine
					.equals(DateFormatCode.DATETIME_FORMATTER3)) {
				return DATETIME_FORMATTER3.get().parse(formatStr);
			} else {
				return TimeFormat_To_Date(formatObj);
			}
		} catch (ParseException pe) {
			throw new RuntimeException(pe);
		}

	}

	public static String Date_To_String(Date datetime) {
		if (datetime == null) {
			return null;
		}
		String time = Date_To_TimeFormat(datetime);
		if ("00:00:00".equals(time)) {
			return Date_To_DateFormat(datetime);
		} else {
			return Date_To_DateTimeFormat(datetime);
		}
	}

	public static Date Object_To_Date(Object formatObj) throws UppException {
		if (formatObj == null||"null".equals(formatObj)||formatObj == "") {
			return null;
		}
		String formatStr = StringUtil.parseObjectToString(formatObj);
		if (formatStr.length() > 10) {
			return DateTimeFormat_To_Date(formatObj);
		} else {
			return DateFormat_To_Date(formatObj);
		}
	}
	
	public static String formatDate(Date date, String pattern){
		if(date == null){
			throw new IllegalArgumentException("DateUtil类：date is null");
		}
		if(pattern == null){
			throw new IllegalArgumentException("DateUtil类：pattern is null");
		}
		SimpleDateFormat format = new SimpleDateFormat(pattern,Locale.US);
		format.setTimeZone(TimeZone.getTimeZone("GMT"));
		return format.format(date);
	}

	public static Date getDate() {
		Calendar calendar = Calendar.getInstance();
		return calendar.getTime();
	}

	public static Date addDate(int field, Date date, int num) {
		if (date == null) {
			return null;
		}

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(field, num);
		return calendar.getTime();
	}

	public static Date addDate(Date date, int days) {
		return addDate(Calendar.DATE, date, days);
	}

	public static Date addMonth(Date date, int months) {
		return addDate(Calendar.MONTH, date, months);
	}
	
	public static Date addHour(Date date, int hours) {
		return addDate(Calendar.HOUR, date, hours);
	}
	
	public static Date addMinute(Date date, int minutes) {
		return addDate(Calendar.MINUTE, date, minutes);
	}
	
	public static Date addDate(Date date, BigDecimal days) {
		return addDate(date, days.intValue());
	}

	public static Date addMonth(Date date, BigDecimal months) {
		return addMonth(date, months.intValue());
	}

	public static Date getCurrentDateTime() {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(System.currentTimeMillis());
		return cal.getTime();
	}
	
	/**
	 * 
	 * 功能描述: <br>
	 * 延后多少时间
	 *
	 * @param minutes
	 * @return
	 * @see [相关类/方法](可选)
	 * @since [产品/模块版本](可选)
	 */
	public static Date getDelayDateTime(int minutes) {
	    Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(System.currentTimeMillis()+minutes*60*1000);
        return cal.getTime();
	}

	public static Calendar getCalendar(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar;
	}
	
	public static int getYear() {
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.YEAR);
	}

	public static boolean isWeekDay(Date date) throws Exception {
		Calendar calendar = getCalendar(date);

		return calendar.get(Calendar.DAY_OF_WEEK) == 1;
	}

	public static boolean isHalfMonthEnd(Date date) throws Exception {
		Calendar calendar = getCalendar(date);

		return (calendar.get(Calendar.DAY_OF_MONTH) == 15 || isMonthEnd(date));
	}

	public static boolean isMonthEnd(Date date) throws Exception {
		Calendar calendar = getCalendar(date);

		return calendar.get(Calendar.DAY_OF_MONTH) == calendar
				.getActualMaximum(Calendar.DAY_OF_MONTH);
	}

	public static boolean isSeasonEnd(Date date) throws Exception {
		if (isMonthEnd(date)) {
			Calendar calendar = getCalendar(date);

			int month = calendar.get(Calendar.MONTH);
			if ((2 == month) || (5 == month) || (8 == month) || (11 == month)) {
				return true;
			}
		}

		return false;
	}

	public static boolean isHalfYearEnd(Date date) throws Exception {
		if (isMonthEnd(date)) {
			Calendar calendar = getCalendar(date);

			int month = calendar.get(Calendar.MONTH);
			if ((5 == month) || (11 == month)) {
				return true;
			}
		}

		return false;
	}

	public static boolean isYearEnd(Date date) throws Exception {
		if (isMonthEnd(date)) {
			Calendar calendar = getCalendar(date);

			int month = calendar.get(Calendar.MONTH);
			if (11 == month) {
				return true;
			}
		}

		return false;
	}
	
	/**
	 * 根据结算周期计算出具体结算日期
	 * @param type
	 * @param date
	 * @return
	 */
	public static Date getSettlementDate(String period, Date date){
		if(isNullOrEmpty(period)){
			return date;
		}
		switch (Integer.parseInt(period)){		
			case 0://实时
				return date;
			case 1://日
				return date;
			case 2://周
				return getWeekEnd(date);
			case 3://半月
				return getHalfMonthDate(date);
			case 4://月
				return getMonthEnd(date);
			case 5://季
				return getSeasonEnd(date);
			case 6://半年
				return getHalfYearEnd(date);
			case 7://年
				return getYearEnd(date);
			default:
				return date;
		}		

	}
	
	/**
	 * 判断输入的字符串是否是空
	 * 
	 * @param inStr  输入字符串
	 * 
	 * @return
	 * 
	 */
	public static boolean isNullOrEmpty(String inStr) {
		return (inStr == null || inStr.trim().length() == 0);
	}
	
	/**
	 * 获取这个时间的周日, 按中国星期的顺序：星期一,星期二,星期三,星期四,星期五,星期六,星期日
	 * 
	 * @param date
	 * @return
	 */
	public static Date getWeekEnd(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int w = cal.get(Calendar.DAY_OF_WEEK);
		if (w == 1) {
			return date;
		} else {
			cal.set(Calendar.DAY_OF_YEAR, cal.get(Calendar.DAY_OF_YEAR) + (8 - w));
			return cal.getTime();
		}
	}
	
	private static Date calMonthEnd(Calendar cal) {
		cal.add(Calendar.MONTH, 1);
		cal.set(Calendar.DATE, 1);
		cal.add(Calendar.DAY_OF_YEAR, -1);
		return cal.getTime();
	}
	/**
	 * 获取这个时间的月末
	 * 
	 * @param date
	 * @return
	 */
	public static Date getMonthEnd(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return calMonthEnd(cal);
	}	
	/**
	 * 获取这个时间的半月日期
	 * @param date
	 * @return
	 */
	
	public static java.util.Date getHalfMonthDate(Date date){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.DATE, 15);
		if(date.after(cal.getTime())){
			return getMonthEnd(date);
		}
		return cal.getTime();
	}
	/**
	 * 获取这个时间的季末 第一季度：1-3；第二季度：4-6；第三季度：7-9；第四季度：10-23；
	 * 
	 * @param date
	 * @return
	 */
	public static Date getSeasonEnd(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int month = cal.get(Calendar.MONTH);
		if (month < 3) {
			cal.add(Calendar.MONTH, 2 - month);
		} else if (month < 6) {
			cal.add(Calendar.MONTH, 5 - month);
		} else if (month < 9) {
			cal.add(Calendar.MONTH, 8 - month);
		} else {
			cal.add(Calendar.MONTH, 11 - month);
		}
		return calMonthEnd(cal);
	}
	/**
	 * 获取这个时间半年末
	 * 
	 * @param date
	 * @return
	 */
	public static Date getHalfYearEnd(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int month = cal.get(Calendar.MONTH);
		if (month < 6) {
			cal.add(Calendar.MONTH, 5 - month);
		} else {
			cal.add(Calendar.MONTH, 11 - month);
		}
		return calMonthEnd(cal);
	}
	/**
	 * 获取这个时间的年末
	 * 
	 * @param date
	 * @return
	 */
	public static Date getYearEnd(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int month = cal.get(Calendar.MONTH);
		cal.add(Calendar.MONTH, 11 - month);
		return calMonthEnd(cal);
	}
	
	public static Timestamp dataToTimeStamp(Date date){
		Timestamp timestamp = new Timestamp(date.getTime());
		return timestamp;
		
	}
}