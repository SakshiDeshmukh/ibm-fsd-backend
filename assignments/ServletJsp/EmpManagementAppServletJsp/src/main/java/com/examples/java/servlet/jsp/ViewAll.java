package com.examples.java.servlet.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ViewAll")
public class ViewAll  extends HttpServlet {
	EmployeeService Service =new EmployeeService();



    public void init() {
		System.out.println("ViewAll Servlet Initialized");
		
		
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	
		response.setContentType("text/html");
		HttpSession session = request.getSession();

      PrintWriter out = response.getWriter();

      List<Employee> empList = null;
      try {
		empList = ((EmployeeService) Service).viewAll();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
      
        out.print("<table border='1' width='100%'");
        out.print("<tr><th>Id</th><th>Name</th><th>Password</th><th>Age</th><th>Gender</th><th>Contractor</th><th>Skills</th><th>Designation</th><th>Department</th><th>Address</th><th>Edit</th><th>Delete</th></tr>");
        for(Employee e:empList){
            out.print("<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td><td>"+e.getPassword()+"</td><td>"+e.getAge()+"</td><td>"+e.getGender()+"</td><td>"+e.getContractor()+"</td><td>"+e.getSkills()+"</td><td>"+e.getDesignation()+"</td><td>"+e.getDepartment()+"</td><td>"+e.getAddress()+"</td>"+"<td><a href='Edit?id="+e.getId()+"'>edit</a></td><td><a href='Delete?id="+e.getId()+"'>delete</a></td></tr>");
        }
        out.print("</table>");
        
        
        out.close();
	}
}


