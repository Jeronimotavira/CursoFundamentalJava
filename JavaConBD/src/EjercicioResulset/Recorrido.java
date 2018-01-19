package EjercicioResulset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Recorrido {

	public static void main(String[] args) {
		
		try(Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda2","root","root");) {
			
		String sql="select * from contactos";
		// creamos el objeto Statement y enviamos la instruccion SQL 
		Statement st=cn.createStatement();	
		ResultSet rs= st.executeQuery(sql);
		//recorrido de las filas
		while(rs.next()) {
			System.out.println("nombre es : "+rs.getString("nombre")+"|| numero telefono : "+rs.getInt("telefono"));
		}
		/*
		if(st.execute(sql)){
		ResultSet rs=st.getResultSet();
		while(rs.next()) {
			System.out.println("nombre es : "+rs.getString("nombre")+"|| numero telefono : "+rs.getInt("telefono"));
		}
		 
		 
		*/
		
		}catch(Exception ex) {
			System.out.println("error Io");
			ex.printStackTrace();
		}
		
		
	}



}
