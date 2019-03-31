<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
	<html><body>
<p>Registered Successfully!! </p>
	<p>First Name is: 
	<% 
	String uname=(String) session.getAttribute("name");

	out.println(uname); %></p>
	
	<span style="margin-right:100px">
<a href='home.jsp'>HOME</a></span><br>
<span><a href='login.jsp'>LOGIN</a></span>
</body>
</body>
</html>