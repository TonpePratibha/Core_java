package com.app.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import com.app.core.Customer;

public class Ioutils {
           public static void writeDetails(List<Customer> clist , String Filename)throws IOException {
        	   try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(Filename))){
        		   out.writeObject(clist);
        	   }
           }
           @SuppressWarnings("unchecked")
		public
		static List<Customer> readDetails(String Filename) throws IOException,ClassNotFoundException{
        	   try( ObjectInputStream in=new ObjectInputStream(new FileInputStream(Filename))){
        		  return (List<Customer>)in.readObject();
        	   }
           }
}
