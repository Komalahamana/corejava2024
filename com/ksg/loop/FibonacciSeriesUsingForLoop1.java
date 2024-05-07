package com.ksg.loop;

public class FibonacciSeriesUsingForLoop1 {

	public static void main(String[] args) {
	
 //fibonacci series : 1,1,2,3,5,8,13
        
        int x = 1;
        
        int y = 1;
        
        int temp = 0;
        
        System.out.print(x+","+y);
        
        for (int i = 1; i < 10; i++) {
            
            temp = x+y;
            x = y;
            y=temp;
            System.out.print(","+temp);
            
        }

	}

}
