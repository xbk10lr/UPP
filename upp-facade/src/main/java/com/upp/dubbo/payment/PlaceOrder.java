package com.upp.dubbo.payment;

public interface PlaceOrder {
	public RespPlaceOrder placeOrder(ReqPlaceOrder req) throws Exception;
}
