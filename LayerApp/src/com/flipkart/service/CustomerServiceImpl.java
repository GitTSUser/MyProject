package com.flipkart.service;

import java.util.List;

import com.flipkart.dao.CartDao;
import com.flipkart.dao.CartDaoImpl;
import com.flipkart.dao.CustomerDao;
import com.flipkart.dao.CustomerDaoImpl;
import com.flipkart.model.Customer;
import com.flipkart.model.Product;

public class CustomerServiceImpl implements CustomerService {

	private static CustomerDao customerDao;
	private static CartDao cartDao;
	public CustomerServiceImpl() {
		if(customerDao==null) {
			customerDao=new CustomerDaoImpl();
			cartDao=new CartDaoImpl();
		}
	}
	
	@Override
	public List<Product> getProductsForCustomer(int customerId) {

		Customer customer = customerDao.getCustomer(customerId);
		
		if(customer==null) {
			throw new CustomerException("Customer is not available with given Id:"+customerId);
		}
		
		
		List<Product> productsOfCustomer = cartDao.getProudctsOfCustomer(customer.getId());
		
		return productsOfCustomer;
	}

}
