package com.milkVendor.rest.utils;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseObject {
	
	private String status;
	private String message;
	private List<?> response;

}
