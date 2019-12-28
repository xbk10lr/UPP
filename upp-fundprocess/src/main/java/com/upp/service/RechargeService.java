package com.upp.service;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.upp.constant.ExcepInfoEnum;
import com.upp.constant.TransStatus;
import com.upp.dto.Context;
import com.upp.dto.common.InputFundTrans;
import com.upp.dubbo.connectors.CoreChannel;
import com.upp.dubbo.connectors.ReqCoreRecharge;
import com.upp.dubbo.fundprocess.RespRecharge;
import com.upp.exception.UppException;

/**
 * 充值交易service
 * @author Administrator
 *
 */
@Service("RechargeService")
public class RechargeService extends FundCommonService {

	@Reference(version="1.0.0")
	private CoreChannel ec;

	/**
	 * 请求互联网核心接口
	 * @param input
	 * @param ctx
	 * @return
	 * @throws UppException
	 */
	public RespRecharge sendEaccountRecharge(InputFundTrans input,Context ctx) throws UppException{
		RespRecharge resp = (RespRecharge)ec.coreSettle(new ReqCoreRecharge());
		if(TransStatus.TIMEOUT.equals(resp.getRespStatus())){
			//超时异常处理
			this.insertTransexceptionreg(input, ExcepInfoEnum.EaccountRechargeTimeOut);
		}
		return resp;
	}
	
}
