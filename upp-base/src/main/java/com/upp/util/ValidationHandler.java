package com.upp.util;

import java.util.Iterator;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ValidationException;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.upp.constant.DictErrors;
import com.upp.exception.UppException;

@Component
public class ValidationHandler {
	
	@Autowired
	Validator validator;
	
	public <T> void validate(T obj) throws ValidationException, UppException {
		Set<ConstraintViolation<T>> validate = validator.validate(obj);
		
		if(validate.size() > 0) {
			Iterator<ConstraintViolation<T>> iterator = validate.iterator();
			String exMsg = iterator.next().getMessage();
			System.out.println(exMsg);
//			throw new UppException(DictErrors.TRANS_EXCEPTION,exMsg);
			}
		}
		
	}
