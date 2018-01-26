package Polimorfismo;

import Abstract.Circulo;
import Abstract.Geometria;
import Abstract.triangulo;

public class Polismorfimo {

	public static void main(String[] args) {
// sin polimorfismo
/*  Circulo cr= new Circulo("amarillo",5);
  triangulo tr= new triangulo("rojo",3,7);
  System.out.println("color"+cr.getColor());
  System.out.println("superficie"+cr.superficie());
  System.out.println("color"+tr.getColor());
  System.out.println("superficie"+tr.superficie());*/
		
		
	//********** ahora aplicamos polimorfismo *************************	
		mostrar(new Circulo("amarillo",5));
		mostrar(new triangulo("rojo",3,7));
		
		Geometria f;
		f = new Circulo("verde",3);
		System.out.println(f.getColor());
	}
	private static void mostrar(Geometria d) {
		System.out.println("color "+d.getColor());
		System.out.println("superficie "+d.superficie());
		
	}
	
}
