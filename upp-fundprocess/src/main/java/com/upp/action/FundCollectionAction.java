package com.upp.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.upp.baseClass.BaseAction;
import com.upp.constant.TransCode;
import com.upp.dto.Context;
import com.upp.dto.common.InputFundTrans;
import com.upp.dubbo.fundprocess.RespFundCollection;
import com.upp.exception.UppException;
import com.upp.service.FundCollectionService;

/**
 * 代收交易action
 * @author Administrator
 *
 */
@Component
public class FundCollectionAction extends BaseAction {
	
	@Autowired
	private FundCollectionService fcs;
	
	
	@Override
	public void excute(Context context) throws UppException {
		
		InputFundTrans input = (InputFundTrans) context.getInput();
		
		try {
			//路由选路
			String channel = fcs.autoChannel(input);
			input.setFundchannelcode(channel);
			input.setTranscode(TransCode.COLLECTION);
			//落库
			fcs.insertFundtrans(input);
			//发送下游
			RespFundCollection resp = fcs.sendCollection(input, context);
			//更新库表
			fcs.updateFundtrans(resp, input);
			//组装返回context
			fcs.formatrespcontext(context, resp);
		} catch (Exception e) {
			exceptionHandler.handle(e, context);
		}
	}

}
