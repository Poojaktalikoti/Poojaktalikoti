package com.xworkz.clotes.runner;


import com.xworkz.clothes.entity.Clothes;
import com.xworkz.clothes.entity.dao.ClothesDAO;
import com.xworkz.clothes.entity.dao.ClothesDAOImpl;

public class MainClass {
	public static void main(String[] args) {
		
		Clothes cl=new Clothes();
		cl.setClothesId(1);
		cl.setBrand("Avassa");
		cl.setPrice(300.99);
		cl.setManufacturedYear(new Year(2019));
		

		ClothesDAO dao=new ClothesDAOImpl();
		dao.SaveClothes(cl);
		dao.getClothesById(1);
		dao.updateClothBrandById("Avassa",300.99,1);
		dao.updateManufacturedYearById(2019);
		System.out.println("Success");
		
		
		
		
		
		
		
	}
	

}
