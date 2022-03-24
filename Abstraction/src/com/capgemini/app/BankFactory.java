package com.capgemini.app;

public class BankFactory {
	
public static AtmCardInterface getCanara(String type) {
	 
	if (type.equalsIgnoreCase("canarabank")) {
		return new CanaraBankImplements();
	}
	else if (type.equalsIgnoreCase("karnatakabank")) {
		return new KarnatakaBankImplements();
		
	}
	else {
		System.out.println("No cash found");
	}
	return null;
	 
}
}
