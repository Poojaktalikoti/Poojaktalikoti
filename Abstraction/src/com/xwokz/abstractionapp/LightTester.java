package com.xwokz.abstractionapp;

public class LightTester {
	
	public static void main (String[]args) {
		
		//abstarction
		SwitchInterface si = new TublightImplements();
		si.sOn();
		si.sOff();
		SwitchInterface si1 = new CflBulbImplements();
		si1.sOn();
		si1.sOff();
		//SwitchInterface Si=LightFactory.getLight("tubelight");
		
		//if(si !=null) {
		//si.sOn();
		//si.sOff();
		//}
		
	}

}
