package Ejercicio_10_PruebaObjeto;

//import muebles.Mesa;

public class test {
    Mesa mesas2 = new Mesa();    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mesa m=new Mesa();
		m.fijarAlto(10);
		m.fijarLargo(5);
		Mesa m2=m;
		m2.fijarLargo(7);
		System.out.println("la superfici de m2 es "+m.superficie());
		System.out.println("la superfici de m es "+m2.superficie());
		System.out.println("es el mismo valor porque va por referencia");
		mostrar(m2);
	}

	 
	public static  int mostrar(Mesa mes) {
		mes.fijarLargo(9);
		mes.fijarAlto(10);
		System.out.println("la superfici de m2 es "+mes.superficie());
		System.out.println("la superfici de m es "+mes.superficie());
		System.out.println("metodo para imprimir");
		return mes.superficie();
		
		
	}
	
	
}
 
