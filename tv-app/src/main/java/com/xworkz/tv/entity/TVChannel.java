package com.xworkz.tv.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="TVchannel")
public class TVChannel {
	
	@Id
	@Column(name="id")
	private int channelId;
	@Column(name="name")
	private String channelName;
	@Column(name="language")
	private String language;
	@Column(name="price")
	private double price;
	@Column(name="isFree")
	private boolean isFree;
	

}
