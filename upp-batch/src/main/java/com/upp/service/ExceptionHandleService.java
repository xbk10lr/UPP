package com.upp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.upp.baseClass.BaseService;
import com.upp.constant.TransStatus;
import com.upp.constant.UnionpayRespStatus;
import com.upp.dao.mapper.InnerfundtransMapper;
import com.upp.dao.mapper.OveralltransMapper;
import com.upp.dto.generate.Innerfundtrans;
import com.upp.dto.generate.Overalltrans;
import com.upp.dto.generate.Transexceptionreg;
import com.upp.dto.model.ReqUnionPayQuery;
import com.upp.dto.model.RespUnionQuery;
import com.upp.exception.UppException;
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
			String message = "overalltransnbr="+over.getOveralltransnbr()+"&transstatus="+over.getTransstatus()+"&returncode="+over.getReturncode()+"&returnmsg="+over.getReturnmsg();
			ans.asyncNotifySend(message);
		} else {
			log.error("未查到交易结果，继续查询");
			throw new UppException("未查到交易结果，继续查询");
		}
	}
	
	public void test(Transexceptionreg ex) throws UppException{
		log.info("成功唤起异步线程");
	}
	
	
}
