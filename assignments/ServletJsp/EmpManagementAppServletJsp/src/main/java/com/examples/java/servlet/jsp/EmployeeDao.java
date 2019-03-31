package com.examples.java.servlet.jsp;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/jdbctraining";
	static final String USER = "root";
	static final String PASS = "";

	static Connection conn = null;
	static Statement stmt = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;

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

	//Add User
	public void addRecord(Employee emp) throws Exception {

		String sql = "insert into User " + " (name, age,password,gender,address)"
				+ " values (?, ?, ?, ?, ?, ?)";

		pstmt = conn.prepareStatement(sql);

		pstmt.setString(1, emp.getName());
		pstmt.setInt(2, emp.getAge());
		pstmt.setString(3, emp.getPassword());
		pstmt.setString(4, emp.getGender());
		pstmt.setString(5, emp.getAddress());
	

		int insertCount = pstmt.executeUpdate();
		System.out.println(insertCount + " Employee(s) inserted");

	}
	//Add Employee
	public void addEmpRecord(Employee emp) throws Exception {

		String sql = "insert into empDetails "
				+ " (name, age,password,gender,contractor,skills,designation,department,address)"
				+ " values (?, ?, ?, ?, ?, ?, ? , ? , ? , ?)";

		pstmt = conn.prepareStatement(sql);

		pstmt.setString(1, emp.getName());
		pstmt.setInt(2, emp.getAge());
		pstmt.setString(3, emp.getPassword());
		pstmt.setString(4, emp.getGender());
		pstmt.setString(5, emp.getContractor());
		pstmt.setString(6, emp.getSkills());
		pstmt.setString(7, emp.getDesignation());
		pstmt.setString(8, emp.getDepartment());
		pstmt.setString(9, emp.getAddress());
	
		int insertCount = pstmt.executeUpdate();
		System.out.println(insertCount + " Employee(s) inserted");

	}

	public List<Employee> viewEmployee() throws SQLException {
		System.out.println("Dao class called....");

		List<Employee> list = new ArrayList<Employee>();
		String viewQuery = "select * from empDetails";
		pstmt = conn.prepareStatement(viewQuery);
		rs = pstmt.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String password=rs.getString("password");
			int age = rs.getInt("age");
			String gender = rs.getString("gender");
			String contractor = rs.getString("contractor");
			String skills = rs.getString("skills");
			String designation = rs.getString("designation");
			String department = rs.getString("department");
			String address = rs.getString("address");			
			

			System.out.println();
			Employee e = new Employee(id,name,password,age,gender,contractor,skills,designation,department,address);
			list.add(e);
		//	System.out.println("\t"+name+"\t"+age+"\t"+designation+"\t\t"+gender+"\t\t"+contractor+"\t"+skills+"\t\t"+address);

		}

		return list;
	}
	public int deleteEmpByID(int empid) throws SQLException {
		int status=0;
		try {
		String deleteQuery = " delete from empDetails where id= ?";
		pstmt = conn.prepareStatement(deleteQuery);
		pstmt.setInt(1, empid);

		status = pstmt.executeUpdate();
	} catch (Exception e) {
		// TODO: handle exception
	}
	return status;
}

	public int UpdateByID(Employee emp) {
		int status = 0;
		try {
			String updateQuery = "update employee set name=?,passowrd =?,age=?,gender=?,"
					+ "contractor=?,skills=?,designation=?,department=?,address=? where id=?";
			pstmt = conn.prepareStatement(updateQuery);
			pstmt.setString(1, emp.getName());
			pstmt.setString(2, emp.getPassword());
			pstmt.setInt(3, emp.getAge());
			pstmt.setString(4, emp.getGender());
			pstmt.setString(5, emp.getContractor());
			pstmt.setString(6, emp.getSkills());
			pstmt.setString(7, emp.getDesignation());
			pstmt.setString(8, emp.getDepartment());
			pstmt.setString(9, emp.getAddress());
			pstmt.setInt(10, emp.getId());

			status = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return status;
	}
}

	
		
		
	
