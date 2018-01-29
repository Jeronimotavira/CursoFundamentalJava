package multitareasTablaMultiplicar;

import java.util.Scanner;

public class EjercicioMultiTareaMultiplicar extends Thread {
	
	@Override
	public void run() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("añade numero:");
		Integer num = Integer.getInteger(sc.nextLine());
		for(int i=1;i<=100;i++) {
			System.out.println("resultado"+num+"*" +i+" = "+(i*num));
			
		}
		try { Thread.sleep(50);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	
	

	

}
