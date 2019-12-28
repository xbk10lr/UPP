package com.upp.dubbo.connectors;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.alibaba.dubbo.config.annotation.Service;
import com.upp.constant.TransStatus;
import com.upp.constant.UnionpayRespStatus;
import com.upp.dubbo.RespUppHead;
import com.upp.service.SendService;
import com.upp.util.UppBeanUtils;

/**
 * 银联通信类
 * @author Administrator
 *
 */
@Service(version = "1.0.0")
public class UnionpayChannelImpl implements UnionpayChannel {
	
	@Autowired
	@Qualifier("UnionService")
	private SendService sendService;
	
	/**
	 * 银联代收
	 * @return
	 */
	public RespUppHead unionDS(ReqUnionPayDs req){
		HashMap<String, Object> map = new HashMap<>();
		UppBeanUtils.transBean2Map(req, map);
		Map<String, Object> respMap = sendService.send(map);
		RespUppHead resp = new RespUppHead();
		UppBeanUtils.transMap2Bean(respMap, resp);
		return resp;
	}
	
	
	/**
	 * 银联查询
	 * @return
	 */
	public RespUnionQuery unionQuery(ReqUnionPayQuery req){
		HashMap<String, Object> map = new HashMap<>();
		UppBeanUtils.transBean2Map(req, map);
		Map<String, Object> respMap = sendService.send(map);
		RespUnionQuery resp = new RespUnionQuery();
		UppBeanUtils.transMap2Bean(respMap, resp);
		return resp;
	}
}
