package com.xworkz.tv.runner;

import com.xworkz.tv.entity.TVChannel;
import com.xworkz.tv.entity.dao.TVChannelDAO;
import com.xworkz.tv.entity.dao.TVChannelDAOImpl;

public class MainClass {
	public static void main(String[] args) {
		TVChannel channelEntity=new TVChannel();
		channelEntity.setChannelId(1);
		channelEntity.setChannelName("News9");
		channelEntity.setLanguage("Kannada");
		channelEntity.setPrice(119.99);
		channelEntity.setFree(false);
		
		TVChannelDAO channelDAO=new TVChannelDAOImpl();
		channelDAO.saveChannel(channelEntity);
		System.out.println("save successfully");
		
		
	
		
		
	}

}
