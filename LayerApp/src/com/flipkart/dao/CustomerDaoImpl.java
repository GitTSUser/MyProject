package com.flipkart.dao;

import java.util.List;

import com.flipkart.model.Customer;

public class CustomerDaoImpl implements CustomerDao{

	private static List<Customer> customers;
	@Override
	public boolean addCustomer(Customer c) {
		return customers.add(c);
	}

	@Override
	public boolean updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer getCustomer(int id) {
		
		Customer c=null;
		
		for(Customer customer:customers) {
			if(customer.getId()==id) {
				c=customer;
				break;
			}
		}
		
		return c;
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customers;
	}

}
