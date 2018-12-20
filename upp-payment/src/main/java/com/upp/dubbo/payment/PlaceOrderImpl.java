package com.upp.dubbo.payment;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.upp.dto.common.InputPlaceOrder;
import com.upp.dubbo.fundprocess.RespFundCollection;
import com.upp.service.payment.PlaceOrderService;

@Service(version="1.0.0")
public class PlaceOrderImpl implements PlaceOrder {

	@Autowired
	private PlaceOrderService pos;
	
	
	
	@Override
	public RespPlaceOrder placeOrder(ReqPlaceOrder req){
		InputPlaceOrder input = new InputPlaceOrder(req);
		
		//落订单表
		pos.insertOnlineOrderInfo(input);
		
		RespFundCollection sendFund = pos.sendFund(input);
		RespPlaceOrder rpo = new RespPlaceOrder();
		BeanUtils.copyProperties(sendFund, rpo);
		return rpo;
	}


}
