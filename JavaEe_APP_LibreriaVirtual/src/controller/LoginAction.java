package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GestionUsuarios;

/**
 * Servlet implementation class LoginAction
 */
@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pwd=request.getParameter("password");
		RequestDispatcher rd;
		GestionUsuarios gusuarios=new GestionUsuarios();
		
		if(gusuarios.comprobaruser(request.getParameter("usuario"), pwd)){
		
			rd=request.getRequestDispatcher("BuscarTemaAction");		
			
		}else{
			request.setAttribute("mensaje", "Usuario y contraseña no válidos");
			//obtener requestdispatcher
			 rd=request.getRequestDispatcher("index.html");			
		}
		//trasnferir petición
		rd.forward(request, response);
		
	}
	

}
