package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Libro;
import model.GestionLibros;

/**
 * Servlet implementation class BuscarLibrosAction
 */
@WebServlet("/BuscarLibrosAction")
public class BuscarLibrosAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String tema=request.getParameter("tema");
		GestionLibros glibros=new GestionLibros();
		List<Libro> libros = glibros.buscarlibrosTemas(tema);
		request.setAttribute("listaLibros", libros);
		request.getRequestDispatcher("listaLibros.jsp").forward(request, response);
	}

}
