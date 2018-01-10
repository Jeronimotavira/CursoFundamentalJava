package Ejercicio_17_BuscarStringEnArray;

import java.util.Scanner;

public class Buscador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lista="Ana,Luis,Juan,Pedro;Maria;Luis,Ana,Marta Juanma; Angel,Antonio marta";
		System.out.println("Introduce un nombre:");
		Scanner sc= new Scanner(System.in);
		String [] nombres=lista.split("[,; ]");
		int contador=0;
		String nombreB = sc.nextLine();
		for(String s:nombres) {
			if(s.equalsIgnoreCase(nombreB)) {
				contador++;
				
			}
			
		}
		
		System.out.println("el nombre aparece : "+contador+" veces");
		
		
		

	}

}
