<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administrar Alumnos</title>
</head>
<body>
	<h1>Lista  Alumnos</h1>
	<table>
		<tr>
			<td><a href="adminAlumno?action=index" >Ir al menú</a> </td>
		</tr>
	</table>
	
	<table border="1" width="100%">
		<tr>
		 <td> CUI</td>
		 <td> NOMBRE</td>
		 <td> APELLIDO</td>
		 <td> EDAD</td>
		 <td> SEXO</td>
		</tr>
		<c:forEach var="alumno" items="${lista}">
			<tr>
				<td><c:out value="${alumno.cui}"/></td>
				<td><c:out value="${alumno.nombre}"/></td>
				<td><c:out value="${alumno.apellido}"/></td>
				<td><c:out value="${alumno.edad}"/></td>
				<td><c:out value="${alumno.sexo}"/></td>			
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>