<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<%
		String uname = (String) session.getAttribute("name");
		
	%>
	<p>
		You Have Successfully logged in
		<%
		out.println(uname);
	%>!!
	</p>
</body>



<h2>
	Welcome!!
	
</h2>
</p>

<span style="margin-right:100px">
<a href="add.jsp">Add Employee</a></span>
<br>
<span><a href='ViewAll'>View All Employee Data</a></span>
<br>
<span><a href='home.jsp'>HOME</a></span>
</body>
</html>
<span><a href='logout.jsp'>LOGOUT</a></span>
</body>
</html>

