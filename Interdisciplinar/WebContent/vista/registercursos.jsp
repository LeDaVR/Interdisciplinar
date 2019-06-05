<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REGISTRAR CURSOS</title>
</head>
<body>
	<h1 align="center">Registrar Curso</h1>
	<form action="adminCursos?action=register" method="post">
			<table border="1" align="center">
			<tr>
				<td>CUD:</td>		
				<td><input type="text" name="casi"/></td>	
			</tr>
			<tr>
				<td>Nombre:</td>
				<td><input type="text" name="nombre"/></td>	
			</tr>
			<tr>
				<td>CREDITOS:</td>		
				<td><input type="text" name="creditos"/></td>	
			</tr>
			<tr>
				<td>CATEGORIA:</td>		
				<td><input type="text" name="categoria"/></td>	
			</tr>
			<tr>
				<td>HORAS TEORICAS:</td>		
				<td><input type="text" name="hteoricas"/></td>	
			</tr>
			<tr>
				<td>HORAS PRACTICAS:</td>		
				<td><input type="text" name="hpracticas"/></td>	
			</tr>
			<tr>
				<td>DESCRIPCION:</td>		
				<td><input type="text" name="descripcion"/></td>	
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