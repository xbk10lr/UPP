package com.upp.dubbo.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.alibaba.dubbo.config.annotation.Service;
import com.upp.baseClass.Action;
import com.upp.dto.Context;
import com.upp.dto.common.InputPlaceOrder;
import com.upp.dubbo.payment.PlaceOrder;
import com.upp.dubbo.payment.ReqPlaceOrder;
import com.upp.dubbo.payment.RespPlaceOrder;
import com.upp.exception.UppExceptionHandler;
import com.upp.util.ValidationHandler;

@Service(version="1.0.0")
public class PlaceOrderImpl implements PlaceOrder {

	@Autowired
	@Qualifier("paymentCollectionAction")
	private Action paymentCollectionAction;
	
	@Autowired
	private UppExceptionHandler exceptionHandler;
	
	@Autowired
	private ValidationHandler validationHandler;
	
	/**
	 * 代收交易payment接口
	 */
	@Override
	public RespPlaceOrder placeOrder(ReqPlaceOrder req){
		Context context = new Context();
		try {
			validationHandler.validate(req);
			InputPlaceOrder input = new InputPlaceOrder(req);
			context.setInput(input);
			paymentCollectionAction.excute(context);
		} catch (Throwable e) {
//			异常处理
			exceptionHandler.handle(e, context);
		}
		RespPlaceOrder rpo = new RespPlaceOrder();
		rpo.setRespCode(context.getRespCode());
		rpo.setRespMsg(context.getRespMsg());
		rpo.setRespStatus(context.getRespStatus());
		return rpo;
	}


}
