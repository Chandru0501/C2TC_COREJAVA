package com.tns.ifet.daythree.constructor;

public class Customer {
	private String customerName;
	private int customerId;
	private String customerCity;
	// Default Constructor
	public Customer() {
	System.out.println("DefaultConstructor");
	}
	public Customer(String customerName, int
	customerId, String customerCity) {
	this(); //calling default constructor
	System.out.println("ParameterizedConstructor");
	this.customerName = customerName;
	this.customerId = customerId;
	this.customerCity = customerCity;
	}
	//Getter and Setters
	public String getCustomerName() {
	return customerName;
	}
	public void setCustomerName(String
	customerName) {
	this.customerName = customerName;
	}
	public int getCustomerId() {
	return customerId;
	}
	public void setCustomerId(int customerId) {
	this.customerId = customerId;
	}
	public String getCustomerCity() {
	return customerCity;
	}
	public void setCustomerCity(String
	customerCity) {
	this.customerCity = customerCity;
	}
	@Override
	public String toString() {
	return "Customer [customerName=" +customerName + ", customerId=" + customerId + ",customerCity="+ customerCity + "]";
	}
}