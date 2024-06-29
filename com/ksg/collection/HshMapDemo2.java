package com.ksg.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HshMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			HashMap <Integer,String> hashMap = new HashMap<Integer,String>();
			
			hashMap.put(99,"haj");
			
			System.out.println(hashMap );
			
			Iterator<Map.Entry<Integer, String>> itr = hashMap.entrySet().iterator();
	        
	        while(itr.hasNext()) {
	            
	            Map.Entry<Integer, String> entryMap = itr.next();
	            
	            System.out.println(entryMap.getKey()+" "+entryMap.getValue());
			

	}

	}
	
}
