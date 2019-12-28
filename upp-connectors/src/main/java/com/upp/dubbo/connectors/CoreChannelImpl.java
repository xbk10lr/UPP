package com.upp.dubbo.connectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.alibaba.dubbo.config.annotation.Service;
import com.upp.constant.EaccountRespStatus;
import com.upp.constant.TransStatus;
import com.upp.dubbo.RespUppHead;
import com.upp.service.SendService;

@Service(version = "1.0.0")
public class CoreChannelImpl implements CoreChannel {
	
	@Autowired
	@Qualifier("CoreService")
	private SendService sendService;
	
	/**
	 * 核心入账
	 * @return
	 */
	public RespUppHead coreSettle(ReqCoreRecharge req){
		
		RespUppHead resp = new RespUppHead();
		resp.setRespCode("000000");
		resp.setRespMsg("交易成功");
		resp.setRespStatus(TransStatus.SUCCESS);
		return resp;
	}
	
	/**
	 * 核心查询
	 * @return
	 */
	public RespCoreQuery coreQuery(ReqCoreQuery req){
		RespCoreQuery resp = new RespCoreQuery();
		resp.setRespCode("000000");
		resp.setRespMsg("查询成功");
		resp.setRespStatus(EaccountRespStatus.SUCCESS);
		resp.setOrigRespStatus(EaccountRespStatus.SUCCESS);
		resp.setOrigRespMsg("原交易成功");
		resp.setOrigRespCode("000000");
		return resp;
	}
}
