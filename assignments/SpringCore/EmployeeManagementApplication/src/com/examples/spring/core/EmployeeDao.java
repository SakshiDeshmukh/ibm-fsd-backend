package com.examples.spring.core;

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
import java.util.stream.Collectors;

public class EmployeeDao {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/jdbctraining";
	static final String USER = "root";
	static final String PASS = "";

	static Connection conn = null;
	static Statement stmt = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;

	Scanner in = new Scanner(System.in);
	Employee e;

	public EmployeeDao() {
		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);/// create connection

			System.out.println("Connection Estalished:" + conn);
			// STEP 4: Execute a query
			System.out.println("Creating statement...");
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		}

	}

	public void addRecord(Employee e) throws Exception {

		String sql = "insert into employeeData " + " (name, salary, dept, age)" + " values (?, ?, ?, ?)";

		pstmt = conn.prepareStatement(sql);

		pstmt.setString(1, e.getName());
		pstmt.setInt(2, e.salary);
		pstmt.setString(3, e.dept);
		pstmt.setInt(4, e.age);
		int insertCount = pstmt.executeUpdate();
		System.out.println(insertCount + " Employee(s) inserted");

	}

	public List viewAllRecord() throws Exception {
		String sql = "SELECT * FROM employeeData";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();

		ArrayList list = new ArrayList();

		while (rs.next()) {
			// Retrieve by column name
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int salary = rs.getInt("salary");
			String dept = rs.getString("dept");
			int age = rs.getInt("age");
			Employee emp = new Employee();
			emp.setId(id);
			emp.setName(name);
			emp.setSalary(salary);
			emp.setDept(dept);
			emp.setAge(age);
			list.add(emp);

		}
		return list;

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

	public void searchById(int iddsr) throws SQLException {
		String sql = "SELECT * FROM employeeData WHERE id= '" + iddsr + "'";

		pstmt = conn.prepareStatement(sql);
		 rs = pstmt.executeQuery(sql);

		if (rs.next()) {
			System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t\t" + rs.getString(3) + "\t\t"
					+ rs.getString(4) + "\t\t\t" + rs.getString(5));
		} else {
			System.out.println("Record Not Found...");
		}
	}

	public void updateRecord(int mid, int sal) throws SQLException {
		String updateQuery = "UPDATE employeeData SET Salary = ? WHERE id = ?";

		pstmt = conn.prepareStatement(updateQuery);
		pstmt.setInt(2, mid);
		pstmt.setInt(1, sal);

		int updateCount = pstmt.executeUpdate();
		System.out.println(updateCount + " Employee(s) updated");
	}

	

	@SuppressWarnings("resource")
	public void importData() {
		try {
			File file = new File("EmpData.txt");
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String s = scanner.nextLine();
				String[] arr = s.split("");
				System.out.println("Id= " + arr[0] + " Name= " + arr[1] + "Salary= " + arr[2] + "Department=" + arr[3]
						+ "Age=" + arr[4]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unused")
	public void exportData() throws SQLException, ClassNotFoundException, IOException {
		System.out.println("in");

		String all = "SELECT * FROM employeeData";

		List<String> list = new ArrayList<>();

		Employee emp = new Employee();
		try {
			Class.forName("com.mysql.jdbc.Driver");

			pstmt = conn.prepareStatement(all);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int salary = rs.getInt("salary");
				String department = rs.getString("dept");
				int age = rs.getInt("age");
				list.add(id + " " + name + " " + salary + " " + department + " " + age);

			}
			BufferedWriter out = null;
			File file = new File("EmpData.txt");
			out = new BufferedWriter(new FileWriter(file, true));
			for (Object o : list) {
				out.write((String) o);
				out.newLine();
			}
			System.out.println("Database Connection Success");
			out.close();

		} catch (IOException e) {

		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void statistics() throws SQLException {
		String sql = "SELECT * FROM employeeData";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery(sql);

		List<Employee> list = new ArrayList<>();

		//System.out.format("\t%s \t%s \t%s \t%s \t%s\n", "Id", "Name", "Salary", "Department", "Age");
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
			//System.out.format("\t%d \t%s \t%d \t%s \t\t%d \n", id, name, salary, department, age);
		}
		long count;
		count = list.stream().filter(emp -> ((Employee) emp).getAge() > 30).count();
		System.out.println("1]Count of Employees whose age is greater than 30:: " + count);

		List l = (List) list.stream().filter(emp -> ((Employee) emp).getAge() > 30).map(emp -> emp.id)
				.collect(Collectors.toList());
		System.out.println("2]List of id's whose age is greater than 30:: " + l);

		Map map = new TreeMap();
		map = (Map) list.stream().sorted(Comparator.comparing(Employee::getDept))
				.collect(Collectors.groupingBy(Employee::getDept, TreeMap::new, Collectors.counting()));
		System.out.println("3]Count according to Dept ::" + map);

		double totalSal = list.stream().map(Employee::getSalary).reduce((int) 0, (a, b) -> a.intValue() + b.intValue())
				.intValue();
		System.out.println("4]Sum of Salaries Of Employeees::" + totalSal);

		List listl = (List) list.stream().filter(name -> ((Employee) name).getName().startsWith("s"))
				.map(e->e.getName())
				.collect(Collectors.toList());
		System.out.println("5]Employee name starting with letter 's'::" + listl);
		
		List count1 = list.stream()
				.collect(Collectors.groupingBy(e->e.getDept(),Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e->e.getValue()>2)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
		System.out.println("6]Dept Wise Count greater than 2::"+count1);
		
		
		Map map1 = list.stream()
				  .collect(Collectors.groupingBy(e->e.getDept(),Collectors.averagingInt(e->e.getSalary())));
		System.out.println("7]Dept wise Average Salary::"+map1 );
		
		int avgsal = list.stream()
						 .collect(Collectors.averagingInt(Employee::getSalary)).intValue();
		System.out.println("8]Average Salary of all employees::"+avgsal);
		

	}
}
