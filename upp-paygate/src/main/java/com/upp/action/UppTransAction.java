package com.upp.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upp.dto.model.ReqCollection;
import com.upp.dubbo.payment.RespPlaceOrder;
import com.upp.service.PaygateService;

@RestController
@RequestMapping("/trans")
public class UppTransAction {
	private static final Logger log = LoggerFactory.getLogger(UppTransAction.class);
	
	@Autowired
	private PaygateService ps;
	
	//代收交易
    @RequestMapping("/collection")
    public String collection(ReqCollection req) throws Exception {
    	log.debug(">>>>>>>>>>>>>>>>>>paygate receive collection request<<<<<<<<<<<<<<<<<<<<<<");
    	//1、验签
    	if(!ps.verifySign(req)){
    		log.error("验签失败");
    		return null;
    	}
    	RespPlaceOrder resp = ps.toPayment(req);
    	
    	
    	return null;
    }
}
