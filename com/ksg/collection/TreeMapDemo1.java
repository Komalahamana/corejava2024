package com.ksg.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) {
		
		TreeMap<Integer,String>treeMap= new TreeMap<>();	
		
		treeMap.put(111,"jaya");
		treeMap.put(33, "siva");
		treeMap.put(77, "neha");
		treeMap.put(66,"komal");
		
		Iterator<Map.Entry<Integer, String>> itr= treeMap.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry<Integer,String> entry=itr.next();
			
			System.out.println(entry.getKey()+""+entry.getValue());
		}
		
	}
}
