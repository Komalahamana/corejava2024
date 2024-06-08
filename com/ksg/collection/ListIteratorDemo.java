package com.ksg.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

    public static void main(String[] args) {
        
        LinkedList<String> linkedList = new LinkedList<String>();
        
        linkedList.add("Bharat");
        linkedList.add("Shyam");
        linkedList.add("Akansha");
        linkedList.add("Satish");
        linkedList.add("Anjali");
        
        System.out.println(linkedList);
        
        ListIterator<String> listIterator = linkedList.listIterator();
        
        while(listIterator.hasNext()) {
            
            String str = listIterator.next();
            
            if(str.equals("Akansha")) {
                listIterator.remove();
            }
            if(str.equals("Bharat")) {
                listIterator.set("Bharat Rajpal");
            }
            if(str.equals("Satish")) {
                listIterator.add("Satish Singh");
            }
        }
        
        System.out.println(linkedList);

    }

}