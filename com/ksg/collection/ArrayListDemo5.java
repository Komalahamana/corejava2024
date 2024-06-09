package com.ksg.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo5 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		List<String>Car = new ArrayList<String>();
		
		Car.add("verna");
		Car.add("scorpio");
		Car.add("safari");
		Car.add("tata");
		
		Iterator<String>itr= Car.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
		
		

	}

}
