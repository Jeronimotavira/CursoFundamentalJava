package Ventas;

import java.util.Date;

public class beansVenta {
	
	int idVenta;
	int idCliente;
	int IdLibro;
	Date fecha;
	public beansVenta(int idVenta, int idCliente, int idLibro, Date fecha) {
		super();
		this.idVenta = idVenta;
		this.idCliente = idCliente;
		IdLibro = idLibro;
		this.fecha = fecha;
	}
	public int getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public int getIdLibro() {
		return IdLibro;
	}
	public void setIdLibro(int idLibro) {
		IdLibro = idLibro;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	
	

}
