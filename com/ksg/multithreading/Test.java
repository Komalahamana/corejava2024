package com.ksg.multithreading;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.out.println(Thread.currentThread().getName());
	        
	        Thread.currentThread().setName("Alok_Thread");
	        
	        System.out.println(Thread.currentThread().getName());


	}

}
