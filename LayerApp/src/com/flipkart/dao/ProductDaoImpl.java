package com.flipkart.dao;

import java.util.ArrayList;
import java.util.List;

import com.flipkart.model.Product;

public class ProductDaoImpl implements ProductDao {

	private static List<Product> products;

	public ProductDaoImpl() {
		if (null == products) {
			products = new ArrayList<Product>();
		}
	}

	@Override
	public boolean addProduct(Product product) {

		return products.add(product);
	}

	@Override
	public boolean updateProduct(Product product) {
		return false;
	}

	@Override
	public boolean deleteProduct(int id) {
		return false;
	}

	@Override
	public Product getProduct(int id) {

		Product p = null;
		for (Product product : products) {
			if (product.getId() == id) {
				p = product;
				break;
			}
		}
		return p;
	}

	@Override
	public List<Product> getAllProducts() {
		return products;
	}

}
