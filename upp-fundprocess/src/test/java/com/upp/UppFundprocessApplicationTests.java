package com.upp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.upp.dao.mapper.MerbaseinfoMapper;
import com.upp.dao.mapper.OnlineorderinfoMapper;
import com.upp.util.SeqNbrFactory;

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
		for(int i=0;i<3;i++){
			System.out.println(seqNbrFactory.getSnowFlakeSeqNbr());
		}
		
	}

}
