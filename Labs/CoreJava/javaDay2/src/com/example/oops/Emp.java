package com.example.oops;

public class Emp{ 
	public static void main(String[] args) {
	
		
		
	
	//Employee emp2 = new Employee(23,"CS",20000);
	    
   //emp2.setAge(40);
		//Employee employee = new Employee(100, "Anand", 35, "Male", "Sr.Developer", "IT", 50000);
				Employee employee = new Employee();
				employee.setDepartment("Admin");
				employee.setDesignation("Software Engineer");
				employee.printDetails();	
				//Apprasiable appraisable;
				//apprasiable = new Employee(100, "Anand", 35, "Male", "Sr.Developer", "IT", 50000);
				employee.appraise();
   	
				Conctractor con = new Conctractor();
				con.printDetails();
	}
}