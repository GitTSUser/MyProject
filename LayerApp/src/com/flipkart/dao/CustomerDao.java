package com.flipkart.dao;

import java.util.List;

import com.flipkart.model.Customer;

public interface CustomerDao {

	boolean addCustomer(Customer c);
	boolean updateCustomer(Customer c);
	Customer getCustomer(int id);
	
	List<Customer> getAllCustomers();
}