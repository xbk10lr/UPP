package com.upp.dubbo.payment;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.upp.service.payment.PlaceOrderService;

@Service(version="1.0.0")
public class PlaceOrderImpl implements PlaceOrder {

	@Autowired
	private PlaceOrderService pos;
	
	@Override
	public RespPlaceOrder placeOrder(ReqPlaceOrder req){
		//落订单表
		pos.insertOnlineOrderInfo(req);
		
		return null;
	}


}
