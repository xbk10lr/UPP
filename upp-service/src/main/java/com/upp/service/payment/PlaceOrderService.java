package com.upp.service.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.upp.dao.mapper.OnlineorderinfoMapper;

@Component
public class PlaceOrderService {
	
	@Autowired
	OnlineorderinfoMapper dao;
	
	public void insertOnlineOrderInfo(){
		
		
	}
}
