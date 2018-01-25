package ejercicio_01_AltaContacto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AltaContacto {
	

	public static void main(String[] args) {
		//creamos conexion contra la base de datos
		Connection cn=null;
		try {
		cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda2","root","root");			
		String sql="Insert into contactos(nombre,email,telefono) values('eclipse','eclipse@email.com',33333)";
		// creamos el objeto Statement y enviamos la instruccion SQL 
		Statement st=cn.createStatement();
		st.execute(sql);
		System.out.println("contacto añadido");
		}catch(Exception ex) {
			System.out.println("error Io");
			ex.printStackTrace();
		}
		finally {
			try {
				if(cn!=null) {
			cn.close();	
				}}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
