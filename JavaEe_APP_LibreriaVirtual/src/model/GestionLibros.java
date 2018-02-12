package model;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Libro;
import beans.Tema;


@WebServlet("/GestionLibros")
public class GestionLibros extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	static  {
		//cargar el driver en memoria
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		}
	

	
public List<Libro> buscarlibrosTemas(String tema) {
		
	List<Libro> lista=new ArrayList<> ();
		try(Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/libros", "root", "root");) {	
		
			
			String sql="select * from libros where idtema = ?";
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1, tema);
			Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);            
            while(rs.next()){
                lista.add(new Libro(rs.getInt("isbn"),rs.getInt("idtema"), rs.getInt("paginas"), rs.getString("titulo"),rs.getString("autor"),rs.getDouble("precio")));
            }
			ps.execute();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		return lista;

	}

public List<Tema> buscarTemas() {
	
	List<Tema> listatema=new ArrayList<> ();
		try(Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/libros", "root", "root");) {	
		
			
			String sql="select * from temas";
			PreparedStatement ps=cn.prepareStatement(sql);			
			Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);            
            while(rs.next()){
            	Tema tema = new Tema(rs.getInt("idTema"), rs.getString("tema"));
              listatema.add(tema);
           
            }
			ps.execute();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		return listatema;

	}




}

