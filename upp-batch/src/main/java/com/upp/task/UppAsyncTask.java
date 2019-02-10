package com.upp.task;

import java.lang.reflect.Method;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.upp.baseClass.BaseTask;
import com.upp.constant.ExcepHandleStatus;
import com.upp.dao.mapper.TransexceptionregMapper;
import com.upp.dto.generate.Transexceptionreg;
import com.upp.util.SpringContextUtil;

/**
 * 异步任务
 * 
 * @author Administrator
 *
 */
@Component
public class UppAsyncTask extends BaseTask{
	
	@Autowired
	private TransexceptionregMapper tm;
	
	/**
	 * 异步处理子流水异常
	 * 
	 * @param ex
	 */
	@Async("taskExecutor")
	public void handleException(Transexceptionreg ex) {
		log.info("成功唤起异步线程");
		String excepservicename = ex.getExcepservicename();
		String excepmethodname = ex.getExcepmethodname();
		try {
			Object bean = SpringContextUtil.getBean(excepservicename);
			Method m = bean.getClass().getMethod(excepmethodname, ex.getClass());
			m.invoke(bean, ex);
		} catch (Exception e) {
			//若处理异常，则更新为处理中，下次继续处理
			Integer retrytimes = ex.getRetrytimes();
			Integer maxretrytimes = ex.getMaxretrytimes();
			if(retrytimes.compareTo(maxretrytimes) == 0){
				ex.setHandlestatus(ExcepHandleStatus.OUTTIMES);
			} else{
				ex.setHandlestatus(ExcepHandleStatus.HANDLING);
			}
			ex.setRetrytimes(retrytimes+1);
			tm.updateByPrimaryKeySelective(ex);
			return;
		}
		//若处理没有异常，则更新处理状态为处理完成
		ex.setHandlestatus(ExcepHandleStatus.COMPLETE);
		tm.updateByPrimaryKeySelective(ex);
	}
}
