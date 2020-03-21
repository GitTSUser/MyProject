package com.flipkart.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {

	private static Map<Customer,List<Product>> cart;
	
	public Cart() {
		if(cart==null) {
			cart=new HashMap<>();
		}
	}

	public static Map<Customer, List<Product>> getCart() {
		return cart;
	}

	public static void setCart(Map<Customer, List<Product>> cart) {
		Cart.cart = cart;
	}
	
}