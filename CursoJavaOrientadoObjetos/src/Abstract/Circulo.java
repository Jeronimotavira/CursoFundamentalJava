package Abstract;

public class Circulo extends Geometria {
	private int radio;
	


	public Circulo(String color, int radio) {
		super(color);
		this.radio = radio;
	}

 

	public int getRadio() {
		return radio;
	}



	public void setRadio(int radio) {
		this.radio = radio;
	}



	@Override
	public double superficie() {
		return Math.PI*Math.pow(radio,2);
		//return Math.PI*radio*radio;
		//return 0;
	}




}
