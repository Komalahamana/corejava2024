package com.ksg.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListDemo11 {

	public static void main(String[] args) {
		
		List<String>list= new ArrayList<String>();
		
		list.add("jay");
		list.add("komal");
		list.add("ram");
		list.add("gourav");
		list.add("ravi");
		
		System.out.println(" using by iterator");
		
		Iterator <String> itr=  list.iterator();
		 
		while(itr.hasNext()) {
		
		System.out.println(itr.next());
		
		
	}
	
	for(String str: list) {
		
		System.out.println(str);
		
		
	}
	
	
}
}
