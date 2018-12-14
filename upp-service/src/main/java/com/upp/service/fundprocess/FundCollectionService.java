package com.upp.service.fundprocess;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upp.constant.DateFormatCode;
import com.upp.constant.DictErrors;
import com.upp.dao.mapper.ChannelroutMapper;
import com.upp.dao.mapper.FundtransMapper;
import com.upp.dto.generate.Channelrout;
import com.upp.dto.generate.ChannelroutExample;
import com.upp.dto.generate.Fundtrans;
import com.upp.dubbo.fundprocess.ReqFundCollection;
import com.upp.dubbo.fundprocess.RespFundCollection;
import com.upp.exception.UppException;
import com.upp.service.BaseService;
import com.upp.util.DateUtil;
import com.upp.util.UUIDUtil;

@Service
public class FundCollectionService extends BaseService {

	@Autowired
	private FundtransMapper fm;

	@Autowired
	private ChannelroutMapper cm;

	/**
	 * 根据限额、优先级，获取最合适的路由
	 * @param req
	 * @return
	 * @throws UppException 
	 */
	public String autoChannel(ReqFundCollection req) throws UppException {
		BigDecimal transamt = req.getTransamt();
		ChannelroutExample example = new ChannelroutExample();
		example.createCriteria().andLimitamtGreaterThan(transamt);
		List<Channelrout> lists = cm.selectByExample(example);
		if (lists != null && !lists.isEmpty()) {
			if (lists.size() == 1) {
				return lists.get(0).getFundchannelcode();
			} else {
				String fundc = lists.get(0).getFundchannelcode();
				Integer prio = Integer.valueOf(lists.get(0).getPriority());
				for (int i = 1; i < lists.size(); i++) {
					Integer prio2 = Integer.valueOf(lists.get(i).getPriority());
					if ( prio2 > prio) {
						prio = prio2;
						fundc = lists.get(i).getFundchannelcode();
					}
				}
				return fundc;
			}
		} else{
			throw new UppException(DictErrors.AUTO_CHANNEL_ERROR);
		}

	}

	/**
	 * 发送下游资金通道
	 * @param req
	 * @return
	 */
	public RespFundCollection send(ReqFundCollection req){
		insertFundtrans(req);
		
		
		return null;
	}
	
	/**
	 * 插入资金流水表
	 * @param req
	 */
	public void insertFundtrans(ReqFundCollection req) {
		Fundtrans record = new Fundtrans();
		BeanUtils.copyProperties(req, record);
		record.setFundtransnbr(DateUtil.Date_To_DateTimeFormat(new Date(), DateFormatCode.DATETIME_FORMATTER3)+UUIDUtil.getUUID());
		fm.insertSelective(record);

	}

}
