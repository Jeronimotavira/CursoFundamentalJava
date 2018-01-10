package Ejercicio_12_InsertarDatosArray;

import java.awt.geom.Arc2D.Double;
import java.util.Scanner;

public class Main {

	
	
	static int resultado = 0;
	static int valorMaximo = 0;
	 
		public  static void main(String[] args ) {
		 Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int[] data=new int[10];
		int totalArray = data.length;
		
		for(int i=0;i<data.length;i++) {
		System.out.println("añade un valor de la posicion : "+i);
		int valor= sc.nextInt();
		if(valor>valorMaximo) {
			valorMaximo = valor;
		}
		data[i]=valor;
		resultado = valor + resultado;
		System.out.println("suma de valor:"+resultado);
		}
		
		int media = resultado/totalArray;
		System.out.println("media:"+media);
		System.out.println("valor mas alto:"+valorMaximo);
		
		mayorMenor(data);

	}
	private static void  mayorMenor(int[] data){
		
		int aux;
		int j;
		int i;
		for( i = 0; i < data.length; i++){
			for(j=i+1; j < data.length; j++){
				if(data[i] > data[j]){
					aux = data[i];
					data[i] = data[j];
					data[j] = aux;
				}
			}
		}
	for(int n:data) {
		System.out.println(n);
		
	}
		
	//public String toString(){
	//	return 4;//"Numero de mayor a menor: " + data[j];
	}

}
