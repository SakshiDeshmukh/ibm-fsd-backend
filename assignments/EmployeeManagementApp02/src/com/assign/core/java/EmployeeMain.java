package com.assign.core.java;

import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class EmployeeMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		EmployeeDao dao = new EmployeeDao();
		EmployeeService service=new EmployeeService();
		Scanner in = new Scanner(System.in);
        while(true)
		{
		    System.out.println("*******Employee Management Menu***********");
		    System.out.println("1. Add  an Employee");
		    System.out.println("2. View Employee details");
            System.out.println("3. Modify Employee details");
            System.out.println("4. Remove Employee details");
            System.out.println("5. Print Statistics");
            System.out.println("6. Import");
            System.out.println("7. Export");
            System.out.println("8. Exit");
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("Enter Your Choice Here:-");
             
            int choice = in.nextInt();
            
            Employee emp =null;

            switch(choice) {
            case 1:
            	service.add(emp);              
               	     break;
            case 2:
            	service.view(emp);
                break;
            case 3 :
          	    System.out.println("Enter ID of employee To be Searched:");
          	    int sid = in.nextInt();
                System.out.println("====================================================================================");
                System.out.println("ID"+"\t"+"NAME"+"\t\t"+"SALARY"+"\t\t"+"DEPARTMENT"+"\t\t"+"AGE");
                System.out.println("====================================================================================");
          	    service.searchId(sid);
          	    break;

            case 4:
          	    System.out.println("Enter Employee ID to be Modified");
          	    int mid = in.nextInt();
          	    System.out.println("Enter Salary to be Modified");
        	    int sal = in.nextInt();
        	    service.update(mid,sal);
          	    break;
          	  
            case 5:
          	    System.out.println("enter Employee ID to delete record");
          	    int iddel = in.nextInt();
          	    service.delete(iddel);
          	    break;
            case 6:
            	service.stat();
          	    break;
            case 7:
            	Callable<Boolean> imp = new Callable<Boolean>() {
          	  
          	@Override
          	public Boolean call() throws Exception{
          		System.out.println(Thread.currentThread()+"waiting to start");
          		Thread.sleep(5000);
          		dao.importData();
              	return true;
          	  }
            };
            ExecutorService e1 =Executors.newFixedThreadPool(1);
            Future<Boolean> f1 = e1.submit(imp);
            System.out.println(f1);
            e1.shutdown();
            
            case 8:
            	Callable<Boolean> ex = new Callable<Boolean>() {
                	  
            @Override
            public Boolean call() throws Exception{
            System.out.println(Thread.currentThread()+"waiting to start");
            Thread.sleep(1000);
            dao.exportData();
            return true;
              }
            };
            ExecutorService e2 =Executors.newFixedThreadPool(1);
            Future<Boolean> f2 = e2.submit(ex);
            System.out.println(f2);
            e2.shutdown();
          	break;
            case 9:
          	  System.out.println("Thank You!!!!");
          	  System.exit(0);
          	  break;
          default:
          	  System.out.println("Please Enter valid choice");
            }

		}	
			
	}

}
