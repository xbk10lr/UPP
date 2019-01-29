package com.upp.dubbo;

import java.util.Date;

public class RespUppHead {
	
	//交易流水号
	private String downtransnbr;
	
	//响应状态
	private String respStatus;
	
	//响应信息
	private String respMsg;
	
	//响应码
	private String respCode;
	
	//交易日期
	private Date downtransdate;
	
	//交易时间
    private Date downtranstime;

    //系统编号
    private String downsysnbr;

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

	public String getDowntransnbr() {
		return downtransnbr;
	}

	public void setDowntransnbr(String downtransnbr) {
		this.downtransnbr = downtransnbr;
	}

	public Date getDowntransdate() {
		return downtransdate;
	}

	public void setDowntransdate(Date downtransdate) {
		this.downtransdate = downtransdate;
	}

	public Date getDowntranstime() {
		return downtranstime;
	}

	public void setDowntranstime(Date downtranstime) {
		this.downtranstime = downtranstime;
	}

	public String getDownsysnbr() {
		return downsysnbr;
	}

	public void setDownsysnbr(String downsysnbr) {
		this.downsysnbr = downsysnbr;
	}
	
	
}
