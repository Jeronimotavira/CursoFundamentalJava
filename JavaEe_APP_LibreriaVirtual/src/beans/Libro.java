package beans;

public class Libro {
	
	int isbn, idtema,paginas;
	String titulo, autor;
	double precio;
	public Libro(int isbn, int idtema, int paginas, String titulo, String autor, double precio) {
		super();
		this.isbn = isbn;
		this.idtema = idtema;
		this.paginas = paginas;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public int getIdtema() {
		return idtema;
	}
	public void setIdtema(int idtema) {
		this.idtema = idtema;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
