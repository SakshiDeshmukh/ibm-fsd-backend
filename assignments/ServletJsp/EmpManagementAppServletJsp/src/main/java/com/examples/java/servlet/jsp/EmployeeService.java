package com.examples.java.servlet.jsp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
	EmployeeDao dao = new EmployeeDao();
		
	
	public void add(Employee emp) throws Exception {
		dao.addRecord(emp);
     }
	public void addEmp(Employee emp) throws Exception {
		dao.addEmpRecord(emp);
     }
	public List<Employee> viewAll() throws SQLException {
		List<Employee> list1=new ArrayList();
		list1=dao.viewEmployee();
		return list1;
	}
	public int delete( int empid) throws SQLException {
		return dao.deleteEmpByID(empid);
		
	}
	
	public int update(Employee emp) {
		return dao.UpdateByID(emp);

	}
}
