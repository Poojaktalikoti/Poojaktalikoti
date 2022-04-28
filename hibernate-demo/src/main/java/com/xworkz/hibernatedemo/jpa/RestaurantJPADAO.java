package com.xworkz.hibernatedemo.jpa;

import com.xworkz.hibernatedemo.entity.RestaurantEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class RestaurantJPADAO {
	
	public void saveResturant(RestaurantEntity entity) {
		
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("jpa");
		
		EntityManager entitymanager = factory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		entitymanager.persist(entity);
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		factory.close();
	}

}
