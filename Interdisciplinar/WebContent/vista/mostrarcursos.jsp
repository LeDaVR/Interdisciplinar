<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CURSOS</title>
</head>
<body>
	<h1 align="center">Lista Cursos</h1>
	<table>
		<tr>
			<td><a href="adminCursos?action=index" >Ir al menú</a> </td>
		</tr>
	</table>
	
	<table border="1" width="100%">
		<tr>
		 <td> CASI</td>
		 <td> NOMBRE</td>
		 <td> CREDITOS</td>
		 <td> CATEGORIA</td>
		 <td> HORAS TEORICAS</td>
		 <td> HORAS PRACTICAS</td>
		 <td> DESCRIPCION</td>
		</tr>
		<c:forEach var="curso" items="${listacursos}">
			<tr>
				<td><c:out value="${curso.casi}"/></td>
				<td><c:out value="${curso.nombre}"/></td>
				<td><c:out value="${curso.creditos}"/></td>
				<td><c:out value="${curso.categoria}"/></td>	
				<td><c:out value="${curso.h_teoricas}"/></td>		
				<td><c:out value="${curso.h_practicas}"/></td>		
				<td><c:out value="${curso.descripcion}"/></td>				
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>