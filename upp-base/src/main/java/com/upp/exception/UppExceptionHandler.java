package com.upp.exception;

import org.springframework.stereotype.Component;

import com.upp.constant.DictErrors;
import com.upp.constant.TransStatus;
import com.upp.dto.Context;
import com.upp.util.PropUtils;
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
			try {
				String val = PropUtils.readValue(errorcode, "errorcodes.properties");
				if (StringUtil.isStringEmpty(val)) {
					val = PropUtils.readValue(DictErrors.TRANS_EXCEPTION, "errorcodes.properties");
				}
				if (!StringUtil.isStringEmpty(errormessage)) {
					formatContext(context, String.format(val.split(";")[1], errormessage), val.split(";")[0],
							val.split(";")[2]);
				} else {
					formatContext(context, val.split(";")[1], val.split(";")[0], val.split(";")[2]);
				}
			} catch (UppException e) {
				formatContext(context, "系统异常，请联系管理员", "100003", TransStatus.FAILURE);
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
