package com.upp.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.upp.baseClass.BaseService;
import com.upp.constant.ExcepHandleStatus;
import com.upp.constant.ExcepInfoEnum;
import com.upp.constant.TransStatus;
import com.upp.dao.mapper.InnerfundtransMapper;
import com.upp.dao.mapper.OveralltransMapper;
import com.upp.dao.mapper.TransexceptionregMapper;
import com.upp.dto.common.InputFundTrans;
import com.upp.dto.generate.Innerfundtrans;
import com.upp.dto.generate.Overalltrans;
import com.upp.dto.generate.Transexceptionreg;
import com.upp.dubbo.RespUppHead;
import com.upp.dubbo.fundprocess.RespRecharge;
import com.upp.util.SeqNbrFactory;

public class ScheduleCommonService extends BaseService {
	
	@Autowired
	protected InnerfundtransMapper im;

	@Autowired
	protected OveralltransMapper om;

	@Autowired
	protected TransexceptionregMapper tm;
	
	public void insertTransexceptionreg(Transexceptionreg reg,ExcepInfoEnum ex){
		Transexceptionreg record = new Transexceptionreg();
		record.setExceppseqnbr(SeqNbrFactory.getSeqNbrByDate());
		record.setTransdate(reg.getTransdate());
		record.setInnerfundtransnbr(reg.getInnerfundtransnbr());
		record.setOveralltransnbr(reg.getOveralltransnbr());
		record.setFundchannelcode(reg.getFundchannelcode());
		record.setRetrytimes(0);
		record.setMaxretrytimes(ex.getMaxRetryTimes());
		record.setExcepdesc(ex.getExcepDesc());
		record.setExcepmethodname(ex.getExcepMethodName());
		record.setExcepservicename(ex.getExcepServiceName());
		record.setHandlestatus(ExcepHandleStatus.PRE);
		tm.insertSelective(record);
	}
	
	
	public void insertFundtrans(InputFundTrans input,Overalltrans over) {
		input.setTranstime(over.getTranstime());
		input.setOveralltransnbr(over.getOveralltransnbr());
		input.setCleardate(over.getCleardate());
		input.setPayeracctnbr(over.getPayeracctnbr());
		input.setPayername(over.getPayername());
		input.setPayeeacctnbr(over.getPayeeacctnbr());
		input.setPayeename(over.getPayeename());
		input.setTransamt(over.getTransamt());
		input.setTransdate(over.getTransdate());
		input.setCurrencycd(over.getCurrencycd());
		this.insertFundtrans(input);
	}

	/**
	 * 插入资金流水表
	 * 
	 * @param req
	 */
	public void insertFundtrans(InputFundTrans input) {
		input.setInnerfundtransnbr(SeqNbrFactory.getSeqNbrByDate());
		input.setTransstatus(TransStatus.INIT);
		Innerfundtrans inner = new Innerfundtrans();
		inner.setOveralltransnbr(input.getOveralltransnbr());
		inner.setFundchannelcode(input.getFundchannelcode());
		inner.setTranstime(input.getTranstime());
		inner.setCleardate(input.getCleardate());
		inner.setTranscode(input.getTranscode());
		inner.setPayeracctnbr(input.getPayeracctnbr());
		inner.setPayername(input.getPayername());
		inner.setPayeeacctnbr(input.getPayeeacctnbr());
		inner.setPayeename(input.getPayeename());
		inner.setOrigfundtransnbr(input.getOrigfundtransnbr());
		inner.setCurrencycd(input.getCurrencycd());
		inner.setTransamt(input.getTransamt());
		inner.setFeeamt(input.getFeeamt());
		inner.setInnerfundtransnbr(input.getInnerfundtransnbr());
		inner.setTransdate(input.getTransdate());
		im.insertSelective(input);
	}
	
	
	/**
	 * 更新资金流水表
	 * 
	 * @param req
	 */
	public void updateFundtrans(RespUppHead resp, InputFundTrans input) {
		Innerfundtrans record = new Innerfundtrans();
		record.setInnerfundtransnbr(input.getInnerfundtransnbr());
		record.setTransdate(input.getTransdate());
		record.setTransstatus(resp.getRespStatus());
		record.setReturncode(resp.getRespCode());
		record.setReturnmsg(resp.getRespMsg());
		record.setDownsysnbr(resp.getDownsysnbr());
		record.setDowntransdate(resp.getDowntransdate());
		record.setDowntransnbr(resp.getDowntransnbr());
		record.setDowntranstime(resp.getDowntranstime());
		im.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 更新总交易流水表
	 */
	public void updateOveralltrans(Transexceptionreg ex, RespRecharge resp) {
		Overalltrans over = new Overalltrans();
		over.setReturncode(resp.getRespCode());
		over.setReturnmsg(resp.getRespMsg());
		over.setTransstatus(resp.getRespStatus());
		over.setOveralltransnbr(ex.getOveralltransnbr());
		over.setTransdate(ex.getTransdate());
		om.updateByPrimaryKeySelective(over);
	}
}
