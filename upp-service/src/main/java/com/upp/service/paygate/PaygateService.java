package com.upp.service.paygate;

import java.util.TreeMap;

import org.springframework.stereotype.Service;

import com.upp.dto.model.ReqCollection;
import com.upp.service.BaseService;
import com.upp.util.SignUtils;
import com.upp.util.UppBeanUtils;

@Service
public class PaygateService extends BaseService{
	
	
	
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
}
