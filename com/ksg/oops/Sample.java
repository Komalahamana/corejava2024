package com.ksg.oops;

public class Sample extends Demo {

	public void method1() throws Exception {
        System.out.println("Method-1 of the Sample class is executed.");
    }

    public void method2() {
        System.out.println("Method-2 of the Sample class is executed.");
    }

    public static void main(String args[])throws Exception {
        Demo d1 = new Demo();
        Demo d2 = new Sample();
        d1.method1();
        d2.method1();
        d1.method2();
        d2.method2();
    
		
	}

}
