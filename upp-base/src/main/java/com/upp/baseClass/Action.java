package com.upp.baseClass;

import com.upp.dto.Context;
import com.upp.exception.UppException;

public interface Action {
	
	public void excute(Context context) throws UppException;
}
