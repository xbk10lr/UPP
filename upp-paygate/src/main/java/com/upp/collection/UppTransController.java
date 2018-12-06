package com.upp.collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upp.dto.model.ReqCollection;

@RestController
@RequestMapping("/trans")
public class UppTransController {
	private static final Logger log = LoggerFactory.getLogger(UppTransController.class);
	
    @RequestMapping("/collection")
    public String collection(ReqCollection req) {
    	log.debug(">>>>>>>>>>>>>>>>>>paygate receive collection request<<<<<<<<<<<<<<<<<<<<<<");
    	
    	
    	
    	return null;
    }
}
