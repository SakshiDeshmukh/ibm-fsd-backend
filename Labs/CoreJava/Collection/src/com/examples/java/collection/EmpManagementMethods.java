
package com.examples.java.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
//import java.time.Month;
import java.time.Period;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

//import com.assign.core.java.Employee;

public class EmpManagementMethods  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2218572147993747672L;
	//private static int id;
	 int age;
	 double salary;
	
	 EmpManagement empl= new EmpManagement();
     Scanner in = new Scanner(System.in);
     Set<EmpManagement> employees = new TreeSet<EmpManagement>();
     
     
  //   EmpManagement mb = new EmpManagement(1,"sakshi",56677,"CS",23);
//     EmpManagement emp2 = new EmpManagement(2,"shree",60000,"Testing",32);
//     EmpManagement emp3 = new EmpManagement(3,"ram",70000,"Accounting",45);
//     EmpManagement emp4 = new EmpManagement(4,"sita",30000,"CS",53);
//     EmpManagement emp5 = new EmpManagement(5,"lakshman",50000,"IT",46);
//     EmpManagement emp6 = new EmpManagement(6,"pooja",8000,"CS",57);
 //    public EmpManagementMethods() {
 //   	 employees.add(mb);
//	     employees.add(emp2);
//	     employees.add(emp3);
//	     employees.add(emp4);
//	     employees.add(emp5);
//	     employees.add(emp6);
     
 public void importData() throws FileNotFoundException {
	 
	 EmpManagement e = null; int counter=0;
     try(Scanner in = new Scanner(new FileReader("C:\\Users\\SakshiKDeshmukh\\Desktop\\Documents\\JAVA\\InputByteStream.txt"))) {
    	 while(in.hasNextLine()) {
    		 String emp = in.nextLine();
    		 EmpManagement empl = new EmpManagement();
    		 StringTokenizer tokenizer = new StringTokenizer(emp,",");
    		// empl.setId((Integer.parseInt());
    		 
    		// empl.setName(String.);
      empl.setSalary(counter); 
    //	empl.setDept(dept);
    	empl.setAge(counter);
    	 }
    	 
     }
     
 }
     Iterator<EmpManagement> i=employees.iterator();
 	private int id;
     
 	
      public void printDetails() {
     	
 	 		for(Object O:employees) {
 			System.out.println(O);
 		//	id++;
 		}	
 	 		while(i.hasNext())
 	 		{
 	 		//	 id++;

 	 		System.out.println(i.next());
 	 		}
 	 		
      }
   
      public  void addEmp() {
     		
  		System.out.println("Enter details of Employee:");
  	    System.out.println("Enter Id\n");
  	     //id++;
  	     try {
  	     id = in.nextInt();
  	     }
  	     catch(InputMismatchException e){
  	    	//in.nextLine();
  	    	 System.out.println("Please Enter valid ID!");
 	 	     id= in.nextInt();

  	     }

  	     System.out.println("ID::"+id);
  	     System.out.println("Enter Name\n");
  	     String name = in.next();
  	     System.out.println("Name::"+name);
  	     System.out.println("Enter Salary\n");
  	     salary = in.nextInt();
  	     empl.setSalary(salary);
//  	     try {
//  	     salary = in.nextInt();
//  	     }
//  	     catch(InputMismatchException e) {
//  	    	 //in.nextLine();
//  	    	 System.out.println("Please Enter valid Salary!");
//  	    	 
//  	     }
//  	    boolean valSal = validate(new ValidateEmployee() {
// 	 		public boolean check(Emp empl) {
// 	 			return empl.getSalary() > 0;
// 	 		}
// 	 	}, empl );
  	   boolean valSal = validate(empl->empl.getSalary()> 0,empl);
  	   if(valSal== true)//(!valStatus)
 	     {
 	    	 System.out.println("Valid Salary!!!");
 	  
 	     }
  	   else {
 	    	 System.out.println("Invalid Salary..Enter Valid One!!");
 	    	 salary = in.nextInt();
 	     }
 	    
  	     
          System.out.println("Salary::\n"+salary);
  	     System.out.println("Enter Department\n");
  	     String dept = in.next();
  	     System.out.println("Department::\n"+dept);
  	     //System.out.println("Enter Age\n");
 	     //age = in.nextInt();
 	     //empl.setAge(age);
//       Employee Validation  with Anonymous inner class
// 	     boolean valAge = validate(new ValidateEmployee() {
// 	 		public boolean check(Emp empl) {
// 	 			return empl.getAge() > 20 && empl.getAge() <60;
// 	 			sssss
// 	 		}
// 	 	}, empl );
 	     
 	    //lambda-Expression
  	     LocalDate today = LocalDate.now();  
		 System.out.println("Enter Date of Birth ::");

		 System.out.println("Enter Year ::");
		 int yr = in.nextInt();

		 System.out.println("Enter Month ::");
		 int month = in.nextInt();

		 System.out.println("Enter Date ::");
		 int day = in.nextInt();

		
 	     
		 LocalDate birthday = LocalDate.of(yr,month,day);
		 Period p = Period.between(birthday, today);
//		     System.out.println(p.getDays());
//	 		 System.out.println(p.getMonths());
		 age = p.getYears();
         System.out.println("Age of Employee is"+age);
         System.out.println("Months:"+p.getMonths());
         System.out.println("days:"+p.getDays());

// 	    boolean valAge = validate(empl->empl.getAge()>20 && empl.getAge()<60,empl);
// 	     
//             if(valAge== true)//(!valStatus)
// 	         {
// 	    	   System.out.println("Please enter Valid Age!!!");
// 	  
// 	         } else
// 	         {	    	   
// 		        age = in.nextInt();
// 	          }
// 	     
// 	     System.out.println("Age::"+age);
// 	    
  			//Emp empObj = new Emp(id,name,salary,dept);
  			employees.add(new EmpManagement(id,name,salary,dept,age));
  			
  	 	    // in.nextLine();

  	     System.out.println("Record inserted successfully!!!!");
      }
    //validator interface
