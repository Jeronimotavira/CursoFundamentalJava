<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 


int valor=0;
int cglobal = 0;
int activas = 0;
String fecha="";

Cookie[] todas = request.getCookies();
if(todas!=null){
for(Cookie ck:todas){
	if(ck.getName().equals("visita")){
		fecha = ck.getValue();
	}}}
	
		//obtenemos el valor del contador		
		
			valor=(Integer)session.getAttribute("contador");		
			cglobal=(Integer)application.getAttribute("cglobal");
			activas=(Integer)application.getAttribute("activas");
			
		
		%>
		
	<h1> Has entrado <%=valor %> veces</h1>
	<h1> total entradas <%=cglobal %> </h1>
	<br/>
	<h1> visitas activas <%=activas %> </h1>
	<br/>
	<h1>Fecha ultima visita <%=fecha %> </h1>
	<br/><a href='index.html'>Volver</a>
	
</body>
</html>