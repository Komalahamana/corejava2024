package com.ksg.collection;

import java.util.ArrayList;

public class ArrayListDemo1 {
    
    public static void main(String[] args) {
        
        ArrayList arrayList = new ArrayList();
        
        arrayList.add("Satish");
        arrayList.add("Neha");
        arrayList.add("Gourav");
        arrayList.add("Neha");
        arrayList.add(null);
        arrayList.add(10);
        
        
        System.out.println(arrayList.size());
        
        System.out.println(arrayList);
        
    
    
    }

}