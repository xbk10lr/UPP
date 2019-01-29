package com.upp.template;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.upp.action.CommonInputAction;
import com.upp.action.CommonOutputAction;
import com.upp.baseClass.Action;
import com.upp.constant.SysNbr;
import com.upp.dto.Context;
import com.upp.dubbo.RespUppHead;
import com.upp.dubbo.fundprocess.RespFundCollection;
import com.upp.exception.UppExceptionHandler;

/**
 * 通用处理模板
 * @author Administrator
 *
 */
@Component
public class CommonFundTemplate {
	
	@Autowired
	private CommonInputAction cia;
	
	@Autowired
	private CommonOutputAction coa;
	
	@Autowired
	private UppExceptionHandler exceptionHandler;
	
	public void excute(Context ctx){
		try {
			//通用请求处理
			cia.excute(ctx);
			List<Action> actions = ctx.getActions();
			for(Action action : actions){
				//代收交易业务处理
				action.excute(ctx);
			}
		} catch (Exception e) {
			//统一异常处理
			exceptionHandler.handle(e, ctx);
		}
		try {
			//通用响应处理
			coa.excute(ctx);
		} catch (Throwable e) {
			//统一异常处理
			exceptionHandler.handle(e, ctx);
		}
	}
	
	/**
	 * fund组装通用返回报文
	 * @param ctx
	 * @return
	 */
	public RespUppHead fundCommomResp(Context ctx){
		RespUppHead resp = new RespFundCollection();
		resp.setDownsysnbr(SysNbr.FUND);
		resp.setDowntransdate(new Date());
		resp.setDowntransnbr(ctx.getOveralltransnbr());
		resp.setDowntranstime(new Date());
		resp.setRespCode(ctx.getRespCode());
		resp.setRespMsg(ctx.getRespMsg());
		resp.setRespStatus(ctx.getRespStatus());
		return resp;
	}
}
