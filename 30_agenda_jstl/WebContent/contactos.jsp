<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List,beans.Contacto, modelo.GestionContactos"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var = contactos value = "${requestScope.contactos}"></c:set>
<c:choose>
<c:when test="${empty contactos}">
<jsp:forward page="sincontactos.jsp"/>
</c:when>
<c:otherwise>
<table>

<c:forEach var = "con" items="${contactos}">

<tr>
${con.nombre}


</tr>

</c:forEach>





</table>



</c:otherwise>
</c:choose>
	
	<a href="Controller?op=toInicio">Volver</a>
</body>
</html>