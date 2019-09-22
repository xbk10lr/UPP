package com.upp.dubbo.payment;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.upp.baseClass.BaseTransport;
import com.upp.dubbo.fundprocess.FundTrans;
import com.upp.dubbo.fundprocess.ReqFundCollection;
import com.upp.dubbo.fundprocess.RespFundCollection;

/**
 * 日间交易系统内部通信dubbo调用方法
 * @author Administrator
 *
 */
@Component
public class InnerDubboTransport extends BaseTransport{
	
	@Reference(version="1.0.0")
	private FundTrans fc;
	
	/**
	 * 代收交易请求fund
	 * @param req
	 * @return
	 */
	public RespFundCollection sendFund(ReqFundCollection req){
		long start = System.currentTimeMillis();
		RespFundCollection resp = fc.fundCollection(req);
		log.info("代收交易请求fundprocess，交易耗时："+(System.currentTimeMillis()-start));
		return resp;
		
	}
}
