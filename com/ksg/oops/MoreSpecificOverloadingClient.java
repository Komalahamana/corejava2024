package com.ksg.oops;

public class MoreSpecificOverloadingClient {




		public static void main(String[] args) {
	        
	        
	        MoreSpecificOverloading mso = new MoreSpecificOverloading();
	        
	        mso.m1(new StringBuffer("pawan"));
	        mso.m1("pawan");
	        //mso.m1(null); // NA
	}

}
