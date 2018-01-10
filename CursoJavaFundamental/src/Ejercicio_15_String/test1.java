package Ejercicio_15_String;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 Scanner sc = new Scanner(System.in);
 System.out.println("introduce una frase");
 String frase= sc.nextLine();
 System.out.println("total vocales:"+vocales(frase));
		
	}
	private static int vocales(String texto) {
		int contador = 0;
		for(int i=0;i<texto.length();i++) {
			char c = texto.toLowerCase().charAt(i);
			switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			contador++;			
			}
			
		}
		return contador;
	}

	
}
