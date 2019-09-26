package com.upp.dubbo.connectors;

import com.alibaba.dubbo.config.annotation.Service;
import com.upp.constant.EaccountRespStatus;
import com.upp.constant.TransStatus;
import com.upp.dubbo.RespUppHead;

@Service(version = "1.0.0")
public class EaccountChannelImpl implements EaccountChannel {
	
	
	
	/**
	 * 互联网核心入账
	 * @return
	 */
	public RespUppHead eaccountSettle(ReqEaccountRecharge req){
		RespUppHead resp = new RespUppHead();
		resp.setRespCode("000000");
		resp.setRespMsg("交易成功");
		resp.setRespStatus(TransStatus.SUCCESS);
		return resp;
	}
	
	/**
	 * 互联网核心查询
	 * @return
	 */
	public RespEaccountQuery eaccountQuery(ReqEaccountQuery req){
		RespEaccountQuery resp = new RespEaccountQuery();
		resp.setRespCode("000000");
		resp.setRespMsg("查询成功");
		resp.setRespStatus(EaccountRespStatus.SUCCESS);
		resp.setOrigRespStatus(EaccountRespStatus.SUCCESS);
		resp.setOrigRespMsg("原交易成功");
		resp.setOrigRespCode("000000");
		return resp;
	}
}
