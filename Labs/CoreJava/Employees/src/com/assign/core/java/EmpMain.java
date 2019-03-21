package com.assign.core.java;

import java.util.TreeSet;

public class EmpMain {
	
	
	

	public static void main(String[] args)
	{
	/*	TreeSet arr  = new TreeSet();
		
		Employees emp1 = new Employees(2,"advi",40000);
		Employees emp2 = new Employees(3,"ani",47000);
		Employees emp3 = new Employees(4,"sak",60000);
		Employees emp4= new Employees(5,"sru",700000);
		
		Employees[] eObj = new Employees[4];
		 
	    for(Object obj : arr) {
	    	System.out.println(obj);
	    }
	    
		
	    arr.remove(emp2);*/
		 Employees emp1 = new Employees();
		// Employees[] EmpObj = new Employees [4];
	//	Employees[] empObj = new Employees[4];
		TreeSet emp = new TreeSet();
		emp.add(new Employees(2,"advi",40000 ));
		emp.add(new Employees(3,"ani",47000 ));
		emp.add(new Employees(4,"sak",60000 ));
		emp.add(new Employees(5,"sru",700000));

		
		for(Object obj : emp) { ///add
	    	System.out.println(obj);
	    }
		
		for(Object obj : emp) { //update
	    	System.out.println(obj);
	    	if( emp1.getId()==4)
	    	{
	    		emp1.setSalary(30000);
	    		emp1.setName("Sakhi");
	    	}
	    }
		
		for(Object obj : emp) { //delete
	    	System.out.println(obj);
	    	if(emp1.getId()==4)
	    	{
	    		emp.remove(obj);
	    	}
	    }

		
		
	    

	}

}


