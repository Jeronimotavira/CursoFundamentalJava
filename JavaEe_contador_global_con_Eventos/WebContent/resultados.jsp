<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%int no= (Integer)application.getAttribute("globalno");
	int si=(Integer)application.getAttribute("globalsi");
	
	
	double porcentajeno = (100/(no+si))*no;
	double porcentajesi = (100/(no+si))*si;
	
	%>
	
	<h1>Total de no <%=no %> veces cuyo porcentaje es :  <%=porcentajeno%>%</h1>
	<h1>Total de si <%=si %> veces cuyo porcentaje es : <%=porcentajesi%>%</h1>
	<h1>Total de votos es <%=no+si %> veces</h1>
	<br/>
	<a href="inicio.html">Inicio</a>
</body>
</html>