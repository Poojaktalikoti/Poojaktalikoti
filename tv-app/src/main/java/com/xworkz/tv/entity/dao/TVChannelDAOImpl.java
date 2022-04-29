package com.xworkz.tv.entity.dao;

import com.xworkz.tv.entity.TVChannel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TVChannelDAOImpl implements TVChannelDAO {
	
	public void saveChannel(TVChannel tvChannel) {
		EntityManagerFactory factory=null;
		EntityManager entitymanager=null;
		EntityTransaction tx=null;
		try {
			factory=Persistence.createEntityManagerFactory("tv");
			entitymanager=factory.createEntityManager();
			tx=entitymanager.getTransaction();
			tx.begin();
			entitymanager.persist(tvChannel);
			tx.commit();
		}catch(Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			if(factory!=null) {
				factory.close();
			}
			if(entitymanager!=null) {
				entitymanager.close();
			}
		}
	
}
	public void getChannel() {
		EntityManagerFactory factory=null;
		EntityManager entityManager=null;
		EntityTransaction tx=null;
		try {
			factory=Persistence.createEntityManagerFactory(("tv"));
			entityManager=factory.createEntityManager();
			tx=entityManager.getTransaction();
			tx.begin();
			TVChannel channel=entityManager.find(TVChannel.class,2);
			System.out.println(channel.toString());
		tx.commit();
			
			
			
		}
		catch(Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
		
					if(entityManager!=null) {
						entityManager.close();
		

		
			
		}
		
			
			
		}
	}
}


