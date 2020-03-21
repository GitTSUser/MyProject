package com.flipkart.model;

import java.util.Date;

public class Product {

	private int id;
	private String name;
	private double price;
	private Date manufactureDate;

	public Product() {
	}

	public Product(int id, String name, double price, Date manufactureDate) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.manufactureDate = manufactureDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String toString() {
		return "Product id=" + id + ", name=" + name + ", price=" + price + ", manufactureDate=" + manufactureDate;
	}

}
