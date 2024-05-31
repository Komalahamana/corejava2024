package com.ksg.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<String> vector = new Vector <String>();
		
		vector.add("syham");
		vector.add("ram");
		vector.add("siya");
		vector.add("manohar");
		
		Enumeration<String> e = vector.elements();
		
		while(e.hasMoreElements()) {
		
		System.out.println(e.nextElement());
		
		}

	}

}
