package com.ksg.multithreading;

public class YeildDemoThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread myThread = new MyThread ();
		
		myThread.start();
		 for (int i = 1;i<=10;i++) {
			 
			 System.out.println("main thread");
		 }
	}

}
