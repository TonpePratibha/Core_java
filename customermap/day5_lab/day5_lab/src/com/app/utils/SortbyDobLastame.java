package com.app.utils;

import java.util.Comparator;

import com.app.core.Customer;

public class SortbyDobLastame implements Comparator<Customer>{
	@Override
	   public int compare(Customer c1,Customer c2) {
			int val=c1.getDob().compareTo(c2.getDob());
			if(val==0) {
				
				
				if(c1.getLastName().compareTo(c2.getLastName())==-1){
					return -1;
				}
				if(c1.getLastName().compareTo(c2.getLastName())==0){
					return 0;
				}
				return 1;
				
			}
			return val;
	}
	
	
}
