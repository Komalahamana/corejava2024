package com.ksg.codingstd;

public class IncrementDemo1 {

	public static void main(String[] args) {
		
		//Pre increment operator
		
		int x = 4;
		
		 System.out.println("The orginal value of x: "+x);
	        
	        int y = ++x;
		
	        System.out.println("The value of x: "+x+" The value of y: "+y);
	        
	        
	        //Post increment
	        
	        int a = 4;
	        System.out.println("The orginal value of a : "+a);
	        int b = a++;
	        
	        System.out.println("The value of a : "+a+" The value of b: "+b);

	}

}

