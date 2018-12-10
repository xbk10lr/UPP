package com.upp.collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.upp.dto.model.ReqCollection;
import com.upp.dubbo.payment.PlaceOrder;
import com.upp.dubbo.payment.ReqPlaceOrder;
import com.upp.dubbo.payment.RespPlaceOrder;
import com.upp.service.paygate.PaygateService;

@RestController
@RequestMapping("/trans")
public class UppTransController {
	private static final Logger log = LoggerFactory.getLogger(UppTransController.class);
	
	@Autowired
	private PaygateService ps;
	
    @RequestMapping("/collection")
    public String collection(ReqCollection req) throws Exception {
    	log.debug(">>>>>>>>>>>>>>>>>>paygate receive collection request<<<<<<<<<<<<<<<<<<<<<<");
    	if(!ps.verifySign(req)){
    		log.error("验签失败");
    		return null;
    	}
    	RespPlaceOrder resp = ps.toPayment(req);
    	
    	
    	return null;
    }
}
