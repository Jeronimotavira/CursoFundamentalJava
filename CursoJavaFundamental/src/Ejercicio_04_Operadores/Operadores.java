package Ejercicio_04_Operadores;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5;
		int b=6;
		boolean c;
		
		c= (a++ == b) && (++b<10);
		
		System.out.println("el valor de A es= "+a+"\nel valor de B es ="+b+"\n"+c);
		
		int div = (a<b)?a/b:b/a;
		System.out.println(div);
		
		char x='x';
		int $x  = x;
		
		System.out.println($x);
		
	}

}
