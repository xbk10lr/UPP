package com.upp.dto.common;

import com.upp.dto.generate.Fundtrans;
import com.upp.dubbo.fundprocess.ReqFundCollection;

public class InputFundTrans extends Fundtrans {

	public InputFundTrans(ReqFundCollection req) {
		this.setUppersysnbr(req.getUppersysnbr());
		this.setUppertransnbr(req.getUppertransnbr());
		this.setUppertransdate(req.getUppertransdate());
		this.setUppertranstime(req.getUppertranstime());
		this.setPayeracctnbr(req.getPayeracctnbr());
		this.setPayeeacctnbr(req.getPayeeacctnbr());
		this.setPayername(req.getPayeracctname());
		this.setPayeename(req.getPayeeacctname());
		this.setCurrencycd(req.getCurrencycd());
		this.setTransamt(req.getTransamt());
	}
}
