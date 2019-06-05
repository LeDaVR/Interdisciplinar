<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>REGISTRAR ASISTENCIA</title>
</head>
<body>
	<h1 align="center">Registrar Asistencia</h1>
	<form action="adminAsistencia?action=index" method="post">
			<table border="1" align="center">
			<tr>
				<td>GRUPO:</td>		
				<td><input type="text" name="fk_grupo"/></td>	
			</tr>
			<tr>
				<td>ASISTENCIA PROFESOR:</td>
				<td><input type="text" name="asi_profesor"/></td>	
			</tr>
			<tr>
				<td>FECHA:</td>		
				<td><input type="text" name="fecha"/></td>	
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