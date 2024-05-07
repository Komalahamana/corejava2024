package com.ksg.flowcontrol;

public class SwapUsingWithOutThirdVariable {
	
	public static void main(String[] args) {
		 int a = 20;
		 int b = 30;
		 System.out.println("before swap the value of a:"+a+" and the value of b:"+b);
		 a = a+b;//a=50(20+30)
		 b = a-b;//b=20  (50-30)
		 a = a-b;//a=30 (50-20)
		 System.out.println("after swap the value of a: "+a+" the value of b: "+b);

}

}