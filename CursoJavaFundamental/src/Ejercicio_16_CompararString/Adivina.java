package Ejercicio_16_CompararString;

import java.util.Scanner;

public class Adivina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palabraClave = "java";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce una plabra");
		String palabra=sc.nextLine();
		
		if(palabra.equals(palabraClave)) {
			System.out.println("Es correcto");
		}else
		{
			System.out.println("No es correcto");
		}

	}

}
