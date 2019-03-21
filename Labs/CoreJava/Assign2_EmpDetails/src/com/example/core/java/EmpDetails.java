package com.example.core.java;

public class EmpDetails {

	private Assign2_EmpDetails [] EmpDetails;
	private int size;
	
	public EmpDetails() {
		this.EmpDetails = new Assign2_EmpDetails[5];
		this.size=0;
	}
	public void addEmployee(String name,double salary) {
		this.EmpDetails[size] = new Assign2_EmpDetails (name,salary);
		this.size++;
	}
	
	public void employeeDetails() {
		for(int i=0;i<this.size;i++)
		{
		  Assign2_EmpDetails.id++;
			this.EmpDetails[i].printDetails();
			
		}
	
	}
	public static void main(String[] args) {
		EmpDetails emp2 = new EmpDetails();
	     
	     
	    
	    emp2.addEmployee( "Ram",40000 );
	    emp2.addEmployee ( "shyam",50000);
	    emp2.addEmployee ( "sita",80000);
	    emp2.addEmployee ( "gita",10000);
	    emp2.addEmployee ( "reeta",90000);
	 
	    emp2.employeeDetails();
	     
	
	}

}
