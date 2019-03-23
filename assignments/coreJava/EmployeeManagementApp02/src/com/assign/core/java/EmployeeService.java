package com.assign.core.java;


import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class EmployeeService {
  	
	
	EmployeeDao dao = new EmployeeDao();
  
   public void add(Employee e) throws Exception {
	  
	    dao.addRecord(e);
   }
   public List view() throws Exception {
	   return dao.viewAllRecord();
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
   public void importD() throws SQLException {
	   dao.importData();
   }
   public void export() throws SQLException, ClassNotFoundException, IOException {
	   dao.exportData();
   }
	
	
}
