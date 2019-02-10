package com.upp.rabbit.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.upp.baseClass.BaseTransport;
import com.upp.rabbit.config.RabbitConfig;

/**
 * 异步通知消息生产者
 * @author Administrator
 *
 */
@Component
public class AsyncNotifySender extends BaseTransport{

	@Autowired
	private AmqpTemplate rabbitTemplate;
	
	public void asyncNotifySend(String message) {
		log.info("异步通知消息队列发送消息"+message);
		this.rabbitTemplate.convertAndSend(RabbitConfig.NOTIFYQUEUE, message);
	}
	
}
