package Ejercicio_08_SumaMil;

public class SumaMil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valor = 1000;
		int suma = 0;
		int contador = 0;
		int i = 0;
		do{
			++contador;
			suma = suma + contador;
			
			
			System.out.println(suma);
			
		}
		while(suma < valor);
		System.out.println(contador);
	}

}
