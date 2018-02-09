package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class S1
 */
@WebServlet("/S1")
public class S1 extends HttpServlet {


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//transferir petición a S2
		//1.- Obtenemos RequestDispatcher
		RequestDispatcher rd=request.getRequestDispatcher("S2");
		//2.- Realizar transferencia
		rd.forward(request, response);
	}

}
