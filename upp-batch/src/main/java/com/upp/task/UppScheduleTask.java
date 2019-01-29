package com.upp.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.upp.action.ExceptionHandleAction;
import com.upp.dto.Context;

/**
 * 定时任务控制中心
 * @author Administrator
 *
 */
@Component
public class UppScheduleTask {
	
	private static final Logger log = LoggerFactory.getLogger(UppScheduleTask.class);

	private Context context = new Context();
	
	@Autowired
	private ExceptionHandleAction exceptionHandleAction;
	
	@Scheduled(cron="0 */1 * * * *")
	private void process(){
		try {
			exceptionHandleAction.excute(context);
		} catch (Exception e) {
			log.error(e.getMessage(),e);
		}
    }
}
