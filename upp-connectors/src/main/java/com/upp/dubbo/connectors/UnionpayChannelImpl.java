package com.upp.dubbo.connectors;

import com.alibaba.dubbo.config.annotation.Service;
import com.upp.constant.TransStatus;
import com.upp.constant.UnionpayRespStatus;
import com.upp.dubbo.RespUppHead;

/**
 * 银联通信类
 * @author Administrator
 *
 */
@Service(version = "1.0.0")
public class UnionpayChannelImpl implements UnionpayChannel {
	
	/**
	 * 银联代收
	 * @return
	 */
	public RespUppHead unionDS(ReqUnionPayDs req){
		RespUppHead resp = new RespUppHead();
		resp.setRespCode("000000");
		resp.setRespMsg("交易成功");
		resp.setRespStatus(TransStatus.SUCCESS);
		return resp;
	}
	
	
	/**
	 * 银联查询
	 * @return
	 */
	public RespUnionQuery unionQuery(ReqUnionPayQuery req){
		RespUnionQuery resp = new RespUnionQuery();
		resp.setRespCode("000000");
		resp.setRespMsg("查询成功");
		resp.setRespStatus(UnionpayRespStatus.SUCCESS);
		resp.setOrigRespStatus(UnionpayRespStatus.SUCCESS);
		resp.setOrigRespMsg("原交易成功");
		resp.setOrigRespCode("000000");
		return resp;
	}
}
