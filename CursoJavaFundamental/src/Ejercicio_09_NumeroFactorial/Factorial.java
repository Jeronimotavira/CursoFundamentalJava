package Ejercicio_09_NumeroFactorial;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		
		int contador = 1;
		int resultado = 0;
		int factorial;
	
		do {
			System.out.println("introduce numero");
			factorial = sc.nextInt();	
		}
		while(factorial<0);
	
		
		contador = factorial;
		
		
		do {
			System.out.println("valor factorial:"+factorial +"valor contador"+ contador);
			factorial = factorial * contador;
			--contador;
			System.out.println("el factorial de"+ factorial + "es"+contador);
			}
		while(!(contador==1));
			
		/*for(int i=factorial;i>0;i--) {
			resultado = resultado*i;
		}	
		System.out.println("el factorial de"+ factorial + "es"+resultado);*/
		}
	

		
	}



