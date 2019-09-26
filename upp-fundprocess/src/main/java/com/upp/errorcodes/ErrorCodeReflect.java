package com.upp.errorcodes;

import com.upp.constant.DictErrors;
import com.upp.dubbo.RespUppHead;
import com.upp.util.MessageUtils;
import com.upp.util.StringUtil;

public class ErrorCodeReflect {

	public static void getLocalErrorCode(String fundchannelcode,String channelerrorcode,String errormsg,RespUppHead resp){
		
		String key = MessageUtils.get(fundchannelcode+"_"+channelerrorcode);
		if(StringUtil.isStringEmpty(key)){
			String string = MessageUtils.get(DictErrors.TRANS_EXCEPTION);
			resp.setRespCode(string.split(";")[0]);
			resp.setRespMsg(String.format(string.split(";")[1], errormsg));
			resp.setRespStatus(string.split(";")[2]);
		} else {
			String string = MessageUtils.get(key);
			resp.setRespCode(string.split(";")[0]);
			resp.setRespMsg(string.split(";")[1]);
			resp.setRespStatus(string.split(";")[2]);
		}

	}
}
