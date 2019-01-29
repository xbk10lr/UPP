package com.upp.dubbo.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.alibaba.dubbo.config.annotation.Service;
import com.upp.baseClass.Action;
import com.upp.dto.Context;
import com.upp.dto.common.InputPlaceOrder;
import com.upp.exception.UppExceptionHandler;

@Service(version="1.0.0")
public class PlaceOrderImpl implements PlaceOrder {

	@Autowired
	@Qualifier("paymentCollectionAction")
	private Action paymentCollectionAction;
	
	@Autowired
	private UppExceptionHandler exceptionHandler;
	
	/**
	 * 代收交易payment接口
	 */
	@Override
	public RespPlaceOrder placeOrder(ReqPlaceOrder req){
		InputPlaceOrder input = new InputPlaceOrder(req);
		Context context = new Context();
		context.setInput(input);
		try {
			paymentCollectionAction.excute(context);
		} catch (Throwable e) {
//			异常处理
			exceptionHandler.handle(e, context);
		}
		RespPlaceOrder rpo = new RespPlaceOrder();
		rpo.setRespCode(context.getRespCode());
		rpo.setRespMsg(context.getRespMsg());
		rpo.setRespStatus(context.getRespStatus());
		rpo.setDowntransnbr(input.getTransseqnbr());
		return rpo;
	}


}
