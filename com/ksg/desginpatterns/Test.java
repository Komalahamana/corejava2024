package com.ksg.desginpatterns;

public class Test {

	public static void main(String[] args) {
		

		 Mysingleton mySingleton1 = Mysingleton.getInstance();
	        
	        System.out.println(mySingleton1.hashCode());
	        
	        Mysingleton mySingleton2 = Mysingleton.getInstance();
	        
	        System.out.println(mySingleton2.hashCode());
	        
	        
	}

}
