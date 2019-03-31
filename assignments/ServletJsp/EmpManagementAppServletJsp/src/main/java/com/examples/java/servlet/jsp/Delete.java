package com.examples.java.servlet.jsp;


import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
       int empid = Integer.parseInt(request.getParameter("id"));
		
		EmployeeService service = new EmployeeService();
		int status = 0;
		try {
			status = service.delete(empid);
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		if(status>=1)
		{
			response.sendRedirect("ViewAll");
		}

	}
}