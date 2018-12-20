package com.upp.dubbo.fundprocess;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.upp.dto.common.InputFundTrans;
import com.upp.exception.UppException;
import com.upp.service.fundprocess.FundCollectionService;

@Service(version="1.0.0")
public class FundCollectionImpl implements FundCollection {

	private static final Log log = LogFactory.getLog(FundCollectionImpl.class);
	
	@Autowired
	private FundCollectionService fcs;
	
	@Override
	public RespFundCollection fundCollection(ReqFundCollection req) {
		InputFundTrans input = new InputFundTrans(req); 
		try {
			//路由选路
			String channel = fcs.autoChannel(input);
			input.setFundchannelcode(channel);
			//资金流水落库、发送下游通道
			fcs.send(input);
		} catch (Exception e) {
			log.error(e.getMessage(),e);
		}
		
		
		return null;
	}

}
