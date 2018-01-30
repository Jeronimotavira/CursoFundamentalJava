package principal;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class MuestraContacto {

	public static void main(String[] args) {
		try {
			String dir="http://10.1.1.100:8080/servicio_contactos/Contactos";
			// establecer comunicación
			URL url = new URL(dir);
			URLConnection con = url.openConnection();
			// lectura de datos
			InputStream is=con.getInputStream();
			JSONParser parser=new JSONParser();
			JSONArray array = (JSONArray) parser.parse(new InputStreamReader(is));
			// recorremos el array JSON y mostramos los nombres de todos los contactos
			for(Object ob:array) {
				
				JSONObject data=(JSONObject)ob;
				System.out.println(data.get("nombre")+" - "+data.get("telefono")+" "+data.get("email"));
			}
		
			}catch(Exception e){
				e.printStackTrace();
			}

	}

}
