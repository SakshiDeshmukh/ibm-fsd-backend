package com.example.core.java;

public class Assign2_EmpDetails {

	static int id;
	String name;
	double salary;
	
	public Assign2_EmpDetails(String name,double salary) {
		
		this.name = name;
		this.salary = salary;
	}
		

		public String getName() {
			return name;
		}
		public void  setName(String name) {
			this.name = name;
		}


		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}
		
		
		public void printDetails() {
		
			System.out.println("Emp id: "+id);
			System.out.println("Name: " + this.getName());
			System.out.println("Salary: " + this.getSalary());
		}	
		
}
