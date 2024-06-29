package com.ksg.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListDemo {
	
	public static void main(String[] args) {
		
		
		LinkedList<String>list= new LinkedList<>();
		
		list.add("harsh");
		list.add("jay");
		list.add("komal");
		list.add("om");
		
		Iterator<String>itr= list.iterator();
		
		while(itr.hasNext()) {
			
		System.out.println(itr.next());
		
		
			
		}
		for(String s:list) {
			
			
			System.out.println(s);
		}
		
	}

}
