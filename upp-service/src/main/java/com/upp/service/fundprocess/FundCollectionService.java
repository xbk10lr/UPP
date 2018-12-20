package com.upp.service.fundprocess;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upp.constant.CheckStatus;
import com.upp.constant.DateFormatCode;
import com.upp.constant.DictErrors;
import com.upp.constant.TransCode;
import com.upp.constant.TransStatus;
import com.upp.dao.mapper.ChannelroutMapper;
import com.upp.dao.mapper.FundtransMapper;
import com.upp.dto.common.InputFundTrans;
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
	public String autoChannel(InputFundTrans input) throws UppException {
		BigDecimal transamt = input.getTransamt();
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
	public RespFundCollection send(InputFundTrans input){
		insertFundtrans(input);
//		RespFundCollection resp = new RespFundCollection();
//		resp.setRespStatus("0");
//		resp.setRespMsg("交易成功");
//		resp.setRespCode("00");
//		update
		return null;
	}
	
	/**
	 * 插入资金流水表
	 * @param req
	 */
	public void insertFundtrans(InputFundTrans input) {
		input.setFundtransnbr(DateUtil.Date_To_DateTimeFormat(new Date(), DateFormatCode.DATETIME_FORMATTER3)+UUIDUtil.getUUID());
		input.setTransstatus(TransStatus.INIT);
		input.setCheckstatus(CheckStatus.UNCHECK);
		input.setTranscode(TransCode.COLLECTION);
		fm.insertSelective(input);
	}
	
	/**
	 * 更新资金流水表
	 * @param req
	 */
	public void updateFundtrans(RespFundCollection resp,InputFundTrans input) {
		Fundtrans record = new Fundtrans();
		record.setFundtransnbr(input.getFundtransnbr());
		record.setTransdate(input.getTransdate());
		fm.insertSelective(record);
	}
}
