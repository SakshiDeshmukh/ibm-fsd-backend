package com.ex.jdbc;
import java.sql.SQLException;


public class EmployeeService {
  	
    EmployeeDao dao = new EmployeeDao();
    
   public void add() throws Exception {
	   Employee emp = new Employee();
	   dao.addRecord(emp);
   }
   public void view() throws Exception {
	   dao.viewAllRecord();
   }
   public void update(int mid,int sal) throws SQLException {
//	   int id = mid;
//	   int salary=sal;
	   Employee emp = new Employee();
	   dao.updateRecord(emp);
   }
   public void delete(int iddel) throws SQLException {
	   int del= iddel;
	   dao.deleteRecord(del);
   }
   public void stat() throws SQLException {
	   dao.statistics();
   }
   
}
