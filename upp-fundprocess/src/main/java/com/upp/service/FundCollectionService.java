package com.upp.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.upp.constant.DictErrors;
import com.upp.constant.ExcepInfoEnum;
import com.upp.constant.FundchannelCode;
import com.upp.constant.TransCode;
import com.upp.constant.TransStatus;
import com.upp.constant.TransType;
import com.upp.dto.Context;
import com.upp.dto.common.InputFundTrans;
import com.upp.dto.generate.Channelbanklimit;
import com.upp.dubbo.connectors.NetsunionChannel;
import com.upp.dubbo.connectors.ReqNetsUnionDs;
import com.upp.dubbo.connectors.ReqUnionPayDs;
import com.upp.dubbo.connectors.UnionpayChannel;
import com.upp.dubbo.fundprocess.RespFundCollection;
import com.upp.exception.UppException;

/**
 * 代收交易service
 * @author Administrator
 *
 */
@Service("FundCollectionService")
public class FundCollectionService extends FundCommonService {

	@Reference(version="1.0.0")
	private UnionpayChannel uc;
	
	@Reference(version="1.0.0")
	private NetsunionChannel nc;

	/**
	 * 根据限额、优先级，获取最合适的路由
	 * @param req
	 * @return
	 * @throws UppException 
	 */
	public Channelbanklimit autoChannel(InputFundTrans input) throws UppException {
		String bankcode = input.getBankcode();
		BigDecimal transamt = input.getTransamt();
		//根据支持银行、交易金额、交易类型三个类别选出所有支持的通道
		List<Channelbanklimit> cbls = cbm.selectSupportBankLimit(bankcode,transamt,TransType.DS);
		if(cbls == null || cbls.isEmpty()){
			//若没有选出合适的通道，抛出 AUTOCHANNELERROR-没有合适的通道 异常
			throw new UppException(DictErrors.AUTO_CHANNEL_ERROR);
		} else {
			return cbls.get(0);
		}
	}
	
	
	public RespFundCollection sendCollection(InputFundTrans input,Context ctx) throws UppException{
		String fundchannelcode = input.getFundchannelcode();
		RespFundCollection resp = null;
		if(FundchannelCode.UNIONPAY.equals(fundchannelcode)){
			//资金流水落库、发送下游通道
			resp = (RespFundCollection) uc.unionDS(new ReqUnionPayDs());
			if(TransStatus.TIMEOUT.equals(resp.getRespStatus())){
				if(TransCode.COLLECTION.equals(input.getOveralltranstyp())){
					this.insertTransexceptionreg(input, ExcepInfoEnum.UnionPayCollectionTimeOut);
				} else if(TransCode.RECHARGE.equals(input.getOveralltranstyp())){
					this.insertTransexceptionreg(input, ExcepInfoEnum.RechargeCollectionTimeOut);
				}
			}
		} else if(FundchannelCode.NETSUNION.equals(fundchannelcode)){
			//资金流水落库、发送下游通道
			resp = (RespFundCollection) nc.netsDS(new ReqNetsUnionDs());
			if(TransStatus.TIMEOUT.equals(resp.getRespStatus())){
				this.insertTransexceptionreg(input, ExcepInfoEnum.NetsUnionCollectionTimeOut);
			} else if(TransCode.RECHARGE.equals(input.getOveralltranstyp())){
				this.insertTransexceptionreg(input, ExcepInfoEnum.RechargeCollectionTimeOut);
			}
		} else {
			throw new UppException(DictErrors.AUTO_CHANNEL_ERROR);
		}
		return resp;
	}
	
}
