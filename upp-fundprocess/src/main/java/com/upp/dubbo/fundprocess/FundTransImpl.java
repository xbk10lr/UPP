package com.upp.dubbo.fundprocess;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.upp.action.FundCollectionAction;
import com.upp.baseClass.Action;
import com.upp.constant.TransCode;
import com.upp.dto.Context;
import com.upp.dto.common.InputFundTrans;
import com.upp.template.CommonFundTemplate;

@Service(version = "1.0.0")
public class FundTransImpl implements FundTrans {

	private static final Log log = LogFactory.getLog(FundTransImpl.class);

	@Autowired
	private FundCollectionAction fca;

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
		// 组装返回报文
		ctx.setOveralltransnbr(input.getOveralltransnbr());
		RespFundCollection resp = (RespFundCollection) cft.fundCommomResp(ctx);
		return resp;
	}

}
