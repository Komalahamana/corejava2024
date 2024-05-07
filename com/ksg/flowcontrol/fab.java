package com.ksg.flowcontrol;

public class fab {

	public static void main(String[] args) {
		
		int as = 2;
		int sd = 3;
		int temp = 0;
				
				System.out.println(as+","+sd);
				
				for(int i =2;i<=10;i++) {
				
				temp = as+sd;
				as=sd;
				sd=temp;
				
				System.out.println(temp+",");
	}
	}
}
