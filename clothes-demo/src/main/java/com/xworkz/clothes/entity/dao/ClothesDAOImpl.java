package com.xworkz.clothes.entity.dao;

import java.time.Year;
import java.util.Date;

import com.xworkz.clothes.entity.Clothes;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ClothesDAOImpl implements ClothesDAO {

EntityManagerFactory emf = Persistence.createEntityManagerFactory("clothes");
		EntityManager em = null;
		EntityTransaction et = null;
		Clothes cl=null;
		Date date=null;
		public void SaveClothes(Clothes clothes)
		{
		try {
			emf=Persistence.createEntityManagerFactory("clothes");
			em=emf.createEntityManager();
			et=em.getTransaction();
			et.begin();
			em.persist(clothes);
			et.commit();
			
		} catch (Exception e) {
			et.rollback();
			e.printStackTrace();
		}
		finally {
			if(emf!=null) {
			emf.close();
			if(em!=null) {
			em.close();
		}
			}
		}
		}
		public Clothes getClothesById(Integer Id) {
		EntityManager em=emf.createEntityManager();
		Clothes cl=null;
		try {
			cl=em.find(Clothes.class,Id);
		}catch(Exception e){
			e.printStackTrace();
		}
		return cl;
		}
		
		
		public void updateClothBrandById(String brand,Double price,Integer Id) {
			EntityManager em=null;
			EntityTransaction et=null;
			Clothes cl=null;
			try {
				em=emf.createEntityManager();
				cl=em.find(Clothes.class,Id);
				if(cl!=null) {
					 
					et=em.getTransaction();
					et.begin();
					cl.setBrand(brand);
					cl.setPrice(price);
					em.merge(cl);
					et.commit();
				}
			}catch(Exception e) {
				et.rollback();
				e.printStackTrace();
			}finally {
				if(em!=null)
					em.close();
			}
		}
		public void updateManufacturedYearById(Year manufacturedYear, Integer Id) {
			EntityManager em=null;
			EntityTransaction et=null;
			Clothes cl=null;
			try {
				em=emf.createEntityManager();
				cl=em.find(Clothes.class,Id);
				if(cl!=null) {
					et=em.getTransaction();
					et.begin();
				 cl.setManufacturedYear(manufacturedYear);
				em.merge(cl);
				et.commit();
				}
			}catch(Exception e) {
				et.rollback();
				e.printStackTrace();
			}
			finally {
				if(em!=null)
					em.close();
					
				}
			}
		public void deleteById(Integer Id) {
			EntityManager em=null;
			EntityTransaction et=null;
			Clothes cl=null;
			try {
				em=emf.createEntityManager();
				cl=em.find(Clothes.class,Id);
				if(cl!=null);
				et=em.getTransaction();
				et.begin();
				em.remove(cl);
				et.commit();
			
		}catch(Exception e) {
			et.rollback();
			e.printStackTrace();
			
			}
			
		}
}

		