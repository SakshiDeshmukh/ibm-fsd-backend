package com.assign.core.java;

public class EmployeeMain {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		Employee[] empObj = new Employee[5];
	    
		
		 empObj[0]=new Employee(1,"Sakshi",12000);
		 empObj[1]=new Employee(2,"Pooja",26000);	 
		 empObj[2]=new Employee(3,"Shreya",27000);
		 empObj[3]=new Employee(4,"Rasika",30000);
		
		 
		
		 for(Employee e:empObj) {
			 System.out.println("Id : "+e.getId());
			 System.out.println("name : "+e.getName());
			 System.out.println("Salary : "+e.getSal());
		 }
		 System.out.println("updated Employee details : ");
		 for(Employee e:empObj) {
			 empObj[0].setId(10);
			 empObj[0].setName("renuka");
			 empObj[0].setSal(38000);
			 System.out.println("id "+e.getId()+" name "+e.getName()+" Salary "+e.getSal());
		 }
		 System.out.println("Search Employee according to name");
		 for(Employee e:empObj) {
			 if(e.getName()=="Shreya") {
				 System.out.println("Id "+e.getId()+" Name "+e.getName()+" Salary "+e.getSal());
				 
			 }
		 }
		 

		 System.out.println("delete array element");
		 empObj[3]=null;
		 for(Employee e:empObj) {
			if(e!=null) {
				System.out.println("Id : "+e.getId());
				 System.out.println("name : "+e.getName());
				 System.out.println("Salary : "+e.getSal());
			}
			 
		 }
		
	}

}
