package com.upp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.upp.constant.EaccountRespStatus;
import com.upp.constant.ExcepInfoEnum;
import com.upp.constant.FundchannelCode;
import com.upp.constant.NetsUnionRespStatus;
import com.upp.constant.TransCode;
import com.upp.constant.TransStatus;
import com.upp.constant.UnionpayRespStatus;
import com.upp.dto.common.InputFundTrans;
import com.upp.dto.generate.Innerfundtrans;
import com.upp.dto.generate.Overalltrans;
import com.upp.dto.generate.OveralltransKey;
import com.upp.dto.generate.Transexceptionreg;
import com.upp.dto.model.AsyncNotifyMessage;
import com.upp.dubbo.connectors.EaccountChannel;
import com.upp.dubbo.connectors.NetsunionChannel;
import com.upp.dubbo.connectors.ReqEaccountQuery;
import com.upp.dubbo.connectors.ReqEaccountRecharge;
import com.upp.dubbo.connectors.ReqNetsUnionQuery;
import com.upp.dubbo.connectors.ReqUnionPayQuery;
import com.upp.dubbo.connectors.RespEaccountQuery;
import com.upp.dubbo.connectors.RespNetsUnionQuery;
import com.upp.dubbo.connectors.RespUnionQuery;
import com.upp.dubbo.connectors.UnionpayChannel;
import com.upp.dubbo.fundprocess.RespRecharge;
import com.upp.exception.UppException;
import com.upp.rabbit.sender.AsyncNotifySender;

/**
 * 日间交易异常处理服务类
 * @author Administrator
 *
 */
@Component("exceptionHandleService")
public class ExceptionHandleService extends ScheduleCommonService{
	
	@Reference(version="1.0.0")
	private UnionpayChannel uc;
	
	@Reference(version="1.0.0")
	private NetsunionChannel nc;
	
	@Reference(version="1.0.0")
	private EaccountChannel ec;
	
	@Autowired
	private AsyncNotifySender ans;
	
	/**
	 * 银联代收超时查询
	 * @param ex
	 * @throws UppException 
	 */
	public void unionpayCollectionQuery(Transexceptionreg ex) throws UppException{
		log.info("银联代收超时查询开始");
		String innertransnbr = ex.getInnerfundtransnbr();
		ReqUnionPayQuery req = new ReqUnionPayQuery();
		req.setOrigInnertransnbr(innertransnbr);
		RespUnionQuery resp = uc.unionQuery(req);
		if(UnionpayRespStatus.SUCCESS.equals(resp.getRespStatus())){
			Innerfundtrans record = new Innerfundtrans();
			record.setInnerfundtransnbr(innertransnbr);
			record.setTransdate(ex.getTransdate());
			record.setReturncode(resp.getOrigRespCode());
			record.setReturnmsg(resp.getOrigRespMsg());
			Overalltrans over = new Overalltrans();
			over.setOveralltransnbr(ex.getOveralltransnbr());
			over.setTransdate(ex.getTransdate());
			over.setReturnmsg(resp.getOrigRespMsg());
			if(UnionpayRespStatus.SUCCESS.equals(resp.getOrigRespStatus())){
				record.setTransstatus(TransStatus.SUCCESS);
				over.setTransstatus(TransStatus.SUCCESS);
				over.setReturncode("000000");
			} else{
				record.setTransstatus(TransStatus.FAILURE);
				over.setTransstatus(TransStatus.FAILURE);
				over.setReturncode("999999");
			}
			//更新子交易流水表
			im.updateByPrimaryKeySelective(record);
			//更新总交易流水表
			om.updateByPrimaryKeySelective(over);
			//查到交易结果，异步通知
			ans.asyncNotifySend(new AsyncNotifyMessage(over.getOveralltransnbr(), over.getTransstatus(), over.getReturncode(), over.getReturnmsg()));
		} else {
			log.error("未查到交易结果，继续查询");
			throw new UppException("未查到交易结果，继续查询");
		}
	}
	
