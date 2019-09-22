package com.upp.dubbo.connectors;

import com.upp.dubbo.RespUppHead;

/**
 * 银联通信类
 * @author Administrator
 *
 */
public interface UnionpayChannel {
	
	/**
	 * 银联代收
	 * @return
	 */
	public RespUppHead unionDS(ReqUnionPayDs req);
	
	
	/**
	 * 银联查询
	 * @return
	 */
	public RespUnionQuery unionQuery(ReqUnionPayQuery req);
}
