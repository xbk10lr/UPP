package com.upp.dubbo.payment;

import com.alibaba.dubbo.config.annotation.Service;

@Service(version="1.0.0")
public class PlaceOrderImpl implements PlaceOrder {

	@Override
	public RespPlaceOrder placeOrder(ReqPlaceOrder req) throws Exception {
		
		
		return null;
	}


}
