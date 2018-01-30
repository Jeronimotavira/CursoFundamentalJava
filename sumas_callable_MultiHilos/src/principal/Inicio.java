package principal;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import tareas.TareaSumador;

public class Inicio {

	public static void main(String[] args) {
		//creacion ExecutorService
		ExecutorService srv =Executors.newFixedThreadPool(3) ;
		//creamos objeto Callable
		Callable<Long> cb=new TareaSumador(50);
		
		// guardar el resultado en la variable Future se le puede asignar distintos tipos<>
		Future<Long> ft= srv.submit(cb);
		
		while(!ft.isDone()) {
			System.out.println("esperando a que termine");
		}
		try {
			System.out.println("Resultado Final:"+ft.get());
		} catch (InterruptedException e) {
				e.printStackTrace();
		} catch (ExecutionException e) {
				e.printStackTrace();
		}
		srv.shutdown();
	}

}
