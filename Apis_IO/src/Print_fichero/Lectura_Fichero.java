package Print_fichero;

import java.io.BufferedReader;
import java.io.FileReader;



public class Lectura_Fichero {

	public static void main(String[] args) {
		
		String fichero = "D:\\manana\\dias.txt";
		try(	FileReader fs = new FileReader(fichero);
				BufferedReader salida = new BufferedReader(fs);){
			String s;
			/*while((s=salida.readLine())!=null){
			System.out.println(s);
			}*/
			salida.lines().forEach(System.out::println);	
			
			}catch(Exception e) {
			e.printStackTrace();	
			} 

	}

}
