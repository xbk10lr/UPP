package com.upp.dubbo.connectors;

import com.upp.dubbo.RespUppHead;

/**
 * 网联通道
 * @author Administrator
 *
 */
public interface NetsunionChannel {
	
	/**
	 * 网联代收
	 * @return
	 */
	public RespUppHead netsDS(ReqNetsUnionDs req);
	
	/**
	 * 网联查询
	 * @return
	 */
	public RespNetsUnionQuery netsQuery(ReqNetsUnionQuery req);
}
