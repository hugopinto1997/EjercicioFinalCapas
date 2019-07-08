<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contribuyentes</title>
</head>
<body>
<h1>Lista de Contribuyentes</h1>
	<table>
       <tr>
           <th>Nombre</th>
           <th>Apellido</th>
           <th>Numero de Identificacion Tributaria</th>
           <th>Fecha de Nacimiento</th>
            <th>Importancia</th>
           
          
           
       </tr>
       
    
       <c:forEach items="${s}" var="s">
         <tr>
           <th>${s.sNombre}</th>
           <th>${s.sApellido}</th>
           <th>${s.sNit}</th>
           <th>${s.fecha}</th>
           <th>${s.importancia.sImportancia}</th>
           
       </tr>
       </c:forEach>
       
  </table>

</body>
</html>