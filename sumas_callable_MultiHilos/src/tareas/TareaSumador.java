package tareas;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class TareaSumador implements Callable<Long> {
 private int n;
 Lock lc;
	public TareaSumador(int n) {
	
	this.n = n;
}

	@Override
	public Long call()  {
		
		long suma = 0;
		for(int i=1;i<=n;i++) {
			suma=suma+i;
			try{Thread.sleep(50);}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return suma;
	}

}
