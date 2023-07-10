package com.milkVendor.rest.Services;

import org.springframework.stereotype.Service;

import com.milkVendor.rest.utils.ResponseObject;

@Service
public interface ProductService {
	
	public ResponseObject getAllProducts();
	public ResponseObject getProduct();
	public ResponseObject saveProduct();
	public ResponseObject removeProduct();
	
}
