package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GestionUsuarios;


@WebServlet("/AltaUsuario")
public class AltaUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GestionUsuarios gcontactos=new GestionUsuarios();
		gcontactos.alta(request.getParameter("usuario"), request.getParameter("password"), request.getParameter("email"), Integer.parseInt(request.getParameter("telefono")));
		request.getRequestDispatcher("index.html").forward(request, response);
	}

}
