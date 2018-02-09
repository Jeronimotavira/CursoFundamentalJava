package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Entrar
 */
@WebServlet("/Entrar")
public class Entrar extends HttpServlet {
	
	protected synchronized void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int votacion = Integer.parseInt(request.getParameter("votacion"));
		ServletContext ctx=request.getServletContext();
		int si=0;
		int no=0;
		
		if(votacion == 1) {
			if(ctx.getAttribute("globalsi")!=null) {
				si=(Integer)ctx.getAttribute("globalsi");
			}
			si++;
			ctx.setAttribute("globalsi", si);
			
		}
		if(votacion == 2) {
			if(ctx.getAttribute("globalno")!=null) {
				si=(Integer)ctx.getAttribute("globalno");
			}
			no++;
			ctx.setAttribute("globalno", no);
			
		}
	
		
		
		
		//transferimos petición a la página de inicio
		RequestDispatcher rd=request.getRequestDispatcher("inicio.html");
		rd.forward(request, response);
		
	}
	

}
