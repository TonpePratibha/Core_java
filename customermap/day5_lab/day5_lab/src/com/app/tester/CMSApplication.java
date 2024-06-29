package com.app.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.app.utils.SortbyDobLastame;
import com.app.core.Customer;
import com.app.utils.CMSValidations;
import com.app.utils.CmsUtils;
import com.app.core.*;
public class CMSApplication {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// init phase
			boolean exit = false;
			// init D.S
			Map<String,Customer> customerList =new HashMap<>();// size : 0 , init cap 10
			while (!exit) {
				System.out.println("Options : 1. Customer Sign Up 2. Display all 0. Exit");
				System.out.println("Choose");
				try {
					switch (sc.nextInt()) {
					case 1: // register new customer
						System.out.println(
								"Enter customer details : firstName,  lastName,  email,  password,	regAmount,  dob,  plan");
						Customer customer = CMSValidations.validateCustomerInputs(sc.next(), sc.next(), sc.next(), sc.next(),sc.nextDouble(), sc.next(), sc.next(), customerList);
						//=> all i/ps are valid
						customerList.putIfAbsent(customer.getEmail(),customer);
						System.out.println("customer registered....");
						break;
						
					case 2:
						for (Customer c : customerList.values()) {
							System.out.println(c + " ");
						}
						break;
						
					case 3:
						System.out.println("enter email, password");
						customer=CmsUtils.LoginValidation(sc.next(), sc.next(), customerList);
						System.out.println("login successful");	
						break;
						
					case 4:  System.out.println("enter email, password,new password");
						  customer=CmsUtils.LoginValidation(sc.next(), sc.next(), customerList);
						 customer.setPassword(sc.next());
						 System.out.println(" password changed");
						 System.out.println(customer.getPassword());   //to show password 
						break;
						 
					case 5:System.out.println("enter email to delete user");
					customer=CmsUtils.deleteCustomer(sc.next(),customerList);
					System.out.println(customer);
					System.out.println("user deleted");
					break;
					
//					case 6:
//					Collections.sort(customerList);
//					
//					break;
//				case 7:
//					Collections.sort(customerList,new SortbyDobLastame());
//				break;
				case 8:	
					  System.out.println("enter serviceplan and dob ");
					  CmsUtils.deletecustByPlanDob(sc.next(),sc.next(),customerList);
					  System.out.println(" matched values deleted");
					
				
					break;
					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					sc.nextLine();
					System.out.println(e);// toString
				}
			}
		}

	}

}
