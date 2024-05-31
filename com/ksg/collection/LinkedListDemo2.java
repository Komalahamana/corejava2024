package com.ksg.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String>car= new LinkedList<String>();
		
		car.add("varna");
		car.add("scorpio");
		car.add("safari");
		car.add("audo");
		
		Iterator<String>itr = car. iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
	}

}
