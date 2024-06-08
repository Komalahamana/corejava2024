package com.ksg.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("jay");
		treeSet.add("veeru");
		treeSet.add("vikas");
		treeSet.add("gourab");

		System.out.println(treeSet);
		
		Iterator<String>itr = treeSet.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
		
		
		

	}

}
