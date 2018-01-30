package tareas;

import java.util.concurrent.locks.Lock;

import beans.Contador;

public  class Tarea implements Runnable {
	Lock lc;
	private Contador contador;
	public Tarea(Contador c, Lock lc) {
		contador = c;
		this.lc = lc;
		
	}
	@Override
	public void run() {
		try {
		lc.lock();
		int n=contador.getValor();
		n++;
		Thread.sleep(300);		
		contador.setValor(n);
		}catch(Exception e) {
			
			e.printStackTrace();
		}finally{lc.unlock();}
		}
	

	
}
