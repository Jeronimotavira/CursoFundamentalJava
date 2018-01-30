package principal;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;

public class test {

	public static void main(String[] args) {
		try {
			//ip del servicio a donde vamos hacer la peticion
			String ip="10.1.1.11";
			//puerto de entrada para el servicio
			int puerto=9000;
			//crear el socket
			Socket sok= new Socket(ip,puerto);
		//ahora ya podemos hacer entradas y salidas por medio de ese socket
			InputStream is=sok.getInputStream();
			OutputStream os=sok.getOutputStream();
			PrintStream salida = new PrintStream(os);
			salida.println("profe");
			//leo respuesta
			BufferedReader bf = new BufferedReader(new InputStreamReader(is));
			String cad=bf.readLine();
			System.out.println(cad);
		
	
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
