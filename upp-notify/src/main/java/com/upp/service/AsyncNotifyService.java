package com.upp.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.upp.baseClass.BaseService;
import com.upp.constant.NotifyStatus;
import com.upp.dao.mapper.MerbaseinfoMapper;
import com.upp.dao.mapper.NotifyregMapper;
import com.upp.dao.mapper.OnlineorderinfoMapper;
import com.upp.dto.generate.Merbaseinfo;
import com.upp.dto.generate.Notifyreg;
import com.upp.dto.generate.Onlineorderinfo;
import com.upp.dto.generate.OnlineorderinfoExample;
import com.upp.dto.model.AsyncNotifyMessage;
import com.upp.http.MerNotifyTransport;
import com.upp.util.SeqNbrFactory;

@Component
public class AsyncNotifyService extends BaseService {

	@Autowired
	private NotifyregMapper nm;
	
	@Autowired
	private MerbaseinfoMapper mm;
	
	@Autowired
	private OnlineorderinfoMapper om;
	
	@Autowired
	private MerNotifyTransport mnt;
	
	/**
	 * 获取订单信息
	 * @param overalltransnbr
	 * @return
	 */
	public Onlineorderinfo getOnlineOrderInfo(String overalltransnbr){
		OnlineorderinfoExample example = new OnlineorderinfoExample();
		example.createCriteria().andDownsystransnbrEqualTo(overalltransnbr);
		List<Onlineorderinfo> onlineorders = om.selectByExample(example);
		return onlineorders.get(0);
	}
	
	public String insertNotifyReg(Onlineorderinfo onlineOrderInfo){
		String notifynbr = SeqNbrFactory.getSeqNbrByDate()+"NOTIFY";
		//入通知表
		Notifyreg record = new Notifyreg();
		record.setMernbr(onlineOrderInfo.getMernbr());
		record.setNotifynbr(notifynbr);
		record.setNotifystatus(NotifyStatus.INIT);
		record.setTransdate(onlineOrderInfo.getTransdate());
		record.setUppertransnbr(onlineOrderInfo.getMerseqnbr());
		nm.insertSelective(record);	
		return notifynbr;
	}
	
	public void updateOnlineOrderInfo(Onlineorderinfo onlineOrderInfo,AsyncNotifyMessage message){
		String transstatus = message.getTransstatus();
		String returncode = message.getReturncode();
		String returnmsg = message.getReturnmsg();
		onlineOrderInfo.setTransstatus(transstatus);
		onlineOrderInfo.setRespcode(returncode);
		onlineOrderInfo.setRespmsg(returnmsg);
		om.updateByPrimaryKeySelective(onlineOrderInfo);
	}
	
	public void updateNotifyReg(String notifynbr,String notifystatus){
		Notifyreg notifyReg = new Notifyreg();
		notifyReg.setNotifynbr(notifynbr);
		notifyReg.setNotifystatus(notifystatus);
		nm.updateByPrimaryKeySelective(notifyReg);
	}
	
	/**
	 * 通知商户
	 * @param req
	 * @return
	 */
	public String notifyMer(Onlineorderinfo onlineorderinfo){
		String mernbr = onlineorderinfo.getMernbr();
		Merbaseinfo merbaseinfo = mm.selectByPrimaryKey(mernbr);
		String req = "merseqnbr="+onlineorderinfo.getMerseqnbr()+"&transstatus="+onlineorderinfo.getTransstatus()+"&respcode="+onlineorderinfo.getRespcode()+"&respmsg="+onlineorderinfo.getRespmsg();
		return mnt.notifyMer(req, merbaseinfo.getMerurl());
	}
	
	public Map<String,Object> parseNotifyMessage(String message){
		Map<String,Object> retMap = new HashMap<>();
		String[] strings = message.split("&");
		for(String s : strings){
			String[] s2 = s.split("=",2);
			retMap.put(s2[0], s2[1]);
		}
		return retMap;
	}
}
