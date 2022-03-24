package com.xwokz.abstractionapp;

public class LightFactory {
	
	public static SwitchInterface getLight(String type) {
		
		if (type.equalsIgnoreCase("tublight")) {
		return new TublightImplements();
	}
	else if(type.equalsIgnoreCase("Cflbulb")) {
	return new CflBulbImplements();
	}
	else {
		System.out.println("no light found");
	}
		return null;

}
}

