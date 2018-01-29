package principal;

import tareas.Ejercicio_01_multitarea;
import tareas.Ejercicio_01_multitarea2;
import tareasMultipleInterface.Ej_03_1;

public class Iniciotareas {
	Ej_03_1 t3 = new Ej_03_1();
	Thread h3=new Thread(t3);

	public static void main(String[] args) {
		//iniciar tareas en ejecucion concurrente
		
		Ejercicio_01_multitarea2 t1 = new  Ejercicio_01_multitarea2();
		Ejercicio_01_multitarea t = new Ejercicio_01_multitarea();
		t.start();
		t1.start();
		
		}
// para ejecutar las clases con interface hay que usar el constructor thread creados aparir de run de la clase que herada la interface
		
	
		

	
	// y si fuera implementacion a travez de expresion lambda 
	/* Runnable t1=()->{
	for(int i=1;i<=100;i++) {
			System.out.println("esperando: "+i);
			try{Thread.sleep(50);}catch(Exception e) {
				e.printStackTrace();
			}
	
	
}
}*/


}
