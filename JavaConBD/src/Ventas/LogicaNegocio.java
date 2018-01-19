package Ventas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class LogicaNegocio {
	
	beansVenta c;
		public void registrarVenta(int idVenta,	int idCliente,int IdLibro,Date fecha) {
			
			try(Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/libros","root","root");) {			
			String sql="Insert into contactos(idVEnta,idCliente,idLibro,fecha) values(?,?,?,?)";
			// creamos el objeto Statement y enviamos la instruccion SQL 
			Statement st=cn.createStatement();
			st.execute(sql);
			
			}catch(Exception ex) {
				System.out.println("error Io");
				ex.printStackTrace();
			}
			
			System.out.println("contacto añadido");
		}	
			
		/*
		public  List<c> recuperarVentas(){
			return List<c> lc=new List<>();
		}*/	
		
	}


