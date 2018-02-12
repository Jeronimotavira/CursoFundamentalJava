package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Libro;
import beans.Tema;
import model.GestionLibros;

/**
 * Servlet implementation class BuscarLibrosAction
 */
@WebServlet("/BuscarTemaAction")
public class BuscarTemaAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		GestionLibros glibros=new GestionLibros();
		List<Tema> temas = glibros.buscarTemas();
		request.setAttribute("listaLibros", temas);
		request.getRequestDispatcher("inicio.jsp").forward(request, response);
	}

}
