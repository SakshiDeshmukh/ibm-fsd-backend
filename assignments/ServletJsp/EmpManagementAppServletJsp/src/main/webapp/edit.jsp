<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Edit Employee</h1>
	
               
		<form action="Edit" method="POST">
		<table>
		<tr>
		<td>	Name ::</td>
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
			Contractor ::</td>
			<td><input type="checkbox" name="contractor" /><br> <br>
			</td>
			</tr>
			<tr>
			<td>
			Skills ::</td>
			<td><input type="checkbox" name="skills">Technical 
			<input type="checkbox" name="skills">Functional<br> <br>
			</td>
			</tr>
			<tr>
			<td>
			Designation ::</td>
			<td><input type="text" name="designation" /><br> <br>
			</td>
			</tr>
			<tr>
			<td>
			Department ::</td>
			<td><input type="text" name="department" /><br> <br>
			</td>
			</tr>
			<tr>
			<td>
			Address ::</td>
			<td><input type="text" name="address" /><br> <br>
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