	/**
	 * 网联代收超时查询
	 * @param ex
	 * @throws UppException 
	 */
	public void netsUnionCollectionQuery(Transexceptionreg ex) throws UppException{
		log.info("网联代收超时查询开始");
		String innertransnbr = ex.getInnerfundtransnbr();
		ReqNetsUnionQuery req = new ReqNetsUnionQuery();
		req.setOrigInnertransnbr(innertransnbr);
		RespNetsUnionQuery resp = nc.netsQuery(req);
		if(NetsUnionRespStatus.SUCCESS.equals(resp.getRespStatus())){
			Innerfundtrans record = new Innerfundtrans();
			record.setInnerfundtransnbr(innertransnbr);
			record.setTransdate(ex.getTransdate());
			record.setReturncode(resp.getOrigRespCode());
			record.setReturnmsg(resp.getOrigRespMsg());
			Overalltrans over = new Overalltrans();
			over.setOveralltransnbr(ex.getOveralltransnbr());
			over.setTransdate(ex.getTransdate());
			over.setReturnmsg(resp.getOrigRespMsg());
			if(NetsUnionRespStatus.SUCCESS.equals(resp.getOrigRespStatus())){
				record.setTransstatus(TransStatus.SUCCESS);
				over.setTransstatus(TransStatus.SUCCESS);
				over.setReturncode("000000");
			} else{
				record.setTransstatus(TransStatus.FAILURE);
				over.setTransstatus(TransStatus.FAILURE);
				over.setReturncode("999999");
			}
			//更新子交易流水表
			im.updateByPrimaryKeySelective(record);
			//更新总交易流水表
			om.updateByPrimaryKeySelective(over);
			//查到交易结果，异步通知
			ans.asyncNotifySend(new AsyncNotifyMessage(over.getOveralltransnbr(), over.getTransstatus(), over.getReturncode(), over.getReturnmsg()));
		} else {
			log.error("未查到交易结果，继续查询");
			throw new UppException("未查到交易结果，继续查询");
		}
	}
	
	/**
	 * 电子账户充值互联网核心入账超时查询
	 * @param ex
	 * @throws UppException 
	 */
	public void eaccountRechargeQuery(Transexceptionreg ex) throws UppException{
		log.info("电子账户充值超时查询开始");
		String innertransnbr = ex.getInnerfundtransnbr();
		ReqEaccountQuery req = new ReqEaccountQuery();
		req.setOrigInnertransnbr(innertransnbr);
		RespEaccountQuery resp = ec.eaccountQuery(req);
		if(EaccountRespStatus.SUCCESS.equals(resp.getRespStatus())){
			Innerfundtrans record = new Innerfundtrans();
			record.setInnerfundtransnbr(innertransnbr);
			record.setTransdate(ex.getTransdate());
			record.setReturncode(resp.getOrigRespCode());
			record.setReturnmsg(resp.getOrigRespMsg());
			Overalltrans over = new Overalltrans();
			over.setOveralltransnbr(ex.getOveralltransnbr());
			over.setTransdate(ex.getTransdate());
			over.setReturnmsg(resp.getOrigRespMsg());
			if(EaccountRespStatus.SUCCESS.equals(resp.getOrigRespStatus())){
				record.setTransstatus(TransStatus.SUCCESS);
				over.setTransstatus(TransStatus.SUCCESS);
				over.setReturncode("000000");
			} else{
				record.setTransstatus(TransStatus.FAILURE);
				over.setTransstatus(TransStatus.FAILURE);
				over.setReturncode("999999");
			}
			//更新子交易流水表
			im.updateByPrimaryKeySelective(record);
			//更新总交易流水表
			om.updateByPrimaryKeySelective(over);
			//查到交易结果，异步通知
//			ans.asyncNotifySend(new AsyncNotifyMessage(over.getOveralltransnbr(), over.getTransstatus(), over.getReturncode(), over.getReturnmsg()));
		} else {
			log.error("未查到交易结果，继续查询");
			throw new UppException("未查到交易结果，继续查询");
		}
	}
	
