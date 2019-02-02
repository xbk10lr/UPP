package com.upp.util;

import java.util.Date;

import com.upp.constant.DateFormatCode;

/**
 * 流水号生成
 * @author Administrator
 *
 */
public class SeqNbrFactory {

	public static String getSeqNbrByDate(){
		return DateUtil.Date_To_DateTimeFormat(new Date(), DateFormatCode.DATETIME_FORMATTER3) + UUIDUtil.getUUID();
	}
}
