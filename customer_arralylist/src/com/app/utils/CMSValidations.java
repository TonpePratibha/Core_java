package com.app.utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import com.app.core.Customer;
import com.app.core.ServicePlan;
import com.app.custom_exceptions.CMSException;


public class CMSValidations {
//add a method to check for dup customer (by email)
	public static void checkForDupCustomer(String email, List<Customer> customerList) throws CMSException {
		// 1. create customer class instance wrapping PK
		Customer newCust = new Customer(email);// a3@gmail.com
		// invoke contains using the customer ref.
//List : {c1,c2,c3,c4,c5.....} with emails : a1@gmail.com ....a5@gmail.com
		if (customerList.contains(newCust))
			throw new CMSException("Dup Email !!!!");
	}

	// add a method to parse n validate plan n it's charges
	public static ServicePlan parseAndValidatePlanAndCharges(String plan, double regAmount) throws CMSException {
//1. parse string(plan) -- > enum
		ServicePlan servicePlan = ServicePlan.valueOf(plan.toUpperCase());
		// => plan is valid , now chk if reg amount is correct
		if (servicePlan.getPlanCost() == regAmount)
			return servicePlan;
		// => incorrect reg amount : throw custom exc
		throw new CMSException("Reg amount doesn't match with the chose plan cost");

	}

	// add a method to validate all i/ps
	public static Customer validateCustomerInputs(String firstName, String lastName, String email, String password,
			double regAmount, String dob, String plan, List<Customer> customers) throws CMSException {
		// 1 . check for dup
		checkForDupCustomer(email, customers);
		ServicePlan servicePlan = parseAndValidatePlanAndCharges
				(plan, regAmount);
		LocalDate bithDate = LocalDate.parse(dob);
		validatepassword(password);
		 LocalDate birthdate =ParcingValidatingdob(dob);
		// => all i/ps are valid , ret validated customer details to the caller
		return new Customer(firstName, lastName, 
				email, password, regAmount, bithDate, servicePlan);
		
	}
	

	public static void validatepassword(String password) throws CMSException
	{
	   String regex="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[#@$*]).{5,20})";
	   //System.out.println("abcd".matches(regex));
	   if(!password.matches(regex))
	   throw new CMSException("invalid password");
	}	
	
	
	
	 public static LocalDate ParcingValidatingdob(String dob) throws CMSException{
		 LocalDate birthdate=LocalDate.parse(dob);
		 int age= Period.between( birthdate,LocalDate.now()).getYears();  //function of period 
		 
		 if( age<21) 
			 throw new CMSException("invalid age");
		 return birthdate;
	 }
//	 
//	 public static void RemoveElement(String plan,String dob) {
//		 LocalDate birthdate=LocalDate.parse(dob);
//		 ServicePlan splan = ServicePlan.valueOf(plan);
//		 Iterator<Customer> citr=new 
//	 }
	 
	 
	
	
	
	
	
	
	 
	 
}
