package com.upp.dto.common;

import java.util.Date;

import com.upp.dto.generate.Innerfundtrans;
import com.upp.dto.generate.Transexceptionreg;
import com.upp.dubbo.fundprocess.ReqFundCollection;
import com.upp.dubbo.fundprocess.ReqRecharge;

public class InputFundTrans extends Innerfundtrans {
	
	public InputFundTrans(){
		super();
	}
	
	
	public InputFundTrans(ReqFundCollection req) {
		super();
		this.setPayeracctnbr(req.getPayeracctnbr());
		this.setPayeeacctnbr(req.getPayeeacctnbr());
		this.setPayername(req.getPayeracctname());
		this.setPayeename(req.getPayeeacctname());
		this.setCurrencycd(req.getCurrencycd());
		this.setTransamt(req.getTransamt());
		this.setUppersysnbr(req.getUppersysnbr());
		this.setUppertransnbr(req.getUppertransnbr());
		this.setUppertransdate(req.getUppertransdate());
		this.setUppertranstime(req.getUppertranstime());
	}
	
	public InputFundTrans(ReqRecharge req) {
		super();
		this.setPayeracctnbr(req.getPayeracctnbr());
		this.setPayeeacctnbr(req.getPayeeacctnbr());
		this.setPayername(req.getPayeracctname());
		this.setPayeename(req.getPayeeacctname());
		this.setCurrencycd(req.getCurrencycd());
		this.setTransamt(req.getTransamt());
		this.setUppersysnbr(req.getUppersysnbr());
		this.setUppertransnbr(req.getUppertransnbr());
		this.setUppertransdate(req.getUppertransdate());
		this.setUppertranstime(req.getUppertranstime());
	}
	
	private String overalltransnbr;
	
	private String overalltranstyp;
	
	// 上游系统编号
	private String uppersysnbr;

	// 上游交易流水号
	private String uppertransnbr;

	// 上游交易日期
	private Date uppertransdate;

	// 上游交易时间
	private Date uppertranstime;
	
	private String checkdataflag;

	public String getOveralltransnbr() {
		return overalltransnbr;
	}

	public void setOveralltransnbr(String overalltransnbr) {
		this.overalltransnbr = overalltransnbr;
	}

	public String getUppersysnbr() {
		return uppersysnbr;
	}

	public void setUppersysnbr(String uppersysnbr) {
		this.uppersysnbr = uppersysnbr;
	}

	public String getUppertransnbr() {
		return uppertransnbr;
	}

	public void setUppertransnbr(String uppertransnbr) {
		this.uppertransnbr = uppertransnbr;
	}

	public Date getUppertransdate() {
		return uppertransdate;
	}

	public void setUppertransdate(Date uppertransdate) {
		this.uppertransdate = uppertransdate;
	}

	public Date getUppertranstime() {
		return uppertranstime;
	}

	public void setUppertranstime(Date uppertranstime) {
		this.uppertranstime = uppertranstime;
	}

	public String getOveralltranstyp() {
		return overalltranstyp;
	}

	public void setOveralltranstyp(String overalltranstyp) {
		this.overalltranstyp = overalltranstyp;
	}

	public String getCheckdataflag() {
		return checkdataflag;
	}

	public void setCheckdataflag(String checkdataflag) {
		this.checkdataflag = checkdataflag;
	} 
	
	
}
