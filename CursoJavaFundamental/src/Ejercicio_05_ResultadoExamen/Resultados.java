package Ejercicio_05_ResultadoExamen;
import java.util.Scanner;

public class Resultados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce una nota:");
		int nota= sc.nextInt();	
		String resultado="sinvalor";
		
		if(nota < 5) {
			 resultado = "Suspenso";	//System.out.println("su nota es Suspenso");
			}else if(nota <= 6) {
			 resultado = "Aprobado";//System.out.println("Su nota es Aprobado");
		
			}else if(nota <=8) {
			resultado =	"notable";//System.out.println("Su nota es Notable");
			}else if(nota <=10){
			resultado = "Sobresaliente";//System.out.println("Su nota es Sobre saliente");
			}else {
				resultado = "nota no valida";
			}
			System.out.println("su nota es "+resultado);
	// con switch
		switch(nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("suspenso");
			break;
		
		case 5:
		case 6:
			System.out.println("aprobado");
			break;
		case 7:
		case 8:
			System.out.println("notable");
			break;
		case 9:
		case 10:
			System.out.println("Sobresaliente");
		default: 
			System.out.println("nota no valida");
			}
	
	

		
}}

