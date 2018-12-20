package com.upp.service.payment;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.upp.constant.DateFormatCode;
import com.upp.constant.TransCode;
import com.upp.constant.TransStatus;
import com.upp.constant.UpperSysNbr;
import com.upp.dao.mapper.OnlineorderinfoMapper;
import com.upp.dto.common.InputPlaceOrder;
import com.upp.dubbo.fundprocess.FundCollection;
import com.upp.dubbo.fundprocess.ReqFundCollection;
import com.upp.dubbo.fundprocess.RespFundCollection;
import com.upp.util.DateUtil;
import com.upp.util.UUIDUtil;

@Component
public class PlaceOrderService {
	
	@Autowired
	OnlineorderinfoMapper dao;
	
	@Autowired
	private FundCollection fc;
	
	public void insertOnlineOrderInfo(InputPlaceOrder input){
		input.setTranscode(TransCode.COLLECTION);
		input.setTransseqnbr(DateUtil.Date_To_DateTimeFormat(new Date(), DateFormatCode.DATETIME_FORMATTER3)+UUIDUtil.getUUID());
		input.setTransstatus(TransStatus.INIT);
		dao.insertSelective(input);
	}
	
	
	public RespFundCollection sendFund(InputPlaceOrder input){
		ReqFundCollection rfc = new ReqFundCollection();
		BeanUtils.copyProperties(input, rfc);
		rfc.setUppersysnbr(UpperSysNbr.PAYM);
		rfc.setUppertransdate(new Date());
		rfc.setUppertranstime(new Date());
		rfc.setUppertransnbr(input.getTransseqnbr());
		return fc.fundCollection(rfc);
		
	}
}
