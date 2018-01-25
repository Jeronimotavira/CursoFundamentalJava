package Print_fichero;

import java.io.PrintStream;

public class Print_fichero {

	public static void main(String[] args) {
		
		String fichero = "D:\\manana\\dias.txt";
		try(PrintStream salida = new PrintStream(fichero);){
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
