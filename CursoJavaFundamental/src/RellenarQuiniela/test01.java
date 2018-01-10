package RellenarQuiniela;
import java.util.Arrays;
import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos numeros aleatorios quieres?");
		int n= sc.nextInt();
		System.out.print("hasta que numero deseas que de el aleatorio?");
		int x= sc.nextInt();
		int randomNumero = x;
		int arraydenumeros [] = new int[n];
		if(randomNumero <arraydenumeros.length) {
			System.out.println("El numero debe ser mayor a : "+arraydenumeros.length);
		}else {
		numeroAleatorio(randomNumero,arraydenumeros);}
		
		imprimirresultado(arraydenumeros);
		//comentario para hacer commit en eclipse
		// tercer commit
		}
	

	


	private static void numeroAleatorio(int cantidadNumeros,  int totalNumeros[]) {
		
		
		for( int i=0; i<totalNumeros.length;i++) {
			int numero = (int) Math.floor((Math.random()*cantidadNumeros)+1);
			boolean check = false;
			System.out.println("valor "+numero);
			for(int j=0;j<i;j++) {
				int numeroAsignado = totalNumeros[j];
				System.out.println("comprobar si valor "+numero+ " esta repetido: ");
				if(numero == numeroAsignado) {
					System.out.println("\nnumero "+numero+" esta repetido en posicion "+j+" \n");
					--i;
					check = true;
					
				}else {
					
					System.out.println("comprobando en posicion ["+j+"] => "+numeroAsignado+ " no es igual");
					}
				
			}
			if(check == false) {
			System.out.println("\nnumero : "+numero+" Asignado a posicion : ["+i+"]\n");
			totalNumeros[i]=numero;}
			else {}
		}
		
	}
	private static void imprimirresultado(int arrayparaordenar[]) {
		// TODO Auto-generated method stub
		Arrays.sort(arrayparaordenar);
		for (int n : arrayparaordenar) {
            System.out.print(n + ". ");
        }
	}
}
