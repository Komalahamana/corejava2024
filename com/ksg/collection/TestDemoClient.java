package com.ksg.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestDemoClient {
	
	public static void main(String[] args) {
		
		
		ArrayList<Student> list= new ArrayList<>();
		
		
		Student s1 = new Student(1,"raja");
		
		Student s2 = new Student(2,"komal");
		
		
		list.add(s1);
		list.add(s2);
		
		System.out.println(list);
		
	    Iterator<Student> itr= list.iterator();
	    
	    while(itr.hasNext()) {
	    	
	    	System.out.println(itr.next());
	    }
	    
	     {
	    	
	    	
	    }
	}

}
