package com.examples.spring.core;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


public class EmployeeService {
  	
    EmployeeDao dao ;
    
   public EmployeeDao getDao() {
		return dao;
	}
   public void setDao(EmployeeDao dao) {
		this.dao = dao;
	}
   public void add(Employee e) throws Exception {
	   dao.addRecord(e);
   }
   @SuppressWarnings("rawtypes")
   public List view() throws Exception {
	   return dao.viewAllRecord();
   }
   public void update(int mid,int sal) throws SQLException {
	   int id = mid;
	   int salary=sal;
	   dao.updateRecord(id , salary);
   }
   public void delete(int iddel) throws SQLException {
	   int del= iddel;
	   dao.deleteRecord(del);
   }
   public void search(int idsr) throws SQLException {
	   int iddsr= idsr;
	   dao.searchById(iddsr);
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
