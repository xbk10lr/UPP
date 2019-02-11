package com.upp.action;

import org.springframework.stereotype.Component;

import com.upp.baseClass.BaseAction;
import com.upp.constant.DictErrors;
import com.upp.constant.TransStatus;
import com.upp.dto.Context;
import com.upp.exception.UppException;

/**
 * 检查交易是否失败action
 * @author Administrator
 *
 */
@Component
public class TransCheckAction extends BaseAction {
	
	@Override
	public void excute(Context context) throws UppException {
		if(!TransStatus.SUCCESS.equals(context.getRespStatus())){
			//如果上一步交易没有成功，则抛出异常，中断交易
			throw new UppException(DictErrors.TRANS_EXCEPTION,context.getRespMsg());
		}
	}

}
