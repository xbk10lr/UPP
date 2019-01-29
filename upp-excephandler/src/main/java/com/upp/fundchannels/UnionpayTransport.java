package com.upp.fundchannels;

import org.springframework.stereotype.Component;

import com.upp.baseClass.BaseTransport;
import com.upp.dto.model.ReqUnionPayDs;
import com.upp.dubbo.RespUppHead;

@Component
public class UnionpayTransport extends BaseTransport {
	
	/**
	 * 银联代收
	 * @return
	 */
	public RespUppHead unionDS(ReqUnionPayDs req){
		RespUppHead resp = new RespUppHead();
		resp.setRespCode("000000");
		resp.setRespMsg("交易成功");
		return resp;
	}
}
