package com.ksg.collection;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		
		 List<Student> list = new ArrayList<Student>();
	        
	        Student student1 = new Student(101,"Alok");
	        
	        Student student2 = new Student(102,"Satish");
	        
	        list.add(student1);
	        list.add(student2
	        		);
	        
	        System.out.println(list);

	    }

	



	}


