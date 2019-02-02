package com.upp.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upp.baseClass.BaseService;
import com.upp.constant.DictErrors;
import com.upp.constant.ExcepHandleStatus;
import com.upp.constant.ExcepInfoEnum;
import com.upp.constant.SysStatus;
import com.upp.constant.TransStatus;
import com.upp.dao.mapper.ChannelroutMapper;
import com.upp.dao.mapper.InnerfundtransMapper;
import com.upp.dao.mapper.OveralltransMapper;
import com.upp.dao.mapper.TransexceptionregMapper;
import com.upp.dao.mapper.UppersysinfoMapper;
import com.upp.dto.Context;
import com.upp.dto.common.InputFundTrans;
import com.upp.dto.generate.Innerfundtrans;
import com.upp.dto.generate.Overalltrans;
import com.upp.dto.generate.OveralltransExample;
import com.upp.dto.generate.Transexceptionreg;
import com.upp.dto.generate.Uppersysinfo;
import com.upp.dubbo.fundprocess.RespFundCollection;
import com.upp.exception.UppException;
import com.upp.util.SeqNbrFactory;
import com.upp.util.StringUtil;

/**
 * fundprocess通用service
 * 
 * @author Administrator
 *
 */
@Service
public class FundCommonService extends BaseService {

	@Autowired
	protected InnerfundtransMapper fm;

	@Autowired
	protected ChannelroutMapper cm;

	@Autowired
	protected OveralltransMapper om;

	@Autowired
	protected UppersysinfoMapper um;
	
	@Autowired
	protected TransexceptionregMapper tm;

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
		fm.insertSelective(input);
	}

	/**
	 * 更新资金流水表
	 * 
	 * @param req
	 */
	public void updateFundtrans(RespFundCollection resp, InputFundTrans input) {
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
		fm.updateByPrimaryKeySelective(record);
	}

	/**
	 * 插入总交易流水表
	 */
	public void insertOveralltrans(InputFundTrans input) {
		input.setOveralltransnbr(SeqNbrFactory.getSeqNbrByDate());
		Overalltrans over = new Overalltrans();
		over.setOveralltransnbr(input.getOveralltransnbr());
		over.setTransdate(input.getTransdate());
		over.setOveralltranstyp(input.getOveralltranstyp());
		over.setUppersysnbr(input.getUppersysnbr());
		over.setUppertransdate(input.getUppertransdate());
		over.setUppertranstime(input.getUppertranstime());
		over.setUppertransnbr(input.getUppertransnbr());
		over.setTranstime(input.getTranstime());
		over.setCleardate(input.getCleardate());
		over.setTranscode(input.getTranscode());
		over.setPayeracctnbr(input.getPayeracctnbr());
		over.setPayername(input.getPayername());
		over.setPayeeacctnbr(input.getPayeeacctnbr());
		over.setPayeename(input.getPayeename());
		over.setCurrencycd(input.getCurrencycd());
		over.setTransamt(input.getTransamt());
		over.setFeeamt(input.getFeeamt());
		over.setCheckdataflag(input.getCheckdataflag());
		om.insertSelective(over);
	}
	
	/**
	 * 插入总交易流水表
	 */
	public void updateOveralltransCtx(Context ctx) {
		InputFundTrans input = (InputFundTrans) ctx.getInput();
		updateOveralltrans(input, ctx);
	}

	/**
	 * 插入总交易流水表
	 */
	public void updateOveralltrans(InputFundTrans input, Context ctx) {
		Overalltrans over = new Overalltrans();
		over.setReturncode(ctx.getRespCode());
		over.setReturnmsg(ctx.getRespMsg());
		over.setTransstatus(ctx.getRespStatus());
		over.setOveralltransnbr(input.getOveralltransnbr());
		over.setTransdate(input.getTransdate());
		om.updateByPrimaryKeySelective(over);
	}

	/**
	 * 检查上游系统
	 * 
	 * @param input
	 */
	public void checkUpperSysInfo(InputFundTrans input) throws UppException {
		String uppersysnbr = input.getUppersysnbr();
		Uppersysinfo uppersysinfo = um.selectByPrimaryKey(uppersysnbr);
		if (StringUtil.isObjectEmpty(uppersysinfo)) {
			log.error("上游系统编号不存在，uppersysnbr=" + uppersysnbr + ",uppertransnbr=" + input.getUppertransnbr());
			throw new UppException(DictErrors.UPPERSYSNBR_ERROR);
		}
		if (!SysStatus.NORMAL.equals(uppersysinfo.getSysstatus())) {
			// 上游系统状态异常
			log.error("上游系统编号不存在，uppersysnbr=" + uppersysnbr + ",uppertransnbr=" + input.getUppertransnbr());
			throw new UppException(DictErrors.UPPERSYS_STATUS_ABNORMAL);
		}
		;
	}

	/**
	 * 检查交易是否是重复交易
	 * 
	 * @param input
	 * @throws UppException
	 */
	public void checkRepeatTrade(InputFundTrans input) throws UppException {
		String uppertransnbr = input.getUppertransnbr();
		Date uppertransdate = input.getUppertransdate();
		String uppersysnbr = input.getUppersysnbr();
		OveralltransExample example = new OveralltransExample();
		example.createCriteria().andUppersysnbrEqualTo(uppersysnbr).andUppertransnbrEqualTo(uppertransnbr)
				.andUppertransdateEqualTo(uppertransdate);
		List<Overalltrans> examples = om.selectByExample(example);
		if (null != examples && !examples.isEmpty()) {
			log.error("交易重复，uppertransnbr=" + uppertransnbr + ",uppersysnbr=" + uppersysnbr + ",uppertransdate="
					+ uppertransdate);
			throw new UppException(DictErrors.UPPERSYS_TRANS_REPEAT);
		}
	}
	
	/**
	 * 插入异常处理表
	 * @param input
	 * @param ex
	 */
	public void insertTransexceptionreg(InputFundTrans input,ExcepInfoEnum ex){
		Transexceptionreg record = new Transexceptionreg();
		record.setExceppseqnbr(SeqNbrFactory.getSeqNbrByDate());
		record.setTransdate(input.getTransdate());
		record.setInnerfundtransnbr(input.getInnerfundtransnbr());
		record.setOveralltransnbr(input.getOveralltransnbr());
		record.setFundchannelcode(input.getFundchannelcode());
		record.setRetrytimes(0);
		record.setMaxretrytimes(ex.getMaxRetryTimes());
		record.setExcepdesc(ex.getExcepDesc());
		record.setExcepmethodname(ex.getExcepMethodName());
		record.setExcepservicename(ex.getExcepServiceName());
		record.setHandlestatus(ExcepHandleStatus.PRE);
	}

}
