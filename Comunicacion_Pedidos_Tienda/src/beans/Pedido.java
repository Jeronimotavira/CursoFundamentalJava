package beans;

public class Pedido {
	private String ipcliente;
	private String producto;
	private int unidades;
	public Pedido(String ipcliente, String producto, int unidades) {
		super();
		this.ipcliente = ipcliente;
		this.producto = producto;
		this.unidades = unidades;
	}
	public String getIpcliente() {
		return ipcliente;
	}
	public void setIpcliente(String ipcliente) {
		this.ipcliente = ipcliente;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	
}
