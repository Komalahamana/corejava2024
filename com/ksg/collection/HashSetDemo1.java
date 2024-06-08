package com.ksg.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> hashSet = new HashSet<String>();
        
        hashSet.add("Bharat");
        hashSet.add("Abhishek");
        hashSet.add("Komal");
        hashSet.add("Ram");
        hashSet.add("Akansha");
        hashSet.add("Komal");
        hashSet.add(null);
        hashSet.add(null);
        
        Iterator<String> itr = hashSet.iterator();
        
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        //hashSet.forEach((e1)->{System.out.println(e1);});
        
        


	}

}
