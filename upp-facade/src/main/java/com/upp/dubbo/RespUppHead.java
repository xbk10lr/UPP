package com.upp.dubbo;

public class RespUppHead {
	
	//响应状态
	private String respStatus;
	
	//响应信息
	private String respMsg;
	
	//响应码
	private String respCode;

	public String getRespStatus() {
		return respStatus;
	}

	public void setRespStatus(String respStatus) {
		this.respStatus = respStatus;
	}

	public String getRespMsg() {
		return respMsg;
	}

	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}

	public String getRespCode() {
		return respCode;
	}

	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}

	@Override
	public String toString() {
		return "RespUppHead [respStatus=" + respStatus + ", respMsg=" + respMsg + ", respCode=" + respCode
				+ ", getRespStatus()=" + getRespStatus() + ", getRespMsg()=" + getRespMsg() + ", getRespCode()="
				+ getRespCode() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
