package com.upp.service.fundprocess;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.upp.constant.FundchannelCode;
import com.upp.dao.mapper.FundtransMapper;
import com.upp.dto.generate.Fundtrans;
import com.upp.dubbo.fundprocess.ReqFundCollection;
import com.upp.service.BaseService;

public class FundCollectionService extends BaseService {
	
	@Autowired
	private FundtransMapper fm;
	
	public String autoChannel(ReqFundCollection req){
		
		return FundchannelCode.UNIONPAY;
	}
	
	
	
	public void insertFundtrans(ReqFundCollection req){
		Fundtrans record = new Fundtrans();
		BeanUtils.copyProperties(req, record);
		fm.insertSelective(record);
		
	}
	
	
}
