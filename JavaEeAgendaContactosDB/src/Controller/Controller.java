package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Contacto;
import modelo.GestionAgenda;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String ope;
   
    public Controller() {
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email, nombre;
		ope=request.getParameter("ope");
		GestionAgenda ga= new GestionAgenda();
		switch(ope) {
		
		/*case "agregar":
			
			nombre=request.getParameter("nombre");
			email=request.getParameter("mail");
			int telf = Integer.parseInt(request.getParameter("telefono"));
			ga.alta(nombre, email, telf);
			request.getRequestDispatcher("otra.jsp").forward(request, response);
            break;
            
        case "buscar":
        	
			email=request.getParameter("mail");
			Contacto co= ga.buscar(email);
			request.getRequestDispatcher("otra.jsp").forward(request, response);          
            break;
     	   
         
        case "eliminar":
        	email=request.getParameter("mail");
        	ga.eliminar(email);
        	RequestDispatcher rde=request.getRequestDispatcher("otra.jsp");
			rde.forward(request, response);  
            break;*/
        case "4":
     	  ArrayList<Contacto> lisCont =(ArrayList<Contacto>)ga.recuperarTodos();
     	  request.setAttribute("contactos", lisCont);
     	  request.getRequestDispatcher("respuesta.jsp").forward(request, response);
     	  
     	   break;
     	  default:
     	  RequestDispatcher rddf=request.getRequestDispatcher("otra.jsp");
          rddf.forward(request, response);  
           break;  
     	   	  
		
		
		
		}
		
		
	}

}
