package com.flipkart.service;

import java.util.List;

import com.flipkart.dao.ProductDao;
import com.flipkart.dao.ProductDaoImpl;
import com.flipkart.model.Product;

public class ProductServiceImpl implements ProductService {

	private static ProductDao dao;
	
	public ProductServiceImpl() {
		if(dao==null) {
			dao=new ProductDaoImpl();
		}
	}
	
	@Override
	public boolean addProduct(Product product) {
		return dao.addProduct(product);
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProduct(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Product getProduct(int id) {
		return dao.getProduct(id);
	}

	@Override
	public List<Product> getAllProducts() {
		return dao.getAllProducts();
	}

}
