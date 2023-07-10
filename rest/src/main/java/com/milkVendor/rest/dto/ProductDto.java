package com.milkVendor.rest.dto;

import com.milkVendor.rest.entity.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

	private String createdOn;
	private String createdBy;
	private String modifiedOn;
	private String modifiedBy;
	
	private Product product;
	
}
