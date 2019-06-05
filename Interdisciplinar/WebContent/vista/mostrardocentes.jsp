<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administrar Docentes</title>
</head>
<body>
	<h1 align="center">Lista  Docentes</h1>
	<table>
		<tr>
			<td><a href="adminDocente?action=index" >Ir al menú</a> </td>
		</tr>
	</table>
	
	<table border="1" width="100%">
		<tr>
		 <td> CUD</td>
		 <td> NOMBRE</td>
		 <td> APELLIDO</td>
		 <td> GRADO ACADEMICO</td>
		</tr>
		<c:forEach var="docente" items="${listadocente}">
			<tr>
				<td><c:out value="${docente.cud}"/></td>
				<td><c:out value="${docente.nombre}"/></td>
				<td><c:out value="${docente.apellido}"/></td>
				<td><c:out value="${docente.grado_academico}"/></td>			
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>