package com.ksg.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		
		
		LinkedList<String> linkedList =new LinkedList<String>();
		
		linkedList.add("jay");
		linkedList.add("vikas");
		linkedList.add("hem");
		linkedList.add("neha");
		linkedList.add("neha");
		linkedList.add("null");
		
		Iterator<String>itr= linkedList.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
	}

}
