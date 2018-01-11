package Ejercicio_20_PanelOpcionesArraylist;

import java.util.Scanner;

public class PanelControl {

	public static void main(String[] args) {
	
		LogicaNegocio eje = new LogicaNegocio();
		int op=0;
		Scanner sc = new Scanner(System.in);
		while(op!=5){
			
			System.out.println("Elije una opcion");
			System.out.println("1 - Añadir nota");
			System.out.println("2 - Ver aprobados");
			System.out.println("3 - Nota Media");
			System.out.println("4 - Mostrar todas");
			System.out.println("5 - Salir");
			String opcion =sc.nextLine();
			op = Integer.parseInt(opcion);
			switch(op) {
			
			case 1:    
			System.out.println("añade una nota:\n");
			String valor = sc.nextLine();
			double nota = Double.parseDouble(valor);
			eje.anadirNota(nota);
	        break;
	        
			case 2:   System.out.println("los aprobados son :\n"); 
			System.out.println(eje.aprobados());
	        break;
	        
			case 3:  System.out.println("nota media :\n"+eje.notaMedia()); 
			
	        break;
	        
			case 4:   System.out.println("mostrar todas"); 
			mostrarNotas(eje.todasNotas());
	        break;
	        
			default: 
				System.out.println("Programa finalizado"); 
				op = 5; 
	        break;
			
			}
			
		
		
	

	}	

}
	private static void mostrarNotas(Double[] todasNotas){
		// TODO Auto-generated method stub
		for(Double v:todasNotas) {
			System.out.println(v);
	}
	
	}
}
