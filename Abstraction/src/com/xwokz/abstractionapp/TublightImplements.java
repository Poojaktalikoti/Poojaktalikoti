package com.xwokz.abstractionapp;

public class TublightImplements implements SwitchInterface {

	@Override
	public void sOn() {
		System.out.println("tubelight is truned on");	
	}

	@Override
	public void sOff() {
		System.out.println("tubelight is truned off");
		
	}

}
