package model;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GestionUsuarios")
public class GestionUsuarios extends HttpServlet {
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
	
	public boolean comprobaruser(String user, String pass) {
		boolean res = false;
		try(Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/libros","root","root");){
		String sql = "select * from clientes where usuario = ? and password = ?";
		PreparedStatement ps = cn.prepareStatement(sql);
		ps.setString(1, user);
		ps.setString(2, pass);
		ResultSet rs=ps.executeQuery();
		res=rs.next();
		
		}	catch(Exception e) {
			e.printStackTrace();
		}
		return res;
		
		}
	
public void alta(String usuario,String password, String email, int tel) {
		
		try(Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/libros", "root", "root");) {	
		
			String sql="insert into clientes(usuario,password,email,telefono) values(?,?,?,?)";
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1, usuario);
			ps.setString(2, password);
			ps.setString(3, email);
			ps.setInt(4, tel);
			ps.execute();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}

	}
}

