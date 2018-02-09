package servlet;

import java.io.IOException;
import java.time.LocalTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class entrar
 */
@WebServlet(name = "Entrar", urlPatterns = { "/Entrar" })
public class Entrar extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie ck = new Cookie("visita",LocalTime.now().toString());
		ck.setMaxAge(60*60*3);
		response.addCookie(ck);
		//obtenemos/creamos HttpSession
		HttpSession s=request.getSession();		
		ServletContext ctx=request.getServletContext();
		
		int valor=0;
		int cglobal = 0;
		//comprobamos si tenemos ya el atributo
		//y si es así lo recogemos
		
		valor=(Integer)s.getAttribute("contador");
				
		cglobal=(Integer)ctx.getAttribute("cglobal");
		
		//incrementamos la variable y la guardamos
		valor++;
		cglobal++;
		s.setAttribute("contador", valor);
		ctx.setAttribute("cglobal", cglobal);
		//transferimos petición a la página de inicio
		RequestDispatcher rd=request.getRequestDispatcher("index.html");
		rd.forward(request, response);
		
	}

}
