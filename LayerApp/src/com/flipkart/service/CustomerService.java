package com.flipkart.service;

import java.util.List;

import com.flipkart.model.Product;

public interface CustomerService {

	List<Product>  getProductsForCustomer(int customerId);
}
