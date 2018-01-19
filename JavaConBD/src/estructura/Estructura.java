package estructura;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Estructura {

	public static void main(String[] args) {
		try(Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda2","root","root");) {
			
			String sql="select * from contactos";
			// creamos el objeto Statement y enviamos la instruccion SQL 
			Statement st=cn.createStatement();	
			ResultSetMetaData rs=(ResultSetMetaData)st.executeQuery(sql);
			
			}catch(Exception ex) {
				System.out.println("error Io");
				ex.printStackTrace();
			}

	}

}
