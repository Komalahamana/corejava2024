package com.ksg.loop;

public class ReverseOfString {

	public static void main(String[] args) {
		
		 String name = "alok";
	        
	        String[] charString = name.split("");  
	        
	        String temp = "";
	        
	        for(int i=charString.length-1; i>=0; i--) {  
	            
	            temp = temp+charString[i];   
	            
	        }
	        
	        System.out.println(temp);

	    }


	}


