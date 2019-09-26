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
import com.upp.errorcodes.ErrorCodeReflect;
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
	public void fundCommomResp(Context ctx ,RespUppHead resp){
		resp.setDownsysnbr(SysNbr.FUND);
		resp.setDowntransdate(new Date());
		resp.setDowntransnbr(ctx.getOveralltransnbr());
		resp.setDowntranstime(new Date());
		//错误码映射
		ErrorCodeReflect.getLocalErrorCode(ctx.getFundchannelcode(), ctx.getRespCode(),ctx.getRespMsg(),resp);
	}
}
