package com.examples.java.collection;

//import com.assign.core.java.Employees;

public class Employees<T> implements Comparable {

	
	int id;
	  String name;
	  T salary;
	
	  
	
   public Employees() {
   	
   }
   public Employees(int id,String name,T salary) {
   	
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
	public T getSalary() {
		return salary;
	}
	public void setSalary(T salary) {
		this.salary = salary;
	}
	public static void main(String[] args)
	{
	 
	 Employees<Integer> emp = new Employees<>();
	 Employees[] EmpObj = new Employees [4];
	 
	// Employees emp2 = new Employees();
	 
	 
	 EmpObj[0] = new Employees<Integer>(1,"sakshi",50000);
	 EmpObj[1] = new Employees<Integer>(2,"shreya",50000);
	 EmpObj[2] = new Employees<Integer>(3,"pooja",70000);
	 EmpObj[3] = new Employees<Integer>(4,"rasika",50000);

	 for(Employees Emp:EmpObj) {
		 System.out.println(Emp.id+" "+Emp.name+" "+Emp.salary);
	 }
	
	}
	public String toString()
	{
		return String.valueOf(this.getId())+" "+String.valueOf(this.getName()+" "+String.valueOf(this.getSalary()));
	}
	
//    @SuppressWarnings("hiding")
//	public static void avgSal( ) {
//	for(<T> salary : empHash)
//		
//	}
	 
	 @Override
	 public int hashCode() {
		 return this.getId() % 5;
	 } 
	
	@Override
	public int compareTo(Object o1) {
	     if(o1 instanceof Employees) {
		return this.getName().compareTo(((Employees) o1).getName());
	     }
    return 0;
	}
}