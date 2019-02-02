package com.upp.fundchannels;

import org.springframework.stereotype.Component;

import com.upp.baseClass.BaseTransport;
import com.upp.dto.model.ReqNetsUnionDs;
import com.upp.dubbo.RespUppHead;

/**
 * 网联通道
 * @author Administrator
 *
 */
@Component
public class NetsunionTransport extends BaseTransport {
	
	/**
	 * 网联代收
	 * @return
	 */
	public RespUppHead netsDS(ReqNetsUnionDs req){
		RespUppHead resp = new RespUppHead();
		resp.setRespCode("000000");
		resp.setRespMsg("交易成功");
		return resp;
	}
}
