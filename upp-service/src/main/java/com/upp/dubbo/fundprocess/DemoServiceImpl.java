package com.upp.dubbo.fundprocess;

import com.alibaba.dubbo.config.annotation.Service;

@Service(version="1.0.0")
public class DemoServiceImpl implements DemoService {

	@Override
	public void toProvider() throws Exception {
	    System.out.println("恭喜你连接成功");
	}

}
