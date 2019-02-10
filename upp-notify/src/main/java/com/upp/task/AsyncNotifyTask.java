package com.upp.task;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.upp.baseClass.BaseTask;
import com.upp.constant.NotifyStatus;
import com.upp.dto.generate.Onlineorderinfo;
import com.upp.service.AsyncNotifyService;

/**
 * 异步任务
 * 
 * @author Administrator
 *
 */
@Component
public class AsyncNotifyTask  extends BaseTask{
	
	@Autowired
	private AsyncNotifyService ans;
	/**
	 * 异步处理通知任务
	 * 
	 * @param ex
	 */
	@Async("taskExecutor")
	public void handleNotify(String message) {
		log.info("开始执行异步任务，发送交易结果通知");
		//解析报文
		Map<String, Object> retMap = ans.parseNotifyMessage(message);
		String overalltransnbr = (String) retMap.get("overalltransnbr");
		//获取原订单信息
		Onlineorderinfo onlineOrderInfo = ans.getOnlineOrderInfo(overalltransnbr);
		//更新原订单
		ans.updateOnlineOrderInfo(onlineOrderInfo,retMap);
		//插入通知表
		String notifynbr = ans.insertNotifyReg(onlineOrderInfo);
		//发送请求
		if(NotifyStatus.SUCCESS.equals(ans.notifyMer(onlineOrderInfo))){
			//更新通知表
			ans.updateNotifyReg(notifynbr, NotifyStatus.SUCCESS);
		} else {
			//更新通知表
			ans.updateNotifyReg(notifynbr, NotifyStatus.FAILURE);
		}
		log.info("报文已经发送");
		
	}
	
}
