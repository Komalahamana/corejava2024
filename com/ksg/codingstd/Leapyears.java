package com.ksg.codingstd;

public class Leapyears {

	public static void main(String[] args) {
		
		 int year = 2024;
	        
	        
	        if(year%100==0) {
	            if(year%400==0) {
	                System.out.println("Leap year");
	            }else {
	                System.out.println("Not leap years");
	            }
	        }else {
	            if(year%4==0) {
	                System.out.println("Leap year");
	            }else {
	                System.out.println("Not leap year");
	            }
	            
	        }

	}

}
