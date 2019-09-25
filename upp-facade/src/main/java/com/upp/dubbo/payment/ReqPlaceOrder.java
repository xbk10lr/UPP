package com.upp.dubbo.payment;

import java.math.BigDecimal;

import org.hibernate.validator.constraints.NotEmpty;

public class ReqPlaceOrder {
	//商户号
	@NotEmpty(message="mernbr不能为空")
	private String mernbr;
	
	//商户交易流水号
	@NotEmpty(message="merseqnbr不能为空")
	private String merseqnbr;
	
	//商户交易时间
	@NotEmpty(message="mertranstime不能为空")
	private String mertranstime;
	
	//付款账户
	@NotEmpty(message="payeracctnbr不能为空")
	private String payeracctnbr;
	
	//收款账户
	private String payeeacctnbr;
	
	//付款账户性质
	private String payeracctkind;
	
	//收款账户性质
	private String payeeacctkind;
	
	//收款账户名
	private String payeeacctname;
	
	//付款账户名
	@NotEmpty(message="payeracctname不能为空")
	private String payeracctname;
	
	//付款账户类型
	private String payeraccttypcd;
	
	//收款账户类型
	private String payeeaccttypcd;
	
	//币种
	private String currencycd;
	
	//交易金额
	@NotEmpty(message="transamt不能为空")
	private BigDecimal transamt;

	public String getMernbr() {
		return mernbr;
	}

	public void setMernbr(String mernbr) {
		this.mernbr = mernbr;
	}

	public String getMerseqnbr() {
		return merseqnbr;
	}

	public void setMerseqnbr(String merseqnbr) {
		this.merseqnbr = merseqnbr;
	}

	public String getMertranstime() {
		return mertranstime;
	}

	public void setMertranstime(String mertranstime) {
		this.mertranstime = mertranstime;
	}

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

	public String getPayeracctkind() {
		return payeracctkind;
	}

	public void setPayeracctkind(String payeracctkind) {
		this.payeracctkind = payeracctkind;
	}

	@Override
	public String toString() {
		return "ReqPlaceOrder [mernbr=" + mernbr + ", merseqnbr=" + merseqnbr + ", mertranstime=" + mertranstime
				+ ", payeracctnbr=" + payeracctnbr + ", payeeacctnbr=" + payeeacctnbr + ", payeracctkind="
				+ payeracctkind + ", payeeacctkind=" + payeeacctkind + ", payeeacctname=" + payeeacctname
				+ ", payeracctname=" + payeracctname + ", payeraccttypcd=" + payeraccttypcd + ", payeeaccttypcd="
				+ payeeaccttypcd + ", currencycd=" + currencycd + ", transamt=" + transamt + "]";
	}
}