//  	public interface ValidateEmployee{
//  		public boolean check(Emp empl);
//  	}
  	// validator  method
  	 boolean validate(Predicate<EmpManagement> validator,EmpManagement empl) {
  		if(! validator.test(empl)) {
  			System.out.println("Invalid Details");
  			return false;
  		}
 		return true;
  	}
      public EmpManagement SearchById(int id) {
     	 for(EmpManagement e : employees) {
     	        if(e.getId() == id){
     	           // return e;
     	            System.out.println(e);
     	        }
     	    }
 		return null;
     	 
      }
      public EmpManagement SearchByDept(String dept) {
     	 for(EmpManagement e : employees) {
     	        if(e.getDept() == dept){
     	           // return e;
     	            System.out.println(e);
     	        }
     	        while(i.hasNext())
     	 		{
     	 		System.out.println(i.next());
     	 		}
     	    }
 		return null;
     	 
      }
      public void Update(int mid) {
     	 for(EmpManagement e : employees) {
     		 if(e.getId() == mid) {
     			System.out.println("Enter Name");
     			String name = in.next();
     			System.out.println("Enter Salary");
     			int salary = in.nextInt();
     			System.out.println("Enter DeptName");
     			String dept = in.next();
     			System.out.println("Enter Age");
     			int age = in.nextInt();
     			 
//     			 e.setName("divya");
//     			 e.setSalary(80000);
//     			 e.setDept("CS");
     	    	 System.out.println("Record Updated Successfully!!!!!");

     	    	 e.setName(name);
     	    	 e.setSalary(salary);
     	    	 e.setDept(dept);
     	    	 e.setAge(age);
     		 }
     		 else {
     	    	 System.out.println("Employee does not exists!!");

     		 }
     	 }

      }
    
 	public void Remove(int iddel) {
     	 EmpManagement delete = null;
     	 for(EmpManagement e : employees) {
     		 
     		 if(e.getId() == iddel) {
     			 delete = e;
     		 }
     	 }
     	 if(delete!=null) {
     		 employees.remove(delete);
     	   	  System.out.println("Record deleted Succesfully");

     	 }
    	  else {
    		  System.out.println(" Oops..Employee does not exists!!");
    	  }
      }
 	
 	 public void Statistics() {
 		long count ;
 		count = employees.stream().filter(emp->emp.getAge()>30).count();
         System.out.println("1]Count of Employees whose age is greater than 30: " + count);
         
         
               List<Integer> l = employees.stream()
         		.filter(emp->emp.getAge()>30)
         		.map(emp -> emp.id )//map--transforming/extracting data from one to another
 				.collect(Collectors.toList());
               System.out.println("2]List of id's whose age is greater than 30 " + l);
         
         
               Map map = new TreeMap();
                  map =  employees
         		.stream()
         		//.sorted((p1, p2) -> p1.getDept().compareTo(p2.getDept()))

         		.sorted(Comparator.comparing(EmpManagement::getDept))
         		.collect(Collectors.groupingBy(EmpManagement::getDept,TreeMap::new, Collectors.counting()));
                System.out.println("3]Count according to Dept ::"+map);
                
                  double totalSal = employees.stream()
                			.map(EmpManagement::getSalary)
                			.reduce((double) 0,(a,b)->a.doubleValue()+b.doubleValue()).doubleValue();      
                  		//parameters of reduce::1)identity-initial value or default (0)
                		//2)Accumulator-partial or final result //0+100 //100+200 //300+400 //700-final
                        //(accumulates partial with current value)
                  System.out.println("4]Sum of Salaries Of Employeees::"+totalSal);

                  
                  double avgSal = employees.stream()
                 			              .collect(Collectors.averagingDouble(EmpManagement::getSalary));
                   System.out.println("Avg Salary::"+avgSal);
                   
                    List<String> dept = employees.parallelStream().collect(Collectors.groupingBy(EmpManagement::getDept,Collectors.counting()))
                 		          .entrySet().stream()
                 		          .filter(emp-> emp.getValue()>1)
                 		          .map(Map.Entry::getKey)
                 		          .collect(Collectors.toList());
                    System.out.println("5]Dept having count 3 or more than 3"+dept);
                   
                   List<EmpManagement> list = employees.stream().filter(name->name.getName().startsWith("s")).collect(Collectors.toList());
                   System.out.println("6]Employee name starting with letter 's' "+list);

                   
                   
 		//String Regex = "";
 		boolean matches;
 		
 		
 		for(EmpManagement e :employees)
 		{
 		String regex = "r.*";
 		matches = Pattern.matches(regex, e.getName());
 		
 		if(matches  == true) {
 			employees.add(e);
 			System.out.println("name matching with letter 'r'");
 			System.out.println(e);
 		}
 		if(e.getDept()=="CS") {
 			//System.out.println("hello");
 			//count++;
 			employees.add(e);
 			System.out.println("Records with Dept Name 'CS':");
 			System.out.println(e);
 		}
 		 
 		if(e.getSalary()>30000) {
 			System.out.println("hello everyone");
 			// count++;
 			 employees.add(e);
 			 System.out.println("salary greater than 30000 ");
 			 System.out.println(e);
 			// System.out.println(count);
 		 }
 	     
// 		if(e.getAge()>20) {
// 		 count++;
// 		 employees.add(e);
// 		 System.out.println("Age greater than 20");
// 		 System.out.println(e);
// 	}
 		
 		}
 	}
 	

}