package com.upp.service;

import java.util.TreeMap;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upp.baseClass.BaseService;
import com.upp.dto.common.InputPlaceOrder;
import com.upp.dto.model.ReqCollection;
import com.upp.dubbo.InnerDubboTransport;
import com.upp.dubbo.payment.ReqPlaceOrder;
import com.upp.dubbo.payment.RespPlaceOrder;
import com.upp.util.SignUtils;
import com.upp.util.UppBeanUtils;

@Service
public class PaygateService extends BaseService{
	
	@Autowired
	private InnerDubboTransport idt;
	
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
    	RespPlaceOrder resp = idt.toPayment(rpo); 
		return resp;
	}

}
