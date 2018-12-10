package com.upp.dubbo.fundprocess;

import com.alibaba.dubbo.config.annotation.Service;
import com.upp.dubbo.payment.ReqPlaceOrder;
import com.upp.dubbo.payment.RespPlaceOrder;

@Service(version="1.0.0")
public class FundCollectionImpl implements FundCollection {

	@Override
	public RespFundCollection fundCollection(ReqFundCollection req) {
		//路由选路
		
		//资金流水落库、发送下游通道
		
		
		return null;
	}

}
