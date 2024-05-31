package com.ksg.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("Satish");
        list.add("Neha");
        list.add("Gourav");
        list.add("Neha");
        list.add(null);

        System.out.println("Iterate using iterator:");
        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Iterate using for each:");
        for (String str : list) {
            System.out.println(str);
        }
        
        System.out.println("Iterate using java 8 for each:");
        
        list.forEach((a)->{System.out.println(a);});

    }

}

