package com.upp.service.paygate;

import java.util.TreeMap;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.upp.dto.model.ReqCollection;
import com.upp.dubbo.payment.PlaceOrder;
import com.upp.dubbo.payment.ReqPlaceOrder;
import com.upp.dubbo.payment.RespPlaceOrder;
import com.upp.service.BaseService;
import com.upp.util.SignUtils;
import com.upp.util.UppBeanUtils;

@Service
public class PaygateService extends BaseService{
	
	@Reference(version="1.0.0")
	private PlaceOrder po;
	
	/**
	 * 验签
	 * @param req
	 * @return
	 */
	public Boolean verifySign(ReqCollection req){
		TreeMap<String, Object> tm = new TreeMap<>();
    	UppBeanUtils.transBean2Map(req, tm);
    	String signature = (String) tm.remove("signature");
    	if(!SignUtils.verifySign(tm, "test", signature)){
    		log.error("验签失败");
    		return false;
    	}
		return true;
	}
	
	/**
	 * 交易请求payment
	 * @param req
	 * @return
	 * @throws Exception
	 */
	public RespPlaceOrder toPayment(ReqCollection req) throws Exception{
		ReqPlaceOrder rpo = new ReqPlaceOrder();
    	BeanUtils.copyProperties(req, rpo);
    	RespPlaceOrder resp = po.placeOrder(rpo);
		return resp;
	}
}
