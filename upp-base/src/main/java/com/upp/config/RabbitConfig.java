package com.upp.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitConfig {
	
	/**
	 * 异步通知队列
	 */
	public static final String NOTIFYQUEUE = "asyncNotify";
	
	@Bean
    public Queue asyncNotifyQueue() {
        return new Queue(NOTIFYQUEUE);
    }
}
