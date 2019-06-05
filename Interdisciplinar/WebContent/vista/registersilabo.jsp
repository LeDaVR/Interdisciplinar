<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Alumno</title>
</head>
<body>
	<h1 align="center">Registrar Alumno</h1>
	<form action="adminAlumno?action=index" method="post">
		<table border="1" align="center">
		<tr>
			<td>CURSO:</td>		
			<td><input type="text" name="curso"/></td>	
		</tr>
		<tr>
			<td>CUD:</td>		
			<td><input type="text" name="cud"/></td>	
		</tr>
		<tr>
			<td>CONTENIDO:</td>		
			<td><textarea name="contenido"></textarea></td>	
		</tr>
		<tr>
			<td>FECHA:</td>		
			<td><input type="text" name="fecha"/></td>	
		</tr>
		<tr>
			<td>Sexo:</td>		
			<td><input type="text" name="sexo"/></td>	
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