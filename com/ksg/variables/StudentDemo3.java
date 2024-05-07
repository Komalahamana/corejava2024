package com.ksg.variables;

public class StudentDemo3 {

	 int id ;
	    
     String name;
    
    
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    } 
    
     public static void main(String[] args) {
         
        Student s1 = new Student(101,"Bhanu");
        
        
        System.out.println(s1.id);
        System.out.println(s1.name);
        
        Student s2 = new Student(102, "Satish");
        
        System.out.println(s2.name);
        
        
		

	}

}
