package com.app.tester;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.app.core.Pen;
import com.app.utils.Penutils;
public class Penapplication {
public static void main(String[] args) {
	try(Scanner sc= new Scanner(System.in)){
		
		Map<String,Pen> pens= new HashMap<>();
		boolean exit=false;
		while(!exit) {
			System.out.println(" Options : 1.add new pen \n 2.display details \n 3.update stock \n 4.set discount  \n 5.remove pen ");
			
			System.out.println("enter your choice");
			try {
			switch(sc.nextInt()) {
			case 1:
				System.out.println("pen details: brand,color,inkcolor,material,stock,updatedate,listingdate,price,discount");
				Pen pen=Penutils.addNewPen(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),sc.nextInt(),pens);
				pens.put(pen.getBrand(),pen);
				
				System.out.println("pen detals added");
			break;
			case 2:
				System.out.println("all account details");
				for(Pen p:pens.values()) {
					System.out.println("in for");
					System.out.println(p);}
				
				break;
				
			
			case 3:
				System.out.println("enter brandbname, and newstockvalue");
				 Pen pen1=Penutils.updatestock(sc.next(),sc.nextInt(),pens);
				 System.out.println( " updated pen details");
				 System.out.println( pen1);
				
				   
				break;
			case 4:
				
				Penutils.setdiscount(pens);
				System.out.println("discount of 20 persent set");
				
				break;
			
			case 5:
				Penutils.removepens(pens);
				//System.out.println("pen removed");
				break;
			}
			}
			catch(Exception e) {
				System.out.println(e);
				sc.nextLine();
			}
			
			
			
			
		}
		
		
		
		
		
	}
}
}
