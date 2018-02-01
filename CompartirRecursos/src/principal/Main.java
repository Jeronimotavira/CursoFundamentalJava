package principal;

import beans.Contador;
import tareas.Tarea;

public class Main {

	public static void main(String[] args) {
		Contador conta = new Contador(0);
		
		Tarea t1 = new Tarea(conta);
		Tarea t2 = new Tarea(conta);
		Tarea t3 = new Tarea(conta);
		/*new Thread(t1).start();
		new Thread(t2).start();
		new Thread(t3).start();*/
		
		try { Thread.sleep(3000);}catch(Exception e) {
			e.printStackTrace();
		}
		
		for (int x= 0; x < 3; x++) {
			
			new Thread("t"+x).start();
			System.out.println(x+conta.getValor());

		}
		System.out.println(conta.getValor()+"ultimo");
		
	}
}
