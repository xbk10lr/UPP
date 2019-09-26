package com.upp;

import javax.validation.ValidationException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.upp.dto.Context;
import com.upp.dto.model.ReqCollection;
import com.upp.dubbo.RespUppHead;
import com.upp.exception.UppException;
import com.upp.exception.UppExceptionHandler;
import com.upp.template.CommonFundTemplate;
import com.upp.util.SeqNbrFactory;
import com.upp.util.ValidationHandler;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UppFundprocessApplicationTests {

//	@Autowired
//	private MerbaseinfoMapper mapper;
//	
//	@Autowired
//	private OnlineorderinfoMapper om;
	
	@Autowired
	private SeqNbrFactory seqNbrFactory;
	
	@Autowired
	private UppExceptionHandler handler;
	
	@Autowired
	private ValidationHandler vh;
	
	@Autowired
	private CommonFundTemplate cft;
	
	@Test
	public void contextLoads() {
		
//		Merbaseinfo m = new Merbaseinfo();
//		m.setMername("测试2");
//		m.setMernbr("12232322445");
//		m.setMerstatus("0");
//		mapper.insert(m);
		
//		Onlineorderinfo o = new Onlineorderinfo();
//		o.setMernbr("1");
//		o.setMerseqnbr("1");
//		o.setTransseqnbr("3");
//		o.setTransdate(new Date());
//		o.setMertranstime(new Date());
//		o.setCleardate(new Date());
//		o.setTranstime(new Date());
//		o.setCurrencycd("CNY");
//		o.setTransamt(new BigDecimal("1"));
//		om.insertSelective(o);
//		om.insert(o);
//		for(int i=0;i<3;i++){
//			System.out.println(seqNbrFactory.getSnowFlakeSeqNbr());
//		}
//		Context ctx = new Context();
//		handler.handle(new UppException(DictErrors.TIMEOUT), ctx);
//		System.out.println(ctx.getRespMsg()+"---"+ctx.getRespCode()+"---"+ctx.getRespStatus());
//		ReqCollection req = new ReqCollection();
//		req.setMernbr("222");
//		try {
//			vh.validate(req);
//		} catch (ValidationException | UppException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Context ctx = new Context();
		RespUppHead resp = new RespUppHead();
		ctx.setFundchannelcode("UNIONPAY");
		ctx.setRespCode("13011");
		ctx.setRespMsg("交易失败啦阿拉拉");
		cft.fundCommomResp(ctx, resp);
		System.out.println(resp.getRespCode()+"_"+resp.getRespMsg()+"_"+resp.getRespStatus());
		
	}

}
