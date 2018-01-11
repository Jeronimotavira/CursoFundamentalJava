package Ejercicio_22_AgendaContactoHashMap;

import java.util.Scanner;

import Ejercicio_20_PanelOpcionesArraylist.LogicaNegocio;

public class PanelControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logica eje = new Logica();
		int op=0;
		Scanner sc = new Scanner(System.in);
		while(op!=5){
			
			System.out.println("Elije una opcion");
			System.out.println("1 - Añadir Contacto");
			System.out.println("2 - Buscar Contacto");
			System.out.println("3 - Elimnar Contacto");
			System.out.println("4 - Mostrar Contactos");
			System.out.println("5 - Salir");
			String opcion =sc.nextLine();
			op = Integer.parseInt(opcion);
			switch(op) {
			
			case 1:    
			System.out.println("añade un Corre:\n");
			String valor = sc.nextLine();
			System.out.println("añade un Nombre:\n");
			String nombre = sc.nextLine();
			System.out.println(eje.anadir(valor,nombre));
	        break;
	        
			case 2:  
				System.out.println("Introduce el correo del Contacto:\n");
				String valor2 = sc.nextLine();
				System.out.println(eje.buscar(valor2));
	        break;
	        
			case 3:  
				System.out.println("Introduce el correo del Contacto:\n");
				String valor3 = sc.nextLine();
				System.out.println(eje.eliminar(valor3)); 
			
	        break;
	        
			case 4:   eje.mostrar(); 
			//mostrarNotas(eje.todasNotas());
	        break;
	        
			default: 
				System.out.println("Programa finalizado"); 
				op = 5; 
	        break;
			
			}
			

		}

	}
}
