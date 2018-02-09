<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "beans.Contacto, java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<% ArrayList<Contacto> contac;
contac = (ArrayList<Contacto>) request.getAttribute("contactos");

%>

<body>

<table border = "1">
<%

for(Contacto c:contac){
	%>	

<tr>
<td><%=c.getNombre() %>  </td> <td> <%=c.getEmail() %> </td> <td> <%=c.getTelefono() %> </td>
</tr>

<%	
}
%>
</table>
JSP RESPUESTA
</body>
</html>