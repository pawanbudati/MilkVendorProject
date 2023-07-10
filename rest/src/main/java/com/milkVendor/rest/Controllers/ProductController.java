package com.milkVendor.rest.Controllers;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.milkVendor.rest.dto.ProductDto;
import com.milkVendor.rest.utils.ResponseObject;

@RestController
@RequestMapping(path = "/api/product")
public class ProductController {

	@GetMapping("getAllProducts")
	public ResponseObject getAllProducts() {
		try {
			return null;
		} catch (Exception e) {
			return null;
		}
	}
	
	@GetMapping("getProduct")
	public ResponseObject getProduct(@RequestParam("productId")Integer id) {
		try {
			return null;
		} catch (Exception e) {
			return null;
		}
	}
	
	@PostMapping("saveProduct")
	public ResponseObject saveProduct(@RequestBody ProductDto productDto) {
		try {
			return null;
		} catch (Exception e) {
			return null;
		}
	}
	
	@DeleteMapping("removeProduct")
	public ResponseObject removeProduct(@RequestParam("productId")Integer id) {
		try {
			return null;
		} catch (Exception e) {
			return null;
		}
	}
	
	
}
