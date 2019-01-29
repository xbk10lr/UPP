package com.upp.baseClass;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.upp.dto.Context;
import com.upp.exception.UppException;
import com.upp.exception.UppExceptionHandler;

public abstract class BaseAction implements Action{
	
	protected Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	protected UppExceptionHandler exceptionHandler;
	
	@Override
	public abstract void excute (Context context) throws UppException;
	
	
}
