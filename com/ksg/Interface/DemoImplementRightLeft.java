package com.ksg.Interface;

public class DemoImplementRightLeft {


		@Override
	    public void m1() {
	        
	        System.out.println("m1 from demo!!!");
	        
	    }
	    
	    
	    public static void main(String[] args) {
	        
	        Demo demo = new Demo();
	        
	        demo.m1();
	        
	        Right right = new Demo();
	        
	        right.m1();
	        
	        Left left = new Demo();
	        
	        left.m1();
	        
	    
	    
	    

	


	}

}
