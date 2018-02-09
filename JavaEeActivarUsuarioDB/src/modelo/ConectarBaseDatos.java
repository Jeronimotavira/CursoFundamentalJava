package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConectarBaseDatos {
	
	static  {
		//cargar el driver en memoria
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
		
		
	public boolean comprobaruser(String user, String pass) {
	boolean res = false;
	try(Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/usuarios","root","root");){
	String sql = "select * from usuarios where nombre = ? and password = ?";
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
	
	}	

