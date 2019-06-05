<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Docente</title>
</head>
<body>
	<h1 align="center">Registrar Docente</h1>
	<form action="adminDocente?action=register" method="post">
		<table border="1" align="center">
		<tr>
			<td>CUD:</td>		
			<td><input type="text" name="cud"/></td>	
		</tr>
		<tr>
			<td>Nombre:</td>
			<td><input type="text" name="nombre"/></td>	
		</tr>
		<tr>
			<td>Apellido:</td>		
			<td><input type="text" name="apellido"/></td>	
		</tr>
		<tr>
			<td>Grado academico:</td>		
			<td><input type="text" name="grado_academico"/></td>	
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