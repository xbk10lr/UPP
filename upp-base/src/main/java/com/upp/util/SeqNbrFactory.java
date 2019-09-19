package com.upp.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 流水号生成
 * @author Administrator
 *
 */
@Component
public class SeqNbrFactory {
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Value("${seqNbr.datacerterId}")
	private Long datacerterId;
	
	private static final Long sequence = 1L;
	
	private IdWorker idWorker;
	
//	public String getSeqNbrByDate(){
//		return DateUtil.Date_To_DateTimeFormat(new Date(), DateFormatCode.DATETIME_FORMATTER3) + UUIDUtil.getUUID();
//	}
	
	public String getSnowFlakeSeqNbr(){
		if(idWorker==null){
			//从环境变量中获取workerId
			String workerIdStr = System.getenv().get("workerId");
			Long workId = Long.parseLong(workerIdStr);
			log.info("成功获得workId 值为"+workId);
			//	@param workerId 工作ID (0~31)     * @param datacenterId 数据中心ID (0~31)
			idWorker = new IdWorker(workId, datacerterId, sequence);
		}
		return String.valueOf(idWorker.nextId());
	}
}
