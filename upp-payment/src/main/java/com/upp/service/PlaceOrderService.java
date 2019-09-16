package com.upp.service;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.upp.baseClass.BaseService;
import com.upp.constant.DateFormatCode;
import com.upp.constant.DictErrors;
import com.upp.constant.TransCode;
import com.upp.constant.TransStatus;
import com.upp.constant.SysNbr;
import com.upp.dao.mapper.OnlineorderinfoMapper;
import com.upp.dto.Context;
import com.upp.dto.common.InputPlaceOrder;
import com.upp.dto.generate.Onlineorderinfo;
import com.upp.dubbo.InnerDubboTransport;
import com.upp.dubbo.fundprocess.ReqFundCollection;
import com.upp.dubbo.fundprocess.RespFundCollection;
import com.upp.exception.UppException;
import com.upp.util.DateUtil;
import com.upp.util.UUIDUtil;

@Component
public class PlaceOrderService extends BaseService{
	
	@Autowired
	OnlineorderinfoMapper dao;
	
	@Autowired
	private InnerDubboTransport idt;
	
	/**
	 * 插入订单表
	 * @param input
	 */
	public void insertOnlineOrderInfo(InputPlaceOrder input){
		input.setTranscode(TransCode.COLLECTION);
		input.setTransseqnbr(seqNbrFactory.getSnowFlakeSeqNbr());
		input.setTransstatus(TransStatus.INIT);
		input.setTransdate(new Date());
		dao.insertSelective(input);
	}
	
	/**
	 * 更新订单表
	 * @param input
	 * @param ctx
	 */
	public void updateOnlineOrderInfo(InputPlaceOrder input, Context ctx){
		Onlineorderinfo record = new Onlineorderinfo();
		record.setRespcode(ctx.getRespCode());
		record.setRespmsg(ctx.getRespMsg());
		record.setTransstatus(ctx.getRespStatus());
		record.setTransseqnbr(input.getTransseqnbr());
		record.setTransdate(input.getTransdate());
		record.setDownsystransnbr(ctx.getOveralltransnbr());
		dao.updateByPrimaryKeySelective(input);
	}
	
	/**
	 * 代收交易发送fund处理
	 * @param input
	 * @return
	 * @throws UppException 
	 */
	public void sendFund(InputPlaceOrder input,Context ctx) throws UppException{
		ReqFundCollection rfc = new ReqFundCollection();
		BeanUtils.copyProperties(input, rfc);
		rfc.setUppersysnbr(SysNbr.PAYM);
		rfc.setUppertransdate(new Date());
		rfc.setUppertranstime(new Date());
		rfc.setUppertransnbr(input.getTransseqnbr());
		try{
			RespFundCollection resp = idt.sendFund(rfc);
			ctx.setRespCode(resp.getRespCode());
			ctx.setRespMsg(resp.getRespMsg());
			ctx.setRespStatus(resp.getRespStatus());
			ctx.setOveralltransnbr(resp.getDowntransnbr());
		} catch(Throwable e){
			throw new UppException(DictErrors.TIMEOUT);
		}
		
	}
}
