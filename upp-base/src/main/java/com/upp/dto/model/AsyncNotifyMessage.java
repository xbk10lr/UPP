package com.upp.dto.model;

public class AsyncNotifyMessage {
	
	public AsyncNotifyMessage(String overalltransnbr, String transstatus, String returncode, String returnmsg) {
		super();
		this.overalltransnbr = overalltransnbr;
		this.transstatus = transstatus;
		this.returncode = returncode;
		this.returnmsg = returnmsg;
	}

	private String overalltransnbr;
	
	private String transstatus;
	
	private String returncode;
	
	private String returnmsg;

	public String getOveralltransnbr() {
		return overalltransnbr;
	}

	public void setOveralltransnbr(String overalltransnbr) {
		this.overalltransnbr = overalltransnbr;
	}

	public String getTransstatus() {
		return transstatus;
	}

	public void setTransstatus(String transstatus) {
		this.transstatus = transstatus;
	}

	public String getReturncode() {
		return returncode;
	}

	public void setReturncode(String returncode) {
		this.returncode = returncode;
	}

	public String getReturnmsg() {
		return returnmsg;
	}

	public void setReturnmsg(String returnmsg) {
		this.returnmsg = returnmsg;
	}
	
	
}
