package com.upp.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.upp.baseClass.BaseAction;
import com.upp.dto.Context;
import com.upp.dto.common.InputFundTrans;
import com.upp.exception.UppException;
import com.upp.service.FundCommonService;

/**
 * 通用请求处理类
 * @author Administrator
 *
 */
@Component
public class CommonInputAction extends BaseAction {
	
	@Autowired
	@Qualifier("FundCommonService")
	private FundCommonService fcs;

	@Override
	public void excute(Context context) throws UppException {
		InputFundTrans input = (InputFundTrans) context.getInput();
		//校验上游系统
		fcs.checkUpperSysInfo(input);
		//校验是否是重复交易
		fcs.checkRepeatTrade(input);
		//落总流水表
		fcs.insertOveralltrans(input);
		
	}

}