	/**
	 * 电子账户充值第三方支付代扣超时查询
	 * @param ex
	 * @throws UppException 
	 */
	public void rechargeCollectionQuery(Transexceptionreg ex) throws UppException{
		log.info("电子账户充值第三方支付代扣超时查询开始");
		String innertransnbr = ex.getInnerfundtransnbr();
		if(FundchannelCode.UNIONPAY.equals(ex.getFundchannelcode())){
			ReqUnionPayQuery req = new ReqUnionPayQuery();
			req.setOrigInnertransnbr(innertransnbr);
			RespUnionQuery resp = uc.unionQuery(req);
			if(UnionpayRespStatus.SUCCESS.equals(resp.getRespStatus())){
				Innerfundtrans record = new Innerfundtrans();
				record.setInnerfundtransnbr(innertransnbr);
				record.setTransdate(ex.getTransdate());
				record.setReturncode(resp.getOrigRespCode());
				record.setReturnmsg(resp.getOrigRespMsg());
				if(UnionpayRespStatus.SUCCESS.equals(resp.getOrigRespStatus())){
					record.setTransstatus(TransStatus.SUCCESS);
					//更新子交易流水表
					im.updateByPrimaryKeySelective(record);
				} else{
					Overalltrans over = new Overalltrans();
					over.setOveralltransnbr(ex.getOveralltransnbr());
					over.setTransdate(ex.getTransdate());
					over.setReturnmsg(resp.getOrigRespMsg());
					record.setTransstatus(TransStatus.FAILURE);
					over.setTransstatus(TransStatus.FAILURE);
					over.setReturncode("999999");
					//更新子交易流水表
					im.updateByPrimaryKeySelective(record);
					//更新总交易流水表
					om.updateByPrimaryKeySelective(over);
				}
			} else {
				log.error("未查到交易结果，继续查询");
				throw new UppException("未查到交易结果，继续查询");
			}
		} else if(FundchannelCode.NETSUNION.equals(ex.getFundchannelcode())){
			ReqNetsUnionQuery req = new ReqNetsUnionQuery();
			req.setOrigInnertransnbr(innertransnbr);
			RespNetsUnionQuery resp = nc.netsQuery(req);
			if(NetsUnionRespStatus.SUCCESS.equals(resp.getRespStatus())){
				Innerfundtrans record = new Innerfundtrans();
				record.setInnerfundtransnbr(innertransnbr);
				record.setTransdate(ex.getTransdate());
				record.setReturncode(resp.getOrigRespCode());
				record.setReturnmsg(resp.getOrigRespMsg());
				if(NetsUnionRespStatus.SUCCESS.equals(resp.getOrigRespStatus())){
					record.setTransstatus(TransStatus.SUCCESS);
					//更新子交易流水表
					im.updateByPrimaryKeySelective(record);
				} else{
					Overalltrans over = new Overalltrans();
					over.setOveralltransnbr(ex.getOveralltransnbr());
					over.setTransdate(ex.getTransdate());
					over.setReturnmsg(resp.getOrigRespMsg());
					record.setTransstatus(TransStatus.FAILURE);
					over.setTransstatus(TransStatus.FAILURE);
					over.setReturncode("999999");
					//更新子交易流水表
					im.updateByPrimaryKeySelective(record);
					//更新总交易流水表
					om.updateByPrimaryKeySelective(over);
				}
			} else {
				log.error("未查到交易结果，继续查询");
				throw new UppException("未查到交易结果，继续查询");
			}
		}
	}
	
	/**
	 * 充值交易电子账户超时入账
	 * @param ex
	 * @throws UppException
	 */
	public void rechargeEaccountSettle(Transexceptionreg ex) throws UppException{
		InputFundTrans input = new InputFundTrans();
		input.setFundchannelcode(FundchannelCode.EACCOUNT);
		input.setTranscode(TransCode.EACCOUNTSETTLE);
		OveralltransKey key = new OveralltransKey();
		key.setOveralltransnbr(ex.getOveralltransnbr());
		key.setTransdate(ex.getTransdate());
		Overalltrans over = om.selectByPrimaryKey(key);
		//落库
		this.insertFundtrans(input,over);
		RespRecharge resp = (RespRecharge)ec.eaccountSettle(new ReqEaccountRecharge());
		//更新库表
		this.updateFundtrans(resp, input);
		
		if(TransStatus.TIMEOUT.equals(resp.getRespStatus())){
			//超时异常处理
			this.insertTransexceptionreg(ex, ExcepInfoEnum.EaccountRechargeTimeOut);
		} else {
			this.updateOveralltrans(ex, resp);
		}
	}
	
	
	
	
	
	public void test(Transexceptionreg ex) throws UppException{
		log.info("成功唤起异步线程");
	}
	
	
}
