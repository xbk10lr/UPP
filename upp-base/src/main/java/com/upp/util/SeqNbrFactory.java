package com.upp.util;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.upp.constant.DateFormatCode;

/**
 * 流水号生成
 * @author Administrator
 *
 */
@Component
public class SeqNbrFactory {
	
	@Value("${seqNbr.datacerterId}")
	private Long datacerterId;
	
	@Value("${seqNbr.workerId}")
	private Long workerId;
	
	private static final Long sequence = 1L;
	
	private IdWorker idWorker;
	
//	public String getSeqNbrByDate(){
//		return DateUtil.Date_To_DateTimeFormat(new Date(), DateFormatCode.DATETIME_FORMATTER3) + UUIDUtil.getUUID();
//	}
	
	public String getSnowFlakeSeqNbr(){
		if(idWorker==null){
			//	@param workerId 工作ID (0~31)     * @param datacenterId 数据中心ID (0~31)
			idWorker = new IdWorker(workerId, datacerterId, sequence);
		}
		return String.valueOf(idWorker.nextId());
	}
}
