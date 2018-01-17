package Herencia;

public class ClaseHija extends Principal{

	private int z;
	public ClaseHija(int x, int y, int z) {
		super(x,y);
		this.z=z;
	}
	//@Override here make a error to compilation ES.aqui daria error de compilacion
	public void Imprimir() {
		
		System.out.println(getX()+","+getY()+","+z);
	}
	@Override
	public void imprimir() {
		System.out.println("otro");
	}
}
