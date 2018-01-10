package Ejercicio_14_MathMetodos;

public class Dado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lanzamiento = 100000;
		int porcentajes[] = new int[6];
		
		//System.out.println(dado);
		
		for(int i=0;i<lanzamiento;i++) {
			
			int dado =(int)Math.floor(Math.random()*6+1);
			porcentajes[dado-1]= porcentajes[dado-1]+1;
		}
		
		for(int n:porcentajes) {
			
			System.out.println("el porcentaje de "+n*100.0/lanzamiento);
		}
		
	}

}
