package com.upp.fundchannels;

import org.springframework.stereotype.Component;

import com.upp.baseClass.BaseTransport;
import com.upp.constant.TransStatus;
import com.upp.constant.UnionpayRespStatus;
import com.upp.dto.model.ReqUnionPayDs;
import com.upp.dto.model.ReqUnionPayQuery;
import com.upp.dto.model.RespUnionQuery;
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
		resp.setRespStatus(TransStatus.SUCCESS);
		return resp;
	}
	
	
	/**
	 * 银联代收
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
