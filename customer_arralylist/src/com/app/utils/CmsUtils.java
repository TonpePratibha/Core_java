package com.app.utils;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

import com.app.core.Customer;
import com.app.core.ServicePlan;
import com.app.custom_exceptions.CMSException;

public class CmsUtils {
	
public static Customer LoginValidation(String email,String password,List<Customer>customers)throws CMSException {
	Customer cust=new Customer(email);
	int index=customers.indexOf(cust);  //contains not used beacuse it returns true or false value
	if(index==-1) 
		throw new CMSException("invalid email");	 
	   Customer customer= customers.get(index);
	   if(customer.getPassword().equals(password))  //not use == beacause string equals 
		return customer;
		throw new CMSException("INVALID PASSWORD");
}





public static Customer deleteCustomer(String email,List<Customer>customerlist)throws CMSException {
	  int index=customerlist.indexOf(new Customer(email));
	  if(index==-1)
		  throw new CMSException("invalid email");
	  return customerlist.remove(index);
}

public static void deletecustByPlanDob(String plan,String dob,List<Customer>customerList) {
	
	 LocalDate birthdate=LocalDate.parse(dob);
	 ServicePlan splan = ServicePlan.valueOf(plan.toUpperCase());
	 Iterator<Customer> citr=customerList.iterator();	   
	while(citr.hasNext()) {
		Customer c=citr.next();
		if(c.getPlan()==splan && c.getDob().isAfter(birthdate))
			citr.remove();
		
	}
	
        	
	
	
	
	
//	  if(customerlist.getPlan().equals(plan)) {
//		  Customer customer=new customer(plan)
//		  c1.getDob()<custmerlist.getdob(){
//			  iteratot
//			  hasnext
//			  next
//			  remove
//		  }
//	  }
}


//removal use forech

}
