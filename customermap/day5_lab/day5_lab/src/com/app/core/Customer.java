package com.app.core;
/*
 * 1.Customer should be assigned system generated 
 * (auto increment) customer id : int
Store - first name, last name email(string),
password(string),registrationAmount(double),dob(LocalDate),
plan(ServicePlan : enum)
Unique ID - email (2 customers CAN NOT have SAME email id)
 */

import java.time.LocalDate;

public class Customer{
	private int customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private double regAmount;
	private LocalDate dob;
	private ServicePlan plan;
//add static field to generate customer ids
	private static int idGenerator;

	public Customer(String firstName, String lastName, String email, String password, double regAmount, LocalDate dob,
			ServicePlan plan) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.regAmount = regAmount;
		this.dob = dob;
		this.plan = plan;
		this.customerId = ++idGenerator;
	}
	//add overloaded ctor , to wrap PK (email)
	public Customer(String email) {
		this.email = email;
	}

	
	//toString : to return customer details

	public Customer(String email, String password) {
		// TODO Auto-generated constructor stub
		this.email=email;
		this.password=password;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", regAmount=" + regAmount + ", dob=" + dob + ", plan=" + plan + "]";
	}
	

	
	
	
	
	
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public ServicePlan getPlan() {
	return plan;
}
public void setPlan(String email) {
	this.plan = plan;
}
	
}
