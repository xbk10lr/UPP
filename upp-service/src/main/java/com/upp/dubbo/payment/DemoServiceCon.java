package com.upp.dubbo.payment;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.upp.dubbo.fundprocess.DemoService;

@Component
public class DemoServiceCon {
	
	@Reference(version="1.0.0")
	private DemoService ds;
	
	 public void ConService() throws Exception {
		 ds.toProvider();

	  }
}
