package servelt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Producto;

/**
 * Servlet implementation class Agregar
 */
@WebServlet("/Agregar")
public class Agregar extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Producto po;
		ArrayList<Producto> listP = null;
		HttpSession s=request.getSession();
		double precio = Integer.parseInt(request.getParameter("precio"));
		String nombre = request.getParameter("nombre");
		String categoria = request.getParameter("categoria");
		
		
		
		if(s.getAttribute("listP")==null) {
			listP = new ArrayList<>();
			s.setAttribute("listP", listP);			
			
		}
		
		po = new Producto( nombre, categoria, precio );
		listP = (ArrayList<Producto>)s.getAttribute("listP");
		listP.add(po);
		
		
		
		RequestDispatcher rd=request.getRequestDispatcher("index.html");
		rd.forward(request, response);
		
	}
}
