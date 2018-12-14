package com.upp.service.payment;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.upp.constant.DateFormatCode;
import com.upp.dao.mapper.OnlineorderinfoMapper;
import com.upp.dto.generate.Onlineorderinfo;
import com.upp.dubbo.payment.ReqPlaceOrder;
import com.upp.util.DateUtil;
import com.upp.util.UUIDUtil;

@Component
public class PlaceOrderService {
	
	@Autowired
	OnlineorderinfoMapper dao;
	
	public void insertOnlineOrderInfo(ReqPlaceOrder req){
		Onlineorderinfo record = new Onlineorderinfo();
		BeanUtils.copyProperties(req, record);
		record.setCrtdatetime(new Date());
		record.setTransseqnbr(DateUtil.Date_To_DateTimeFormat(new Date(), DateFormatCode.DATETIME_FORMATTER3)+UUIDUtil.getUUID());
		dao.insertSelective(record);
	}
}
