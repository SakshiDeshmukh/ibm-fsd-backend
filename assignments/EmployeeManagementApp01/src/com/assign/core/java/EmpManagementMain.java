package com.assign.core.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class EmpManagementMain{
	
	public static void main(String[] args) throws FileNotFoundException {
		
		EmpManagementMethods empmain = new EmpManagementMethods();
	     Scanner in = new Scanner(System.in);
      		while(true)
		{
			  System.out.println("*******Employee Management Menu***********");
			  System.out.println("1. Add  an Employee");
			  System.out.println("2. View Employee details");
			  System.out.println("3. Search Employee by ID");
			  System.out.println("4. Search Employee by Department");
              System.out.println("5. Modify Employee details");
              System.out.println("6. Remove Employee details");
              System.out.println("7. Print Statistics");
              System.out.println("8. Import");
              System.out.println("9. Exit");
              System.out.println("----------------------------------------------------------------------------------------");
              System.out.println("Enter Your Choice Here:-");
               
               int choice = in.nextInt();

               switch(choice) {
              case 1:
            	    empmain.addEmp();
                    System.out.println("Enter Your Choice Here:-");
                    //choice = in.nextInt();
            	     break;
              case 2:
            	
                  System.out.println("Enter Your Choice Here:-");
                  //choice = in.nextInt();
                  System.out.println("====================================================================================");
                  System.out.println("ID"+"\t"+"NAME"+"\t\t\t"+"SALARY"+"\t\t"+"DEPARTMENT"+"\t\t\t"+"AGE");
                  System.out.println("====================================================================================");
                  empmain.printDetails();
                  break;
              case 3:
            	  System.out.println("Enter ID of employee To be Searched:");
            	  int id = in.nextInt();
                  System.out.println("====================================================================================");
                  System.out.println("ID"+"\t"+"NAME"+"\t\t"+"SALARY"+"\t\t"+"DEPARTMENT"+"\t\t"+"AGE");
                  System.out.println("====================================================================================");
            	  empmain.SearchById(id);
            	  break;
              case 4:
            	  System.out.println("Enter Department of Employee To be Searched");
            	  String dept = in.next();
            	  empmain.SearchByDept(dept);
            	  break;
              case 5:
            	  System.out.println("Enter Employee ID to be Modified");
            	  int mid = in.nextInt();
            	  empmain.Update(mid);
            	  break;
            	  
              case 6:
            	  System.out.println("enter Employee ID to delete record");
            	  int iddel = in.nextInt();
            	  empmain.Remove(iddel);
            	  break;
              case 7:
            	  empmain.Statistics();   
            	  break;
              case 8:
            	  empmain.exportData();
              case 9:
            	    empmain.importData();
                	
            	  break;
              case 10:
            	  System.out.println("Thank You!!!!");
            	  System.exit(0);
            	  break;
            default:
            	System.out.println("Please Enter valid choice");
              }
 
		}
		

	}

}
