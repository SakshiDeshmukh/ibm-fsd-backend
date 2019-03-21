package com.assign.core.java;


import java.sql.SQLException;

public class EmployeeService {
  	
	
	EmployeeDao dao = new EmployeeDao();
  
   public void add(Employee emp) throws Exception {
	  
	    dao.addRecord(emp);
   }
   public void view(Employee emp) throws Exception {
	   dao.viewAllRecord(emp);
   }
   public void searchId(int sid) throws SQLException {
	   dao.searchById(sid);
   }
   public void update(int mid,int sal) throws SQLException {
	   int id = mid;
	   int salary=sal;
	   dao.updateRecord(id, salary);
   }
   public void delete(int iddel) throws SQLException {
	   int del= iddel;
	   dao.deleteRecord(del);
   }
   public void stat() throws SQLException {
	   dao.statistics();
   }
	
	
	
	
}
