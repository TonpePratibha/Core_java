package com.app.utils;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.app.core.Cricketer;
import com.pp.Custom_excptoions.CricketerException;

public class CricketerUtils {

	public static Cricketer addrCricketer(String name,int age,String email,String phone,int rating,List<Cricketer>cricketers)throws CricketerException{
		
		checkforDup(email,cricketers);
		validatingName(name,cricketers);
		return new Cricketer(name,age,email,phone,rating);
		
	}
	public static void validatingName (String name,List<Cricketer>cricketers) throws CricketerException{
		int a=name.length();
		if(a>8) 
			throw new CricketerException("name should have min 8 letters");
		
	}
	
	public static void checkforDup(String email,List<Cricketer>cricketers) throws CricketerException{
	
		Cricketer c=new Cricketer(email);
		if(cricketers.equals(c))
		throw new CricketerException("duplicate cricketer");
			
	}
	public static void dislaycrick(List<Cricketer>cricketers)throws CricketerException{
	for(Cricketer c:cricketers)	
		System.out.println(c);
	
	
	}
	public static void modifyRating(String email,int Rating,List<Cricketer>cricketers)throws CricketerException{
	Cricketer c=new Cricketer(email);
	if(cricketers.contains(c))
		c.setRating(Rating);
	
	}
	
	public static Cricketer SearchByName(String name,List<Cricketer>cricketers)throws CricketerException{
//		Cricketer c=new Cricketer(email);
//		if(cricketers.contains(c)&&c.getName()==name)
//			return c;
		
		Iterator<Cricketer>citr=cricketers.iterator();
		while(citr.hasNext()) {
			Cricketer c=citr.next();
		     if(c.getName()==name);
		     return c;
		
		}
		throw new CricketerException("not found");
		
		}
	
	
	
		
	
	
	
	
}
