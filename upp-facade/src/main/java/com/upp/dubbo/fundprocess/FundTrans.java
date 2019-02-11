package com.upp.dubbo.fundprocess;

/**
 * 资金交易dubbo接口
 * @author Administrator
 *
 */
public interface FundTrans {

	/**
	 * 代收交易
	 * @param req
	 * @return
	 */
	public RespFundCollection fundCollection(ReqFundCollection req);
	
	/**
	 * 充值交易
	 * @param req
	 * @return
	 */
	public RespRecharge recharge(ReqRecharge req);
}
