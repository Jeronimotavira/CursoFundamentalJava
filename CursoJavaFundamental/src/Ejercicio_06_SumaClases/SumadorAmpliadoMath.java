package Ejercicio_06_SumaClases;

public class SumadorAmpliadoMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=19;
		int b=6;		
		int suma=0;
		
		//int mayor, menor;
		//mayor=(a>b)?a:b;
		//menor=(a<b)?a:b;
		
		for(int i=Math.min(a, b); i<Math.max(a,b);i++) {
			if(i%2==0){
				System.out.println(i);
				
				suma=suma+i;
			}
		}
		System.out.println(suma);
			
		}
	}


