package com.upp.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upp.constant.DictErrors;
import com.upp.dto.model.ReqCollection;
import com.upp.dubbo.payment.RespPlaceOrder;
import com.upp.service.PaygateService;
import com.upp.util.MessageUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/trans")
public class UppTransAction {
	
	@Value("${paygate.sign.keyWord}")
	private String keyWord;
	
	@Autowired
	private PaygateService ps;
	
	//代收交易
    @RequestMapping("/collection")
    public String collection(ReqCollection req) throws Exception {
    	log.debug(">>>>>>>>>>>>>>>>>>paygate receive collection request<<<<<<<<<<<<<<<<<<<<<<");
    	//1、验签
    	if(!ps.verifySign(req,keyWord)){
    		log.error("验签失败");
    		//验签失败，直接根据错误类型返回错误信息
    		return ps.formatRespMsg(keyWord,DictErrors.SIGN_ERROR);
    	}
    	//2.发送payment
    	RespPlaceOrder resp = ps.toPayment(req);
    	//根据resp返回值组装返回信息
    	return ps.formatRespMsg(resp, keyWord);
    }
    
}
