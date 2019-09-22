package com.upp.dubbo.connectors;

import com.upp.dubbo.RespUppHead;

public interface EaccountChannel {
	
	/**
	 * 互联网核心入账
	 * @return
	 */
	public RespUppHead eaccountSettle(ReqEaccountRecharge req);
	
	/**
	 * 互联网核心查询
	 * @return
	 */
	public RespEaccountQuery eaccountQuery(ReqEaccountQuery req);
}
