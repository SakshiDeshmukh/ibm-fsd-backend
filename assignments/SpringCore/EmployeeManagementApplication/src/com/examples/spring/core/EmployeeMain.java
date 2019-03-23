package com.examples.spring.core;

import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Predicate;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
	static boolean validate(Predicate<Employee> validator, Employee e) {
		if (!validator.test(e)) {
			System.out.println("Invalid Details");
			return false;
		}
		return true;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");
		Employee e = (Employee) context.getBean("employee");
		EmployeeService empservice = (EmployeeService) context.getBean("employeeservice");
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.println("*******Employee Management Menu***********");
			System.out.println("1. Add  an Employee");
			System.out.println("2. View Employee details");
			System.out.println("3. Modify Employee details");
			System.out.println("4. Remove Employee details");
			System.out.println("5. Search Employee details By Id");
			System.out.println("6. Print Statistics");
			System.out.println("7. Import");
			System.out.println("8. Export");
			System.out.println("9. Exit");
			System.out.println(
					"----------------------------------------------------------------------------------------");
			System.out.println("Enter Your Choice Here:-");

			int choice = in.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Name : ");
				String name = in.next();
				e.setName(name);
				System.out.println("Enter Salary : ");
				int salary = in.nextInt();
				e.setSalary(salary);
				boolean valSal = validate(emp -> emp.getSalary() > 0, e);
				if (valSal == true)// (!valStatus)
				{
					System.out.println("Valid Salary!!!");
				} else {
					System.out.println("Invalid Salary..Enter Valid One!!");
					int salary1 = in.nextInt();
					e.setSalary(salary1);
				}
				System.out.println("Salary::\n" + e.salary);

				System.out.println("Enter Department : ");
				String dept = in.next();
				e.setDept(dept);
				System.out.println("Enter Age : ");
				int age = in.nextInt();
				e.setAge(age);
				boolean valAge = validate(emp -> emp.getAge() > 20, e);
				if (valAge == true)// (!valStatus)
				{
					System.out.println("Valid Age!!!");
				} else {
					System.out.println("Invalid Age..Enter Valid One!!");
					int age1 = in.nextInt();
					e.setAge(age1);
				}
				System.out.println("Age::\n" + e.age);
				empservice.add(e);
				break;
			case 2:
				System.out.format("\t%s \t%s \t%s \t%s \t%s\n", "Id", "Name", "Salary", "Department", "Age");
				System.out.println(empservice.view());
				break;
			case 3:
				System.out.println("Enter Employee ID to be Modified");
				int mid = in.nextInt();
				System.out.println("Enter Salary to be Modified");
				int sal = in.nextInt();
				empservice.update(mid, sal);
				break;
			case 4:
				System.out.println("enter Employee ID to delete record");
				int iddel = in.nextInt();
				empservice.delete(iddel);
				break;
			case 5:
				System.out.println("Enter ID of employee To be Searched:");
          	    int idsr = in.nextInt();
                System.out.println("====================================================================================");
                System.out.println("ID"+"\t"+"NAME"+"\t\t"+"SALARY"+"\t\t"+"DEPARTMENT"+"\t\t"+"AGE");
                System.out.println("====================================================================================");
          	    empservice.search(idsr);
          	    break;
			case 6:
				empservice.stat();
				break;
			case 7:
				Callable<Boolean> imp = new Callable<Boolean>() {

					@Override
					public Boolean call() throws Exception {
						System.out.println(Thread.currentThread() + "waiting to start");
						Thread.sleep(5000);
						empservice.importD();
						return true;
					}
				};
				ExecutorService e1 = Executors.newFixedThreadPool(1);
				Future<Boolean> f1 = e1.submit(imp);
				System.out.println(f1);
				e1.shutdown();
				break;
			case 8:
				Callable<Boolean> ex = new Callable<Boolean>() {

					@Override
					public Boolean call() throws Exception {
						System.out.println(Thread.currentThread() + "waiting to start");
						Thread.sleep(1000);
						empservice.export();
						return true;
					}
				};
				ExecutorService e2 = Executors.newFixedThreadPool(1);
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
