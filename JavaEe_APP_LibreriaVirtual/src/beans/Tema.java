package beans;

public class Tema {
	
	int idtema;
	String tema;
	public Tema(int idtema, String tema) {
		super();
		this.idtema = idtema;
		this.tema = tema;
	}
	public int getIdtema() {
		return idtema;
	}
	public void setIdtema(int idtema) {
		this.idtema = idtema;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	

}
