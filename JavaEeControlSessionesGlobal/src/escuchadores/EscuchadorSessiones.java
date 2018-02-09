package escuchadores;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class EscuchadorSessiones implements HttpSessionListener {

   

    public void sessionCreated(HttpSessionEvent arg0)  { 
    	HttpSession s=arg0.getSession();
    	s.setAttribute("contador", 0);
    	
    	
    	ServletContext sc=arg0.getSession().getServletContext();
    	int activas = (Integer)sc.getAttribute("activas");
    	sc.setAttribute("activas", ++activas);
         
    }

    public void sessionDestroyed(HttpSessionEvent arg0)  { 
        
    }
	
}
