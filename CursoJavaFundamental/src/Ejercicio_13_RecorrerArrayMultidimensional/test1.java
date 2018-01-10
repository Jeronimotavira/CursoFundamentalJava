package Ejercicio_13_RecorrerArrayMultidimensional;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean[][] ajedrez = new boolean[8][8];
		for(int i=0;i<8;i++) {
			
			for(int j=0;j<8;j++) {
				if((i+j)%2==0) {
					ajedrez[i][j]=true;
				}
			}
			
		} /*
		//mostrar contenido
		for(int i=0; i<8;i++) {
			for(int j=0;j<8;j++) {
				System.out.print(ajedrez[i][j]+"\t");
			}
			System.out.print("\n");
		}
	*/
	
	for(boolean[] n:ajedrez) {
		String color;
		for(boolean x:n) {
			if(x==true) { color = "blanco";}			
		else {
			color = "Negro";}
			System.out.print(color+"\t");}
		System.out.print("\n");
	}
		
	}
}
	

