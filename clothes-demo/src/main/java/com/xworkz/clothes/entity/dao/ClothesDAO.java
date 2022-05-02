package com.xworkz.clothes.entity.dao;

import java.time.Year;

import com.xworkz.clothes.entity.Clothes;

public interface ClothesDAO {
	
	public void SaveClothes(Clothes clothes);
	public Clothes getClothesById(Integer Id);
	public void updateClothBrandById(String brand,Double price,Integer Id);
	public void deleteById(Integer Id);
	public void updateManufacturedYearById(Year manufacturYear);
	

}