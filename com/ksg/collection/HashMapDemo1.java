package com.ksg.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
	        
	        hashMap.put(101, "Priyank");
	        hashMap.put(102, "Ashish");
	        hashMap.put(103, "Shyam");
	        hashMap.put(102, "Ram");
	        hashMap.put(null, "Hari");
	        hashMap.put(null, "abc");
	        hashMap.put(104, null);
	        hashMap.put(105, null);
	        
	    //    System.out.println(hashMap);
	        
	        
	        Iterator<Map.Entry<Integer, String>> itr = hashMap.entrySet().iterator();
	        
	        while(itr.hasNext()) {
	            
	            Map.Entry<Integer, String> entryMap = itr.next();
	            
	            System.out.println(entryMap.getKey()+" "+entryMap.getValue());
	        }
	        
	        

	    }

	

	}


