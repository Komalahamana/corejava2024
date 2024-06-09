package com.ksg.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LaptopClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Laptop> list = new ArrayList<Laptop>();
		
		Laptop laptop1 = new Laptop(12,"dell");
		Laptop laptop2 = new Laptop(14,"hp");
		Laptop laptop3 = new Laptop(16,"lenovo");
		
		list.add(laptop1);
		list.add(laptop2);
		list.add(laptop3);
		
		System.out.println(list);
		
		Iterator<Laptop> itr = list.iterator();
		
		while(itr.hasNext());
		
		System.out.println(itr.next());
		
		
		
		
		
		

	}

}
