package com.upp.service.payment;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.upp.dao.mapper.OnlineorderinfoMapper;
import com.upp.dto.generate.Onlineorderinfo;
import com.upp.dubbo.payment.ReqPlaceOrder;

@Component
public class PlaceOrderService {
	
	@Autowired
	OnlineorderinfoMapper dao;
	
	public void insertOnlineOrderInfo(ReqPlaceOrder req){
		Onlineorderinfo record = new Onlineorderinfo();
		BeanUtils.copyProperties(req, record);
		dao.insertSelective(record);
	}
}
