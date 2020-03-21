package com.flipkart.dao;

import java.util.List;

import com.flipkart.model.Product;

public interface CartDao {

	public void addProductToCart(int customerId,Product product);
	
	public void updateProductToCart(int customerId,int productId);
	
	public List<Product>  getProudctsOfCustomer(int customerId);
	
	
}
