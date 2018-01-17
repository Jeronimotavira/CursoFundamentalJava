package ImplementarInterface;

public class PruebaMain {

	public static void main(String[] args) {
	// Prueba del caso 1
		ImplemtarClass ic = new ImplemtarClass();
		ic.print();
		
	// Opcion 2 implementar interface : Clase anomima
		
		InterPrueba t2 = new InterPrueba() {
			
			@Override
			public void print() {
				System.out.println("implementacion 2 directa desde main ");
				
			}
		};
		//crea una clase anonima para crear el objeto apartir de ella. 
		t2.print();
		
		// Opcion 3 con Expresiones lambda
		
		InterPrueba t3 = ()->System.out.println("implentacion 3");
		t3.print();
		
	}

}
