package com.upp.rabbit.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.upp.baseClass.BaseTransport;
import com.upp.dto.model.AsyncNotifyMessage;
import com.upp.rabbit.config.RabbitConfig;
import com.upp.task.AsyncNotifyTask;

@Component
@RabbitListener(queues = RabbitConfig.NOTIFYQUEUE)
public class AsyncNotifyReceiver extends BaseTransport{
	
	@Autowired
	private AsyncNotifyTask task;
	
	@RabbitHandler
    public void process(AsyncNotifyMessage message) {
		log.info("异步通知消息接受者成功接受到消息："+message);
		//异步线程处理
		task.handleNotify(message);
    }
}
