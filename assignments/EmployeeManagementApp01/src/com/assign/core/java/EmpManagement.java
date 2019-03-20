package com.assign.core.java;


import java.io.Serializable;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class EmpManagement implements Comparable<EmpManagement>, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8325706464049338946L;
	
    int id;
	public String name;
	public double salary;
	public String dept;
	public int age;
	 
	Scanner in = new Scanner(System.in);
    Set<EmpManagement> employees = new TreeSet<EmpManagement>();

	public EmpManagement() {
		
	}
	public EmpManagement(int id, String name, double salary, String dept, int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.age = age;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 		@Override
	public String toString() {
		return ( id +" \t" + name + "\t\t\t " + salary + " \t\t" + dept + " \t\t\t"+ age);
	  
	}
	@Override
	public int compareTo(EmpManagement o) {
		
		  if(id>o.id){  
		        return 1;  
		    }else if(id<o.id){  
		        return -1;  
		    }else{  
		    return 0;  
		    }  
		  }
	 

			public double compare(EmpManagement o1, EmpManagement o2) {
				return o1.salary - o2.salary;
				
			}
	      
	 }
	  
	

	 
			
	
	
	
   
	

