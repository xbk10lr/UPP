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
import com.upp.dto.Context;
import com.upp.dto.common.InputFundTrans;
import com.upp.dto.generate.Channelrout;
import com.upp.dto.generate.ChannelroutExample;
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
	public String autoChannel(InputFundTrans input) throws UppException {
		BigDecimal transamt = input.getTransamt();
		ChannelroutExample example = new ChannelroutExample();
		example.createCriteria().andLimitamtGreaterThan(transamt);
		List<Channelrout> lists = cm.selectByExample(example);
		if (lists != null && !lists.isEmpty()) {
			if (lists.size() == 1) {
				return lists.get(0).getFundchannelcode();
			} else {
				String fundc = lists.get(0).getFundchannelcode();
				Integer prio = Integer.valueOf(lists.get(0).getPriority());
				for (int i = 1; i < lists.size(); i++) {
					Integer prio2 = Integer.valueOf(lists.get(i).getPriority());
					if ( prio2 > prio) {
						prio = prio2;
						fundc = lists.get(i).getFundchannelcode();
					}
				}
				return fundc;
			}
		} else{
			throw new UppException(DictErrors.AUTO_CHANNEL_ERROR);
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
