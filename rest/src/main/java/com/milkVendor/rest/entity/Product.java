package com.milkVendor.rest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;	

	@Column(name = "Price")
	private double price;
	
	@Column(name = "Title")
	private String title;
		
	@Column(name = "Description")
	private double description;
	
	@Column(name = "Categories")
	private String[] categories;
	
	@Column(name = "Images")
	private Image[] images;
	
	@Column(name = "Deleted")
	private int isDeleted;

	@Column(name = "Active")
	private int isActive;
	
}
