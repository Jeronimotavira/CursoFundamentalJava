package Print_fichero;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Print_modo_apend {

	public static void main(String[] args) {
		
		String fichero = "D:\\manana\\Ciudades.txt";
		try(	FileOutputStream fs = new FileOutputStream(fichero, true);
				PrintStream salida = new PrintStream(fs);){
		salida.println("lunes");
		salida.println("martes");
		salida.println("miercoles");
		salida.println("jueves");
		salida.println("viernes");
		
		}catch(Exception e) {
		e.printStackTrace();	
		} 

	}

}
