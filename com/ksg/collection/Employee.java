package com.ksg.collection;

public class  Employee implements Comparable<Employee> {

	
		
		 private int id;
		    
		    private String name;
		    
		    Employee(int id, String name){
		        this.id=id;
		        this.name=name;
		    }

		    public int getId() {
		        return id;
		    }

		    public void setId(int id) {
		        this.id = id;
		    }

		    public String getName() {
		        return name;
		    }

		    public void setName(String name) {
		        this.name = name;
		    }

		    @Override
		    public String toString() {
		        return "Employee [id=" + id + ", name=" + name + "]";
		    }

		    public int compareTo(Employee e) {
		        
		        if(this.id<e.id) {
		            return -1;
		        }else if(this.id>e.id) {
		            return 1;
		        }else {
		            return 0;
		        }
		        
		    }

		

	}


