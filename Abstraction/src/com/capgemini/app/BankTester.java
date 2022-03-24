package com.capgemini.app;

public class BankTester {
	
	public static void main (String[]args) {
		 
		AtmCardInterface A1 = new CanaraBankImplements();
		A1.withDrawAmount();
		A1.depositAmount();
		AtmCardInterface A2= new KarnatakaBankImplements();
		A2.withDrawAmount();
		A1.depositAmount();
	}

}
