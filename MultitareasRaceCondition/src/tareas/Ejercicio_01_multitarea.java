package tareas;

public class Ejercicio_01_multitarea extends Thread {

	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println(i);
		}
	
	}
	
	

}
