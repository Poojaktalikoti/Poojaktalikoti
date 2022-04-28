package com.xworkz.hibernatedemo.runner;

import com.xworkz.hibernatedemo.dao.RestaurantDAO;
import com.xworkz.hibernatedemo.entity.RestaurantEntity;

public class RunnerClass {
	
	public static void main(String[] args) {
		
	RestaurantEntity restaurantEntity =new RestaurantEntity();
	
	restaurantEntity.setRestaurantId(1);
	restaurantEntity.setContactNo(8197470958l);
	restaurantEntity.setName("udupi");
	restaurantEntity.setRating(3.6);
	restaurantEntity.setType("veg");
	
	RestaurantDAO restaurantDAO=new RestaurantDAO();
	restaurantDAO.saveRestaurant(restaurantEntity);
	System.out.println("save Succesfull");
	
	

}
}
