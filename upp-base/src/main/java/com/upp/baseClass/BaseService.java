package com.upp.baseClass;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.upp.util.SeqNbrFactory;


public abstract class BaseService {
	
	@Autowired
	protected SeqNbrFactory seqNbrFactory;
	
	protected Logger log = LoggerFactory.getLogger(this.getClass());
	
}
