<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "java.util.ArrayList, beans.Producto"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border = "1">
<tr> 
<td> 
Accion
</td>         
<td> 
Nombre
</td>
<td> 
Precio
</td>
<td> 
Categoria
</td>
</tr>
<% 
ArrayList <Producto> lista;
lista =(ArrayList<Producto>)session.getAttribute("listP");
for(int i = 0 ; i < lista.size();i++){
	%><tr><td> 
	<%=i%>
	<td> 
<%=lista.get(i).getNombre()%>
</td>
<td>
<%=lista.get(i).getCategoria()%>
</td>
<td><%=lista.get(i).getPrecio()%>	
</td></tr>
<%	
}	%>




</table>
</body>
</html>