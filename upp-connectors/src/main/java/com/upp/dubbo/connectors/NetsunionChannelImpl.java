package com.upp.dubbo.connectors;

import com.alibaba.dubbo.config.annotation.Service;
import com.upp.constant.UnionpayRespStatus;
import com.upp.dubbo.RespUppHead;

/**
 * 网联通道
 * @author Administrator
 *
 */
@Service(version = "1.0.0")
public class NetsunionChannelImpl implements NetsunionChannel {
	
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
	
	/**
	 * 网联查询
	 * @return
	 */
	public RespNetsUnionQuery netsQuery(ReqNetsUnionQuery req){
		RespNetsUnionQuery resp = new RespNetsUnionQuery();
		resp.setRespCode("000000");
		resp.setRespMsg("查询成功");
		resp.setRespStatus(UnionpayRespStatus.SUCCESS);
		resp.setOrigRespStatus(UnionpayRespStatus.SUCCESS);
		resp.setOrigRespMsg("原交易成功");
		resp.setOrigRespCode("000000");
		return resp;
	}
}
