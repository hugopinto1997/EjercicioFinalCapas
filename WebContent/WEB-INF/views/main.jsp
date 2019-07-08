<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Ingrese un contribuyente</h1>
<form:form action="${pageContext.request.contextPath}/ver" method="POST" modelAttribute="contribuyente">
	 <form:select name="cosa" path="importancia" id="tipo">
 	   	   <c:forEach items="${listaimportancia}" var="ls">
 	   	   		<form:option value="${ls.cImportancia }" >${ls.sImportancia }</form:option> 
 	   	   </c:forEach>                
               
</form:select><BR><br><br>
	<form:input type="text" name="sNombre"  path="sNombre" placeholder="Nombre" /><br>
	<form:input type="text" name="sApellido"  path="sApellido" placeholder="Apellido"/><br>
	<form:input type="text" name="sNit"  path="sNit" placeholder="NIT" /><br><br>
	<input type="submit" value="Guardar" />
	
	</form:form>
	<br>
	
	<form action="${pageContext.request.contextPath}/verTodos" method="POST">
		<input type="submit" value="Ver contribuyentes" />
	
	</form>
</body>
</html>