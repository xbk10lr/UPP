package com.upp.exception;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.upp.constant.DictErrors;
import com.upp.constant.TransStatus;
import com.upp.dto.Context;
import com.upp.util.MessageUtils;
import com.upp.util.SpringContextUtil;
import com.upp.util.StringUtil;

/**
 * Upp异常处理类
 * @author Administrator
 *
 */
@Component
public class UppExceptionHandler {

	public void handle(Throwable exception, Context context) {
		if (exception instanceof UppException) {
			UppException uppException = (UppException) exception;
			String errorcode = uppException.getMessage();
			String errormessage = uppException.getErrormessage();
			String message = MessageUtils.get(errorcode);
			if (StringUtil.isStringEmpty(message)) {
				message =  MessageUtils.get(DictErrors.TRANS_EXCEPTION);
			}
			if ("100004".equals(errormessage.split(";")[0])) {
				formatContext(context, String.format(message.split(";")[1], errormessage), message.split(";")[0],
						message.split(";")[2]);
			} else {
				formatContext(context, message.split(";")[1], message.split(";")[0], message.split(";")[2]);
			}
		} else {
			formatContext(context, "交易失败，请联系管理员", "100000", TransStatus.FAILURE);
		}
	}

	private void formatContext(Context context, String respMsg, String respCode, String respStatus) {
		context.setRespCode(respCode);
		context.setRespMsg(respMsg);
		context.setRespStatus(respStatus);
	}

}
