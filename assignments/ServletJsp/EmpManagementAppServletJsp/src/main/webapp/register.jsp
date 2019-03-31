<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Registration form</h1>
	
               
		<form action="register.do" method="POST"">
		<table>
		<tr>
		<td>	UserName ::</td>
		<td><input type="text" name="name" /><br> <br>
		</td>
		</tr>
		<tr>
		<td>
			Age ::</td>
			<td><input type="text" name="age" /><br> <br/> 
			</td>
			</tr>
			<tr>
			<td>
			Gender ::</td>
			<td><input type="radio" name="gender" value="male" checked> Male 
				<input type="radio" name="gender" value="female"> Female<br> <br>
				</td>
				</tr>
				<tr>
				<td>
			Password ::</td>
			<td><input type="password" name="password"/><br><br>
			</td>
			</tr>
			<tr>
			<td>
			
			Address ::</td>
			<td><input type="text" name="address" /><br> <br>
			</td>
			</tr>
			<tr>
			<td>
			Country ::</td>
			<td> <select name="userCountry">
				<option>India</option>
				<option>China</option>
				<option>US</option>
			</select> <br> <br>
			</td>
			</tr>
			<hr><tr>
			<td>
			<button type="Submit" value="Submit">Submit</button>
			<button type="Reset" value="Reset">Reset</button>
</td>
</tr>
			</table>
		</form>
	
</body>
</html>