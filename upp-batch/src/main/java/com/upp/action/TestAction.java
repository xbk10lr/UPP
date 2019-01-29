package com.upp.action;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestAction {
	private int count=0;

    @Scheduled(cron="*/6 * * * * ?")
    private void process(){
        System.out.println("this is scheduler task runing  "+(count++));
    }
    
    @Scheduled(cron="*/6 * * * * ?")
    private void process2(){
        System.out.println("this is scheduler task runing 2 "+(count++));
    }
}
