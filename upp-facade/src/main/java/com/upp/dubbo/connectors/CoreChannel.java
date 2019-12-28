package com.upp.dubbo.connectors;

import com.upp.dubbo.RespUppHead;

public interface CoreChannel {
	
	/**
	 * 核心入账
	 * @return
	 */
	public RespUppHead coreSettle(ReqCoreRecharge req);
	
	/**
	 * 核心查询
	 * @return
	 */
	public RespCoreQuery coreQuery(ReqCoreQuery req);
}
