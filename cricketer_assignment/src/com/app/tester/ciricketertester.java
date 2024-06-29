package com.app.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.app.core.Cricketer;
import com.app.utils.CricketerComparator;
import com.app.utils.CricketerUtils;

public class ciricketertester {
public static void main (String[] args) {
	
	try(Scanner sc=new Scanner(System.in)){
		
	
	List<Cricketer> cricketers=new ArrayList<>();
		boolean exit=false;
		while(!exit) {
			System.out.println("options are:---1.add cricketer \n 2.display cricketers 3.modify cricketer rating \n 4.search cricketer byname \n 5.sort bt rating");
			System.out.println("enter your chice");
			
			try {
				switch(sc.nextInt()) {
				case 1:
					Cricketer c=CricketerUtils.addrCricketer(sc.next(), sc.nextInt(),sc.next(),sc.next(), sc.nextInt(), cricketers);
				      cricketers.add(c);
					break;
					
				case 2:
					CricketerUtils.dislaycrick(cricketers);
					break;
					
				case 3: 
					CricketerUtils.modifyRating(sc.next(), sc.nextInt(), cricketers);
				System.out.println("rating modified");
					break;
				
				case 4:
					Cricketer c1=CricketerUtils.SearchByName(sc.next(), cricketers);
					System.out.println(c1);
					break;
				case 5:
					
					Collections.sort(cricketers,new CricketerComparator());
					break;
			}}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
}
