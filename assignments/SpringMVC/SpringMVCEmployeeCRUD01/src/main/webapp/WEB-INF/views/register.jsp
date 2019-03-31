<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false" %>
<html>
<head>
	<title>Registration</title>
</head>
<body>
<!-- <form action="/SpringMVCRegistrationEx/register/" method="POST">
	<p>Enter Username: <input name="username" type="text" /> </p>
	<p>Enter Password: <input name="password" type="password" /> </p>
	<p><button type="submit" value="Submit">Submit</button> <button type="reset" value="Reset">Reset</button> </p>
</form> -->

<form:form target="register" method="POST">
	<p>Enter Username: <form:input path="username" /> </p>
	<p>Enter password: <form:password path="password" /> </p>
	<p><button type="submit" value="Submit">Submit</button> <button type="reset" value="Reset">Reset</button> </p>
</form:form>
</body>
</html>
