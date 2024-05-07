package com.ksg.codingstd;

public class StudentGrade {

	public static void main(String[] args) {
		
		int hindi=70;
        int maths=65;
        int english=70;
        int science=65;
        
        char grade ;
        
        int total = hindi+maths+english+science;
        
        int per = total/4;
        
        if(per>=85)
            grade='A';
        else if(per<85 && per>=70)
            grade='B';
        else if(per<70 && per>=55)
            grade='C';
        else if(per<55 && per>=40)
            grade='D';
        else 
            grade='E';
        
        System.out.println(grade);

    

	}

}
