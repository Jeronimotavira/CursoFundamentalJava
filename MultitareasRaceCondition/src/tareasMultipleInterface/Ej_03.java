package tareasMultipleInterface;

public class Ej_03 implements Runnable {

	@Override
	public void run() {
		for(int i=100;i>=1;i--) {
			System.out.println(i);
			try { Thread.sleep(50);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
