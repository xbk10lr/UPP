package com.upp.constant;

public enum ExcepInfoEnum {
	
	UnionPayCollectionTimeOut(6,"ExceptionHandleService","unionpayCollectionQuery","银联超时查询"),
	NetsUnionCollectionTimeOut(6,"ExceptionHandleService","netsUnionCollectionQuery","网联超时查询"),
	RechargeCollectionTimeOut(6,"ExceptionHandleService","rechargeCollectionQuery","充值交易第三方代收超时查询"),
	EaccountRechargeTimeOut(6,"ExceptionHandleService","eaccountRechargeQuery","充值交易互联网核心记账查询");

	
	private Integer maxRetryTimes;
	private String excepServiceName;
	private String excepMethodName;
	private String excepDesc;
	
	
	private ExcepInfoEnum(Integer maxRetryTimes,String excepServiceName,String excepMethodName,String excepDesc){
		this.maxRetryTimes=maxRetryTimes;
		this.excepServiceName=excepServiceName;
		this.excepMethodName=excepMethodName;
		this.excepDesc=excepDesc;
	}


	public Integer getMaxRetryTimes() {
		return maxRetryTimes;
	}


	public String getExcepServiceName() {
		return excepServiceName;
	}


	public String getExcepMethodName() {
		return excepMethodName;
	}


	public String getExcepDesc() {
		return excepDesc;
	}

}
