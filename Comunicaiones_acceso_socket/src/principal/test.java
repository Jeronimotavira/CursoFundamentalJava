package principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class test {

	public static void main(String[] args) {
		String ip="10.1.1.12";
		int puerto=9000;
		try {
			//conexión
			Socket sc=new Socket(ip,puerto);
			//crear canales entrada/salida
			InputStream is=sc.getInputStream();
			OutputStream os=sc.getOutputStream();
			
			try(PrintStream salida=new PrintStream(os);BufferedReader bf=new BufferedReader(new InputStreamReader(is));){
				//envío de datos
				salida.println("Almuno");
				//leo respuesta		
				String cad=bf.readLine();
				System.out.println(cad);
			}
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
