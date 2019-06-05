<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alumnos Java Web JSP y Servlet</title>
</head>
<body>
	<h1>Administrar</h1>
	<table border="1" width="50%" align="center">
		<tr>
			<td align="center"><a href="adminAlumno?action=nuevo">Nuevo Alumno</a></td>			
		</tr>
		<tr>
			<td align="center"><a href="adminAlumno?action=mostrar">Mostrar Alumnos</a></td>
		</tr>
		
		<tr>
			<td align="center"><a href="adminDocente?action=nuevo">Nuevo Docente</a></td>			
		</tr>
		<tr>
			<td align="center"><a href="adminDocente?action=mostrar">Mostrar Docentes</a></td>
		</tr>
		<tr>
			<td align="center"><a href="adminCursos?action=nuevo">Nuevo Curso</a></td>			
		</tr>
		<tr>
			<td align="center"><a href="adminCursos?action=mostrar">Mostrar Cursos</a></td>
		</tr>
		<tr>
			<td align="center"><a href="adminAlumno?action=registergrupo">Añadir Grupo</a></td>
		</tr>
		<tr>
			<td align="center"><a href="adminAlumno?action=registersilabo">Añadir Silabo</a></td>
		</tr>
		<tr>
			<td align="center"><a href="adminAlumno?action=registermatricula">Añadir Matricula</a></td>
		</tr>
	</table>
</body>
</html>