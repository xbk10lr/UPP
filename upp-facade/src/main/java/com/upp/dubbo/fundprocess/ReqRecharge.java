package com.upp.dubbo.fundprocess;

import java.math.BigDecimal;
import java.util.Date;

public class ReqRecharge {

	// 上游系统编号
	private String uppersysnbr;

	// 上游交易流水号
	private String uppertransnbr;

	// 上游交易日期
	private Date uppertransdate;

	// 上游交易时间
	private Date uppertranstime;

	// 付款账户
	private String payeracctnbr;

	// 收款账户
	private String payeeacctnbr;

	// 付款账户性质
	private String payeracctkind;

	// 收款账户性质
	private String payeeacctkind;

	// 收款账户名
	private String payeeacctname;

	// 付款账户名
	private String payeracctname;

	// 付款账户类型
	private String payeraccttypcd;

	// 收款账户类型
	private String payeeaccttypcd;

	// 币种
	private String currencycd;

	// 交易金额
	private BigDecimal transamt;

	public String getPayeracctnbr() {
		return payeracctnbr;
	}

	public void setPayeracctnbr(String payeracctnbr) {
		this.payeracctnbr = payeracctnbr;
	}

	public String getPayeeacctnbr() {
		return payeeacctnbr;
	}

	public void setPayeeacctnbr(String payeeacctnbr) {
		this.payeeacctnbr = payeeacctnbr;
	}

	public String getPayeeacctkind() {
		return payeeacctkind;
	}

	public void setPayeeacctkind(String payeeacctkind) {
		this.payeeacctkind = payeeacctkind;
	}

	public String getPayeeacctname() {
		return payeeacctname;
	}

	public void setPayeeacctname(String payeeacctname) {
		this.payeeacctname = payeeacctname;
	}

	public String getPayeracctname() {
		return payeracctname;
	}

	public void setPayeracctname(String payeracctname) {
		this.payeracctname = payeracctname;
	}

	public String getPayeraccttypcd() {
		return payeraccttypcd;
	}

	public void setPayeraccttypcd(String payeraccttypcd) {
		this.payeraccttypcd = payeraccttypcd;
	}

	public String getPayeeaccttypcd() {
		return payeeaccttypcd;
	}

	public void setPayeeaccttypcd(String payeeaccttypcd) {
		this.payeeaccttypcd = payeeaccttypcd;
	}

	public String getCurrencycd() {
		return currencycd;
	}

	public void setCurrencycd(String currencycd) {
		this.currencycd = currencycd;
	}

	public BigDecimal getTransamt() {
		return transamt;
	}

	public void setTransamt(BigDecimal transamt) {
		this.transamt = transamt;
	}

	public String getUppersysnbr() {
		return uppersysnbr;
	}

	public void setUppersysnbr(String uppersysnbr) {
		this.uppersysnbr = uppersysnbr;
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

	public String getUppertransnbr() {
		return uppertransnbr;
	}

	public void setUppertransnbr(String uppertransnbr) {
		this.uppertransnbr = uppertransnbr;
	}

	@Override
	public String toString() {
		return "ReqFundCollection [uppersysnbr=" + uppersysnbr + ", uppertransnbr=" + uppertransnbr
				+ ", uppertransdate=" + uppertransdate + ", uppertranstime=" + uppertranstime + ", payeracctnbr="
				+ payeracctnbr + ", payeeacctnbr=" + payeeacctnbr + ", payeeacctkind=" + payeeacctkind
				+ ", payeeacctname=" + payeeacctname + ", payeracctname=" + payeracctname + ", payeraccttypcd="
				+ payeraccttypcd + ", payeeaccttypcd=" + payeeaccttypcd + ", currencycd=" + currencycd + ", transamt="
				+ transamt + "]";
	}

	public String getPayeracctkind() {
		return payeracctkind;
	}

	public void setPayeracctkind(String payeracctkind) {
		this.payeracctkind = payeracctkind;
	}

}
