package com.upp.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.upp.baseClass.BaseAction;
import com.upp.constant.ExcepHandleStatus;
import com.upp.dao.mapper.TransexceptionregMapper;
import com.upp.dto.Context;
import com.upp.dto.generate.Transexceptionreg;
import com.upp.dto.generate.TransexceptionregExample;
import com.upp.exception.UppException;
import com.upp.task.UppAsyncTask;

/**
 * 异常处理类
 * @author Administrator
 *
 */
@Component
public class ExceptionHandleAction extends BaseAction {
	
	@Autowired
	private TransexceptionregMapper tm ;
	
	@Autowired
	private UppAsyncTask uat;
	
	@Override
	public void excute(Context context) throws UppException {
		TransexceptionregExample example = new TransexceptionregExample();
		example.createCriteria().andHandlestatusEqualTo(ExcepHandleStatus.PRE);
		//查询出所有待处理的交易
		List<Transexceptionreg> exceps1 = tm.selectByExample(example);
		List<Transexceptionreg> exceps2 = tm.selectOuttimeException(1);
		List<Transexceptionreg> exceps = new ArrayList<>();
		exceps.addAll(exceps1);
		exceps.addAll(exceps2);
		if(null != exceps && !exceps.isEmpty()){
			log.info("共有"+exceps.size()+"条待处理的异常任务");
			for(Transexceptionreg ex : exceps){
				ex.setHandlestatus(ExcepHandleStatus.HANDLING);
				tm.updateByPrimaryKeySelective(ex);
				//异步线程处理
				uat.handleException(ex);
			}
		} else {
			log.info("没有待处理的异常任务");
		}
	}

}
