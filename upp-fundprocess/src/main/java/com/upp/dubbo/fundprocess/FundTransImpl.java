package com.upp.dubbo.fundprocess;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.upp.action.EaccountRechargeAction;
import com.upp.action.FundCollectionAction;
import com.upp.action.TransCheckAction;
import com.upp.baseClass.Action;
import com.upp.constant.TransCode;
import com.upp.dto.Context;
import com.upp.dto.common.InputFundTrans;
import com.upp.template.CommonFundTemplate;

@Service(version = "1.0.0")
public class FundTransImpl implements FundTrans {

	private static final Log log = LogFactory.getLog(FundTransImpl.class);
	
	//代收
	@Autowired
	private FundCollectionAction fca;
	//互联网核心入账
	@Autowired
	private EaccountRechargeAction era;
	//检查上一步交易是否成功
	@Autowired
	private TransCheckAction tca;

	@Autowired
	private CommonFundTemplate cft;
	
	private List<Action> list = new ArrayList<Action>();
	
	private Context ctx = new Context();
	/**
	 * 代收
	 */
	@Override
	public RespFundCollection fundCollection(ReqFundCollection req) {
		log.info("fund收到交易代收交易请求，上游系统编号=" + req.getUppersysnbr() + "，上游交易流水号=" + req.getUppertransnbr());
		long start = System.currentTimeMillis();
		InputFundTrans input = new InputFundTrans(req);
		input.setOveralltranstyp(TransCode.COLLECTION);
		list.add(fca);
		// 组装上下文
		ctx.setInput(input);
		ctx.setActions(list);
		// 责任链处理
		cft.excute(ctx);
		log.info("代收交易结束,交易耗时：" + (System.currentTimeMillis() - start) + "ms，总交易流水号=" + input.getOveralltransnbr()
				+ "，上游交易流水号=" + req.getUppertransnbr());
		ctx.setOveralltransnbr(input.getOveralltransnbr());
		RespFundCollection resp =  new RespFundCollection();
		//错误码映射
		cft.fundCommomResp(ctx,resp);
		return resp;
	}
	/**
	 * 充值
	 */
	@Override
	public RespRecharge recharge(ReqRecharge req) {

		log.info("fund收到充值交易请求，上游系统编号=" + req.getUppersysnbr() + "，上游交易流水号=" + req.getUppertransnbr());
		long start = System.currentTimeMillis();
		InputFundTrans input = new InputFundTrans(req);
		input.setOveralltranstyp(TransCode.RECHARGE);
		//组装充值交易需要的actions
		//第一步：调第三方支付代收
		list.add(fca);
		//第二步：检查第一步交易的交易结果
		list.add(tca);
		//第三步：调互联网核心入电子账户
		list.add(era);
		// 组装上下文
		ctx.setInput(input);
		ctx.setActions(list);
		// 责任链处理
		cft.excute(ctx);
		log.info("充值交易结束,交易耗时：" + (System.currentTimeMillis() - start) + "ms，总交易流水号=" + input.getOveralltransnbr()
				+ "，上游交易流水号=" + req.getUppertransnbr());
		// 组装返回报文
		ctx.setOveralltransnbr(input.getOveralltransnbr());
		RespRecharge resp =  new RespRecharge();
		cft.fundCommomResp(ctx,resp);
		return resp;
	}
	
	

}
