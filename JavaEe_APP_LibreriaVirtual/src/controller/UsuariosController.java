package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UsuariosController
 */
@WebServlet("/UsuariosController")
public class UsuariosController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String op=request.getParameter("op");
		String url="";
		switch(op) {
			case "toDatos":
				url="datos.html";
				break;
			case "toInicio":
				url="inicio.html";
				break;
			case "Registrar":
				url="AltaUsuario";
				break;
			case "doRecuperar":
				url="RecuperarAction";
				break;
			case "doEliminar":
				url="EliminarAction";
				break;
			case "Logear":
				url="LoginAction";
				break;
		}
		request.getRequestDispatcher(url).forward(request, response);
		
		
		
		
		
	}
	
	
	

}
