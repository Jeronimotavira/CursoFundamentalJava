package Ejercicio_10_PruebaObjeto;

public class Mesa {
	
	int largo, alto;
	
	public void fijarLargo(int largo){
		this.largo=largo;
		
	}
	public void fijarAlto(int alto){
		this.alto=alto;
		
	}
	
	public int superficie(){
		return largo*alto;
		
	}



}
