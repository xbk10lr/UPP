package com.upp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upp.dto.Context;
import com.upp.dto.common.InputFundTrans;
import com.upp.dto.model.ReqEaccountRecharge;
import com.upp.dubbo.fundprocess.RespRecharge;
import com.upp.exception.UppException;
import com.upp.fundchannels.EaccountTransport;

/**
 * 充值交易service
 * @author Administrator
 *
 */
@Service
public class RechargeService extends FundCommonService {

	@Autowired
	private EaccountTransport et;

	/**
	 * 请求互联网核心接口
	 * @param input
	 * @param ctx
	 * @return
	 * @throws UppException
	 */
	public RespRecharge sendEaccountRecharge(InputFundTrans input,Context ctx) throws UppException{
		RespRecharge resp = (RespRecharge)et.eaccountSettle(new ReqEaccountRecharge());
		return resp;
	}
	
}
