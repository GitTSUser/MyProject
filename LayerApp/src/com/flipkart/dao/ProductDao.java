package com.flipkart.dao;

import java.util.List;

import com.flipkart.model.Product;

public interface ProductDao {

	public boolean addProduct(Product product);

	public boolean updateProduct(Product product);

	public boolean deleteProduct(int id);

	public Product getProduct(int id);

	public List<Product> getAllProducts();

}
