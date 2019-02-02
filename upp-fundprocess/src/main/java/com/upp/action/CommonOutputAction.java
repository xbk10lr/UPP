package com.upp.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.upp.baseClass.BaseAction;
import com.upp.dto.Context;
import com.upp.exception.UppException;
import com.upp.service.FundCommonService;

@Component
public class CommonOutputAction extends BaseAction {

	@Autowired
	private FundCommonService fcs;
	
	@Override
	public void excute(Context context) throws UppException {
		//插入总交易流水表
		fcs.updateOveralltransCtx(context);
	}

}