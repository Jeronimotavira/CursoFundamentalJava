<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% int valor=0;
		//obtenemos el valor del contador		
		if(session.getAttribute("contador")!=null) {
			valor=(Integer)session.getAttribute("contador");
		}%>
		
	<h1> Has entrado <%=valor %> veces</h1>
	<br/><br/><a href='index.html'>Volver</a>
	
</body>
</html>