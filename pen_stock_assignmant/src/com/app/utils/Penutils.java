package com.app.utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.Iterator;
import java.util.Map;

import com.app.core.Material;
import com.app.core.Pen;
import com.app.custom_exceptions.PenException;

public class Penutils {

	
	public static Pen addNewPen(String brand,String color,String inkColor,String material,int stock,String updatedate,String Listingdate, int price,int discount,Map<String,Pen> pens)throws PenException {
		
		Material pmaterial= Material.valueOf(material.toUpperCase());
		LocalDate udate=LocalDate.parse(updatedate);
		LocalDate lisdate= LocalDate.parse(Listingdate);
		
		
		return new Pen(brand,color,inkColor,pmaterial,stock,udate,lisdate,price,discount);
		
		
		//Pen newpen=new Pen(.....)
		  // pens.put(newpen.getid(), newpen);   to add into pens
		
	}
	
	
	
	public static Pen updatestock(String brand,int newstock,Map<String,Pen>pens) throws PenException{
		
		Pen pen=pens.get(brand);
		if(pen!=null)
			pen.setStock(newstock);
				
		return pen;
		
		//here  use containskey(id) then update stock and also need to update stckupdateDate
		//
		
		
	}
	
	public static void setdiscount(Map<String,Pen>pens) throws PenException{
//		Pen pen=pens.get(brand)
				for(Pen p :pens.values()) {
					int d =Period.between(p.getUpdatedate(), LocalDate.now()).getMonths();
				if(d>3)
					p.setDiscount(20);
				    
		
	}
				}
	public static void removepens(Map<String, Pen> pens) throws PenException {
//	    Iterator<String, Pen> iterator = pens.entrySet().iterator();
//	    while (iterator.hasNext()) {
//	        Map.Entry<String, Pen> entry = iterator.next();
//	        Pen p = entry.getValue();
//	        int d = Period.between(p.getListingdate(), LocalDate.now()).getMonths();
//	        if (d > 9) {
//	            iterator.remove(); // Safe removal
//	        }
//	    }
		LocalDate date=LocalDate.now().minusMonths(9);
		pens.values().removeIf(i->(i.getListingdate().isBefore(date)));
	}


}
