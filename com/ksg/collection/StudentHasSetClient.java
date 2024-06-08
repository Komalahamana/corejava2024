package com.ksg.collection;

import java.util.HashSet;
import java.util.Iterator;

public class StudentHasSetClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 HashSet<Student> hashSet = new HashSet<Student>();
	        
	        Student s1 = new Student(101, "Satish");
	        Student s2 = new Student(102,"Gourav");
	        Student s3 = new Student(103, "Ramendra");
	        Student s4 = new Student(104,"Alok");
	        Student s5 = new Student(105,"Abhishek");
	        
	        hashSet.add(s1);
	        hashSet.add(s2);
	        hashSet.add(s3);
	        hashSet.add(s4);
	        hashSet.add(s5);
	        
	        Iterator<Student> itr = hashSet.iterator();
	        
	        while(itr.hasNext()) {
	            System.out.println(itr.next());
	        }
	        

	  

	}

}
