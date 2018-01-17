package Abstract;

public class triangulo extends Geometria {
	private int alto;
	private int base;
	public triangulo(String color, int alto, int base) {
		super(color);
		this.alto = alto;
		this.base = base;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	@Override
	public double superficie() {
		// TODO Auto-generated method stub
		return base*alto/2.0;
	}
	

	
}
