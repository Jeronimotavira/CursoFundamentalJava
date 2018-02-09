package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import beans.Contacto;

public class GestionAgenda {
	private DataSource ds;
	public GestionAgenda() {
		try {
			Context ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:comp/env/refagenda");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	
	}
	/*private static String driver="com.mysql.jdbc.Driver";
	static{
    	try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
        
    }*/
	
	/*public void alta(String nombre, String email, int tel) {
		
		//creamos conexión contra la base de datos
		try(Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda2", "root", "root");) {	
			
			String sql="insert into contactos(nombre,email,telefono) values(?,?,?)";
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1, nombre);
			ps.setString(2, email);
			ps.setInt(3, tel);
			ps.execute();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		
	}
	public int eliminar(String email) {
		int res=0;
		try (Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda2", "root", "root");){
			
			String sql="Delete from contactos where email='"+email+"'";
			//creamos objeto Statement y enviamos instrucción SQL
			Statement st=cn.createStatement();
			res=st.executeUpdate(sql);
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		return res;
	}

	public Contacto buscar(String email) {
		Contacto c=null;
		try (Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda2", "root", "root");){
			String sql="select * from contactos where email='"+email+"'";
			Statement st=cn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			if(rs.next()) {
				c=new Contacto(rs.getString("nombre"),rs.getString("email"),rs.getInt("telefono"));
			}
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		return c;
	}*/
	
	public List<Contacto> recuperarTodos() {
		ArrayList<Contacto> contactos=new ArrayList<>();
		try (Connection cn= ds.getConnection();){
			String sql="select * from contactos";
			Statement st=cn.createStatement();
			ResultSet rs=st.executeQuery(sql);
						
			while(rs.next()) {
				Contacto c=new Contacto(rs.getString("nombre"),rs.getString("email"),rs.getInt("telefono"));
				contactos.add(c);
			}
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		return contactos;
	}

}
