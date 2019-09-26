package com.upp.dto;

import java.util.HashMap;
import java.util.List;

import com.upp.baseClass.Action;

public class Context extends HashMap<String, Object>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5941515236574120872L;
	
	/**
	 * action任务集合
	 */
	private List<Action> actions;
	
	/**
	 * 输入类
	 */
	private Object input;
	
	/**
	 * 总交易流水号
	 */
	private String overalltransnbr;
	
	//响应状态
	private String respStatus;
	
	//响应信息
	private String respMsg;
	
	//响应码
	private String respCode;
	
	private String fundchannelcode;

	public String getFundchannelcode() {
		return fundchannelcode;
	}

	public void setFundchannelcode(String fundchannelcode) {
		this.fundchannelcode = fundchannelcode;
	}

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

	public Object getInput() {
		return input;
	}

	public void setInput(Object input) {
		this.input = input;
	}

	public List<Action> getActions() {
		return actions;
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}

	public String getOveralltransnbr() {
		return overalltransnbr;
	}

	public void setOveralltransnbr(String overalltransnbr) {
		this.overalltransnbr = overalltransnbr;
	}


}
