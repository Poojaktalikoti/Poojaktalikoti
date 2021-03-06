package com.xworkz.hibernatedemo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.hibernatedemo.entity.RestaurantEntity;


public class RestaurantDAO {
	
	public void saveRestaurant(RestaurantEntity entity) {
		Configuration cfg =new Configuration();
		
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		Transaction tx =session.beginTransaction();
		
		session.persist(entity);
		tx.commit();
	}

}
