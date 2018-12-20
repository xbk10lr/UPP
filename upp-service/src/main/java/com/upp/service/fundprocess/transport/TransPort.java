package com.upp.service.fundprocess.transport;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.upp.dubbo.RespUppHead;

public abstract class TransPort {
	
	protected Logger log = LoggerFactory.getLogger(this.getClass());

	
	protected abstract RespUppHead send(HashMap<String, Object> map);
}
