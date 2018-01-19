package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GestionAgenda {
	
	
	public void crearContacto(String nombre,String mail,Integer telefono) {
		
		try(Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda2","root","root");) {
		String sql="insert into contactos(nombre,email,telefono) values(?,?,?)";
		PreparedStatement ps=cn.prepareStatement(sql);
		ps.setString(1, nombre);
		ps.setString(2, mail);
		ps.setInt(3, telefono);
		ps.execute();
		// si queremos que nos regrese si hubo resultado usamos el 
		//executeupdate()
		// para las consultas y manejar datos usaremos executeQuery
		// que nos regresara un resulset que nos devuelve un cursor. 
		
		
		/*String sql="Insert into contactos(nombre,email,telefono) values('"+nombre+"','"+mail+"',"+telefono+")";
		// creamos el objeto Statement y enviamos la instruccion SQL 
		Statement st=cn.createStatement();
		st.execute(sql);*/		
		}catch(Exception ex) {
			System.out.println("error Io");
			ex.printStackTrace();
		}
		
		System.out.println("contacto añadido");
	}
	
	public void eliminarContacto(String mail) {
	
		try(Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda2","root","root");) {
				
		String sql="DELETE FROM contactos WHERE email ='"+mail+"'";
		// creamos el objeto Statement y enviamos la instruccion SQL 
		Statement st=cn.createStatement();
		st.execute(sql);
		
		}catch(Exception ex) {
			System.out.println("error Io");
			ex.printStackTrace();
		}
		
		System.out.println("contacto añadido");
	}
	

	public Contacto buscar(String email) {
		Contacto c = null;
		try(Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda2","root","root");) {	
			String sql="select nombre, email, telefono from contactos where email ='"+email+"'";
			Statement st=cn.createStatement();	
			ResultSet rs= st.executeQuery(sql);
			if(rs.next()) {
				 c = new Contacto(rs.getString("nombre"),rs.getString("email"),rs.getInt("telefono"));			
			}
		
	}catch(Exception ex) {
		System.out.println("error Io");
		ex.printStackTrace();}
		return c;
}
	public List<Contacto> buscarTodo() {
		ArrayList<Contacto> contactos = new ArrayList<>();
		try(Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda2","root","root");) {	
			String sql="select nombre, email, telefono from contactos";
			Statement st=cn.createStatement();	
			Statement st2=cn.createStatement();
			ResultSet rs= st.executeQuery(sql);
			//st2.execute("insert into contactos(nombre,email,telefono)values('n1','e1',11)");
			while(rs.next()){
				//st2.execute("insert into contactos(nombre,email,telefono)values('n1','e1',11)");
				Contacto c = new Contacto(rs.getString("nombre"),rs.getString("email"),rs.getInt("telefono")); 
				contactos.add(c);
			}
		
	}catch(Exception ex) {
		System.out.println("error Io");
		ex.printStackTrace();}
		return contactos;
}
}
