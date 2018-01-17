package Ejercicio_24_HashSet;

import java.util.HashSet;

public class Prueba01 {

	public static void main(String[] args) {

		HashSet<String> dias = new HashSet<>();
		dias.add("lunes");
		dias.add("martes");
		dias.add("miercoles");
		dias.add(null);
		dias.add("domingo");
		
		for(String s:dias) {
			
			System.out.println(s);
		}

	}

}
