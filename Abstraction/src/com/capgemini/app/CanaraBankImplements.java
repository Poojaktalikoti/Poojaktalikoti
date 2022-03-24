package com.capgemini.app;

public class CanaraBankImplements implements AtmCardInterface {

	@Override
	public void withDrawAmount() {
		System.out.println("withdraw the amount");
		
	}

	@Override
	public void depositAmount() {
		System.out.println("deposit the amount");
		
	}
	
	

}
