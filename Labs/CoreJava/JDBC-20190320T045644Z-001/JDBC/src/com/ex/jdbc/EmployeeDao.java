package com.ex.jdbc;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.sql.DataSource;

public class EmployeeDao {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/jdbctraining";
	static final String USER = "root";
	static final String PASS = "pass@word1";
	
	static Connection conn = null;
    static Statement stmt = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
		
	Scanner in = new Scanner(System.in);
	Employee e =new Employee();
	boolean validate(Predicate<Employee> validator,Employee e) {
			if(! validator.test(e)) {
		  			System.out.println("Invalid Details");
		  			return false;
		  		}
		 		return true;
		  	}
	public EmployeeDao(){
		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);///create connection
			
			System.out.println("Connection Estalished:"+conn);
			// STEP 4: Execute a query
			System.out.println("Creating statement...");
		}
		catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		}
//		}finally {
//			// finally block used to close resources
//			try {
//				if (pstmt != null)
//					pstmt.close();
//			} catch (SQLException se2) {
//			} // nothing we can do
//			try {
//				if (conn != null)
//					conn.close();
//			} catch (SQLException se) {
//				se.printStackTrace();
//			} // end finally try	
//		}
//
//     
//	}      
	       
	}
	public void addRecord() throws Exception {
        System.out.println("Enter Name : ");
	       e.name = in.next();
	       
	       System.out.println("Enter Salary : ");
	       e.salary = in.nextInt();
	       boolean valSal = validate(e->e.getSalary()> 0,e);
	  	   if(valSal== true)//(!valStatus)
	 	     {
	 	    	 System.out.println("Valid Salary!!!");
	 	  
	 	     }
	  	   else {
	 	    	 System.out.println("Invalid Salary..Enter Valid One!!");
	 	    	 e.salary = in.nextInt();
	 	     }
	 	    
	  	     
	          System.out.println("Salary::\n"+e.salary);
	       
	       System.out.println("Enter Department : ");
	       e.dept = in.next();
	       
	       System.out.println("Enter Age : ");
	       e.age = in.nextInt();
	       boolean valAge = validate(e->e.getAge()> 20,e);
	 	   if(valAge== true)//(!valStatus)
		     {
		    	 System.out.println("Valid Age!!!");
		  
		     }
		   else {
		    	 System.out.println("Invalid Age..Enter Valid One!!");
		    	 e.age = in.nextInt();
		     }
		    
		     
	        System.out.println("Age::\n"+e.age);
	       
	       String sql = "insert into employeeData "
	   			+ " (name, salary, dept, age)" + " values (?, ?, ?, ?)";
    
       pstmt = conn.prepareStatement(sql);
	   	
			
	pstmt.setString(1, e.name);
	pstmt.setInt(2, e.salary);
	pstmt.setString(3, e.dept);
    pstmt.setInt(4, e.age);
	int insertCount = pstmt.executeUpdate();
	System.out.println(insertCount + " Employee(s) inserted");
	
  }
	public void viewAllRecord() throws Exception {
		String sql = "SELECT * FROM employeeData";
	//	System.out.println("before "+EmployeeDao.pstmt);
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
	  
		ArrayList list = new ArrayList();

		System.out.format("\t%s \t%s \t%s \t%s \t%s\n", "Id", "Name", "Salary", "Department","Age");
		while (rs.next()) {
			// Retrieve by column name
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int salary = rs.getInt("salary");
			String department = rs.getString("dept");
			int age = rs.getInt("age");
				Employee emp = new Employee();
				emp.setId(id);
				emp.setName(name);
				emp.setSalary(salary);
				emp.setDept(department);
				emp.setAge(age);
				list.add(emp);
			// Display values
			System.out.format("\t%d \t%s \t%d \t%s \t\t%d \n", id, name, salary, department, age);
	       }
		
	}
	public void deleteRecord(int iddel) throws SQLException {
		// Deletion with Prepared Statement
					String deleteQuery = "DELETE FROM employeeData WHERE id = ?";
					pstmt = conn.prepareStatement(deleteQuery);
					pstmt.setInt(1, iddel);			
					int deleteCount = pstmt.executeUpdate();
					System.out.println(deleteCount + " Employee(s) updated");			

					String selectQuery = "SELECT * FROM employeeData";
				    rs = pstmt.executeQuery(selectQuery);
	}
	public void updateRecord(int mid,int sal) throws SQLException {
		String updateQuery = "UPDATE employeeData SET Salary = ? WHERE id = ?";
		
		pstmt=conn.prepareStatement(updateQuery);
//		EmployeeDao.stmt= EmployeeDao.conn.createStatement();
//	ResultSet rs = EmployeeDao.stmt.executeQuery(updateQuery);
//		if(rs.next()) {
//			System.out.println("Employee With"+mid+"found");
//		}else
//		{
//			System.out.println("Employee doesnt Exists!!");
//		}
		//EmployeeDao.pstmt.setString(1, "Software Engineer");
		pstmt.setInt(2, mid);		
		pstmt.setInt(1,sal);		

		int updateCount = pstmt.executeUpdate();
		System.out.println(updateCount + " Employee(s) updated");
	}
	public void searchById(int sid) throws SQLException {
		String sql = "SELECT * FROM employeeData WHERE id='\"+sid+\"'";
		//EmployeeDao.pstmt.setInt(1,sid);		
		//System.out.println("before "+EmployeeDao.pstmt);
		pstmt = conn.prepareStatement(sql);
	    rs = pstmt.executeQuery();
		if(EmployeeDao.rs.next())
		{
			System.out.println(EmployeeDao.rs.getString(1)+","+EmployeeDao.rs.getString(2)+","+EmployeeDao.rs.getString(3)+","+
		EmployeeDao.rs.getString(4)+","+EmployeeDao.rs.getString(5));
		}
		else
		{
			System.out.println("Record Not Found...");
		}
	}
	@SuppressWarnings("resource")
	public void importData() {
	try {
		File file = new File("EmpData.txt");
		Scanner scanner = new Scanner(file);
		while(scanner.hasNextLine()) {
			String s= scanner.nextLine();
		String[] arr = s.split("");
		System.out.println("Id= " +arr[0]+" Name= " +arr[1]+"Salary= " +arr[2]+"Department=" +arr[3]+"Age="+arr[4]);
	}
	}
	catch(FileNotFoundException e) {
	e.printStackTrace();
	}
	}
	
	@SuppressWarnings("unused")
	public void exportData() throws SQLException, ClassNotFoundException, IOException {
   	 System.out.println("in");
   	 
		String all = "SELECT * FROM EmployeeData";
	     Connection conn = null;

         List<String> list = new ArrayList<>();

			Employee emp = new Employee();
         try {
        	 Class.forName("com.mysql.jdbc.Driver");
        	
        	  pstmt=conn.prepareStatement(all);
              ResultSet rs =pstmt.executeQuery();
					while(rs.next()) {
						 int id = rs.getInt("id");
						String name = rs.getString("name");
						int salary = rs.getInt("salary");
						String department = rs.getString("dept");
						int age = rs.getInt("age");
						list.add(id +" "+name+" "+salary+" "+department +" "+age);
				
					}
           BufferedWriter out=null;
        	 File file =new File("EmpData.txt");
			 out = new BufferedWriter(new FileWriter (file,true));
     	 for(Object o:list) {
			 out.write((String)o);
			 out.newLine();
			  }
     	 System.out.println("Database Connection Success");
     	 out.close();
     	
	}catch(IOException e) {
		
	} 
}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void statistics() throws SQLException {
		String sql = "SELECT * FROM employeeData";
		//	System.out.println("before "+EmployeeDao.pstmt);
		 pstmt=conn.prepareStatement(sql);
			EmployeeDao.rs =pstmt.executeQuery(sql);
		  
			List<Employee> list = new ArrayList<>();

			System.out.format("\t%s \t%s \t%s \t%s \t%s\n", "Id", "Name", "Salary", "Department","Age");
			while (EmployeeDao.rs.next()) {
				// Retrieve by column name
				int id = EmployeeDao.rs.getInt("id");
				String name = EmployeeDao.rs.getString("name");
				int salary = EmployeeDao.rs.getInt("salary");
				String department = EmployeeDao.rs.getString("dept");
				int age = EmployeeDao.rs.getInt("age");
					Employee emp = new Employee();
					emp.setId(id);
					emp.setName(name);
					emp.setSalary(salary);
					emp.setDept(department);
					emp.setAge(age);
					list.add(emp);
				// Display values
				System.out.format("\t%d \t%s \t%d \t%s \t\t%d \n", id, name, salary, department, age);
			}
        long count ;
		count = list.stream().filter(emp->((Employee) emp).getAge()>30).count();
         System.out.println("1]Count of Employees whose age is greater than 30: " + count);
         
         
               List l = (List) list.stream()
         		.filter(emp->((Employee) emp).getAge()>30)
         		.map(emp->emp.id)//map--transforming/extracting data from one to another
 				.collect(Collectors.toList());
               System.out.println("2]List of id's whose age is greater than 30: " + l);
         
         
               Map map = new TreeMap();
                  map =  (Map) list
         		.stream()
         		//.sorted((p1, p2) -> p1.getDept().compareTo(p2.getDept()))

         		.sorted(Comparator.comparing(Employee::getDept))
         		.collect(Collectors.groupingBy(Employee::getDept,TreeMap::new, Collectors.counting()));
                System.out.println("3]Count according to Dept ::"+map);
                
                  double totalSal = list.stream()
                			.map(Employee::getSalary)
                			.reduce((int) 0,(a,b)->a.intValue()+b.intValue()).intValue();      
                  System.out.println("4]Sum of Salaries Of Employeees::"+totalSal);

                  
//                  double avgSal = (double) list.stream()
//                 			              .collect(Collectors.averagingDouble(Employee::getSalary));
//                   System.out.println("Avg Salary::"+avgSal);
//                   
//                    List dept = ((Map) list.parallelStream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting())))
//                 		          .entrySet().stream()
//                 		          .filter(emp-> ((Entry) emp).getValue() > 1)
//                 		          .map(Map.Entry::getKey)
//                 		          .collect(Collectors.toList());
//                    System.out.println("5]Dept having count 3 or more than 3"+dept);
                   
                   List listl = (List) list.stream().filter(name->((Employee) name).getName().startsWith("s")).collect(Collectors.toList());
                   System.out.println("5]Employee name starting with letter 's' "+listl);

	}
}
