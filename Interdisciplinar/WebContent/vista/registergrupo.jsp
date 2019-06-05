<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar GRUPO</title>
</head>
<body>
	<h1 align="center">Registrar GRUPO</h1>
	<form action="adminAlumno?action=index" method="post">
		<table border="1" align="center">
		<tr>
			<td>CURSO:</td>		
			<td><input type="text" name="curso"/></td>	
		</tr>
		<tr>
			<td>ESCUELA:</td>		
			<td><input type="text" name="escuela"/></td>	
		</tr>
		<tr>
			<td>CUD PROFESOR:</td>		
			<td><input type="text" name="cud"/></td>	
		</tr>
		<tr>
			<td>SALON:</td>		
			<td><input type="text" name="salon"/></td>	
		</tr>
	</table>
	<br>
	<table border="0" align="center">
		<tr>
		<td><input type="submit" value="Agregar" name="agregar"></td>	
		</tr>
	</table>
	</form>
</body>
</html>