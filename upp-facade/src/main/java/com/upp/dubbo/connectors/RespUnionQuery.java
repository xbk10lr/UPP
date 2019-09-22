package com.upp.dubbo.connectors;

import com.upp.dubbo.RespUppHead;

public class RespUnionQuery extends RespUppHead{
	
	private String origRespStatus;
	
	private String origRespMsg;
	
	private String origRespCode;

	public String getOrigRespStatus() {
		return origRespStatus;
	}

	public void setOrigRespStatus(String origRespStatus) {
		this.origRespStatus = origRespStatus;
	}

	public String getOrigRespMsg() {
		return origRespMsg;
	}

	public void setOrigRespMsg(String origRespMsg) {
		this.origRespMsg = origRespMsg;
	}

	public String getOrigRespCode() {
		return origRespCode;
	}

	public void setOrigRespCode(String origRespCode) {
		this.origRespCode = origRespCode;
	}
}
