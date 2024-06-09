package com.ksg.collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer>vector = new Vector<Integer>();
		
	    for(int i=0;i<=10;i++) {
	    	vector.addElement(i);

	  
	  }
	    System.out.println(vector);
	    
	    Enumeration<Integer>e = vector.elements();
	    
	    while(e.hasMoreElements()) {
	    	Integer i = e.nextElement();
	    	
	    if (i%2==0);
	    System.out.println(i);
	    }
	    
	    
	    

	}

}
