package com.upp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.upp.baseClass.BaseService;
import com.upp.constant.NetsUnionRespStatus;
import com.upp.constant.TransStatus;
import com.upp.constant.UnionpayRespStatus;
import com.upp.dao.mapper.InnerfundtransMapper;
import com.upp.dao.mapper.OveralltransMapper;
import com.upp.dto.generate.Innerfundtrans;
import com.upp.dto.generate.Overalltrans;
import com.upp.dto.generate.Transexceptionreg;
import com.upp.dto.model.AsyncNotifyMessage;
import com.upp.dto.model.ReqNetsUnionQuery;
import com.upp.dto.model.ReqUnionPayQuery;
import com.upp.dto.model.RespNetsUnionQuery;
import com.upp.dto.model.RespUnionQuery;
import com.upp.exception.UppException;
import com.upp.fundchannels.NetsunionTransport;
import com.upp.fundchannels.UnionpayTransport;
import com.upp.rabbit.sender.AsyncNotifySender;

/**
 * 日间交易异常处理服务类
 * @author Administrator
 *
 */
@Component("exceptionHandleService")
public class ExceptionHandleService extends BaseService{
	
	@Autowired
	private UnionpayTransport ut;
	
	@Autowired
	private NetsunionTransport nt;
	
	@Autowired
	private AsyncNotifySender ans;
	
	@Autowired
	private InnerfundtransMapper im;
	
	@Autowired
	private OveralltransMapper om;
	
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
		RespUnionQuery resp = ut.unionQuery(req);
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
		RespNetsUnionQuery resp = nt.netsQuery(req);
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
	
	public void test(Transexceptionreg ex) throws UppException{
		log.info("成功唤起异步线程");
	}
	
	
}
