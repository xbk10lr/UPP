package com.upp.constant;

public enum ExcepInfoEnum {
	
	UnionPayTimeOut(6,"ExceptionHandleService","unionpayCollectionQuery","银联超时查询"),
	NetsUnionTimeOut(6,"ExceptionHandleService","netsUnionCollectionQuery","网联超时查询");
	
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
