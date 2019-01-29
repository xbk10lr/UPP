package com.upp.dto.common;

import com.upp.constant.DateFormatCode;
import com.upp.dto.generate.Onlineorderinfo;
import com.upp.dubbo.payment.ReqPlaceOrder;
import com.upp.util.DateUtil;

public class InputPlaceOrder extends Onlineorderinfo {
	public InputPlaceOrder(ReqPlaceOrder req) {
		this.setMernbr(req.getMernbr());
		this.setMerseqnbr(req.getMerseqnbr());
		this.setMertranstime(DateUtil.DateTimeFormat_To_Date(req.getMertranstime(), DateFormatCode.DATETIME_FORMATTER3));
		this.setPayeracctnbr(req.getPayeracctnbr());
		this.setPayeeacctnbr(req.getPayeeacctnbr());
		this.setPayeracctkind(req.getPayeracctkind());
		this.setPayeeacctkind(req.getPayeeacctkind());
		this.setPayeeacctname(req.getPayeeacctname());
		this.setPayeracctname(req.getPayeracctname());
		this.setPayeraccttypcd(req.getPayeraccttypcd());
		this.setCurrencycd(req.getCurrencycd());
		this.setTransamt(req.getTransamt());
	}
}
