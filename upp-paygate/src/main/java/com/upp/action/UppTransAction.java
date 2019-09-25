package com.upp.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upp.constant.DictErrors;
import com.upp.dto.model.ReqCollection;
import com.upp.dubbo.payment.RespPlaceOrder;
import com.upp.service.PaygateService;
import com.upp.util.MessageUtils;
import com.upp.util.ValidationHandler;

@RestController
@RequestMapping("/trans")
public class UppTransAction {
	private static final Logger log = LoggerFactory.getLogger(UppTransAction.class);
	
	private static final String keyWord = "testKey";
	
	@Autowired
	private PaygateService ps;
	
	//代收交易
    @RequestMapping("/collection")
    public String collection(ReqCollection req) throws Exception {
    	log.debug(">>>>>>>>>>>>>>>>>>paygate receive collection request<<<<<<<<<<<<<<<<<<<<<<");
    	//1、验签
    	if(!ps.verifySign(req,keyWord)){
    		log.error("验签失败");
    		RespPlaceOrder resp = new RespPlaceOrder();
    		String msg = MessageUtils.get(DictErrors.SIGN_ERROR);
    		resp.setRespCode(msg.split(";")[0]);
    		resp.setRespMsg(msg.split(";")[1]);
    		resp.setRespStatus(msg.split(";")[2]);
    		return ps.formatRespMsg(resp, keyWord);
    	}
    	RespPlaceOrder resp = ps.toPayment(req);
    	return ps.formatRespMsg(resp, keyWord);
    }
}
