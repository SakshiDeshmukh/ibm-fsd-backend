package com.assign.core.java;



public class Employees implements Comparable {
	 int id;
	  String name;
	  double salary;
	  
	
    public Employees() {
    	
    }
    public Employees(int id,String name,double salary) {
    	
    	this.id = id;
    	this.name = name;
    	this.salary =salary;
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
//	public static void main(String[] args)
//	{
	@Override
	public int compareTo(Object o) {
	
		return 0;
	}
	 
	public String toString()
	{
		return String.valueOf(this.getId())+" "+String.valueOf(this.getName()+" "+String.valueOf(this.getSalary()));
	}
//	 Employees emp = new Employees();
	// Employees[] EmpObj = new Employees [4];
	 
	// Employees emp2 = new Employees();
	 
	 
	 //EmpObj[0] = new Employees(1,"sakshi",50000);
	 //EmpObj[1] = new Employees(2,"shreya",50000);
	// EmpObj[2] = new Employees(3,"pooja",70000);
	 //EmpObj[3] = new Employees(4,"rasika",50000);

	 //for(Employees Emp:EmpObj) {
		/* System.out.println(Emp.id+" "+Emp.name+" "+Emp.salary);*/
	 //}
	 
//	 for(Employees e:EmpObj) {
//		 EmpObj[0] = e.setId(7);
//		EmpObj[0] = e.name("shital");
//		 EmpObj[0] = e.salary(33000);	 
//	 }
}

	
	
