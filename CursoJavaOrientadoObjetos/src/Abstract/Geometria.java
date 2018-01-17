package Abstract;

public abstract class Geometria {
	private String color;
	// aunque las clases abstractas no pueden crear objetos
	// deben tener un constructor para cuando sean creada desde las hijas
	// inicialice parametros en la llamada al constructor padre. 
	public Geometria(String color) {
		this.color=color;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public abstract double superficie();
	public static double ejemplo() {
		return 2.2;
	}
	

}
