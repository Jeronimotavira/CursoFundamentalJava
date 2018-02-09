package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Usuario;

/**
 * Servlet implementation class Ficha
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	String user, password;
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//PrintWriter out = response.getWriter();
		//response.setContentType("text/html");
		// validar usuario
		user=request.getParameter("user");
		password=request.getParameter("password");
		RequestDispatcher rd;
		if(password.equals("java")) {
			
			//atributos de peticion
			/*
			JabaBeansUsuario us=new JabaBeansUsuario(request.getParameter("user"),"22");
			
			request.setAttribute("usuario", us);*/
			
			//ATRIBUTOS DE SESSION
			
			Usuario us=new Usuario(request.getParameter("user"),"22");
			
			
			
			
			rd=request.getRequestDispatcher("Bienvenida.jsp");
			//1.- Realizar transferencia
			rd.forward(request, response);
			
		}else{
			rd=request.getRequestDispatcher("NoAcceso.jsp");
			//2.- Realizar transferencia
			rd.forward(request, response);
			
		};
	}

}
