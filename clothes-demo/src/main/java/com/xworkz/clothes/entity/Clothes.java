package com.xworkz.clothes.entity;

import java.time.Year;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Clothes")
public class Clothes {

	@Id
	@Column(name="Id")
	private int clothesId;
	@Column(name="Brand")
	private String Brand;
	@Column(name="price")
	private double price;
	@Column(name="manufacturedYear")
	private Year manufacturedYear;
	public void setManufacturedYear(Year manufacturedYear) {
		this.manufacturedYear=manufacturedYear;
		
	}

		
	}
