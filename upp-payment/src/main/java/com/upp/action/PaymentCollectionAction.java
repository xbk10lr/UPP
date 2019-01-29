package com.upp.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.upp.baseClass.BaseAction;
import com.upp.dto.Context;
import com.upp.dto.common.InputPlaceOrder;
import com.upp.exception.UppException;
import com.upp.exception.UppExceptionHandler;
import com.upp.service.PlaceOrderService;

/**
 * 代收交易action类
 * @author Administrator
 *
 */
@Component("paymentCollectionAction")
public class PaymentCollectionAction extends BaseAction{

	@Autowired
	private PlaceOrderService pos;
	
//	@Autowired
//	private UppExceptionHandler exceptionHandler;

	@Override
	public void excute(Context context) throws UppException {
		InputPlaceOrder input = (InputPlaceOrder) context.getInput();
		//订单落库
		pos.insertOnlineOrderInfo(input);
		try{
			//订单发送
			pos.sendFund(input,context);
		} catch(Throwable e){
			//异常处理
			exceptionHandler.handle(e, context);
		}
		//订单更新
		pos.updateOnlineOrderInfo(input,context);
		
	}


}
