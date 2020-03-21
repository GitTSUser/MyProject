package com.flipkart.controller;

import java.util.List;

import com.flipkart.model.Product;
import com.flipkart.service.CustomerService;
import com.flipkart.service.CustomerServiceImpl;

public class CustomerController {

	private CustomerService service;
	
	
	public CustomerController() {

		if(null==service) {
			service=new CustomerServiceImpl();
		}
	}
	
	
	public List<Product>  getCustomerProducts(int customerId){
		return service.getProductsForCustomer(customerId);
	}
}
