package Ejercicio_06_SumaClases;

public class Sumador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=19;
		int b=6;
		int mayor, menor;
		int suma=0;
		
		mayor=(a>b)?a:b;
		menor=(a<b)?a:b;
		
		for(int i=menor; i<mayor;i++) {
			if(i%2==0){
				System.out.println(i);
				
				suma=suma+i;
			}
		}
		System.out.println(suma);
			
		}
	}


