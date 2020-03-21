package com.flipkart.controller;

import java.util.List;

import com.flipkart.model.Product;
import com.flipkart.service.ProductService;
import com.flipkart.service.ProductServiceImpl;
import com.flipkart.util.DateConversion;

public class ProductController {

	
	private static ProductService service;
	
	public ProductController() {
		if(service==null) {
			service=new ProductServiceImpl();
		}
	}
	
	
	public void addProduct(int id,String name,double price,String dateOfManufacture) {
		
		Product p=new Product();
		p.setId(id);
		p.setName(name);
		p.setPrice(price);
		p.setManufactureDate(DateConversion.stringToUtilDate(dateOfManufacture));
	}
	
	public List<Product>  showProductsToCustomer(){
		return service.getAllProducts();
	}

}