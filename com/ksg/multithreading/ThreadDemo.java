package com.ksg.multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 MyThread myThread = new MyThread();
	        
	        myThread.start();
	        
	        for(int i=0;i<=10;i++) {
	            System.out.println("Main Thread");
	        }

	}

}
