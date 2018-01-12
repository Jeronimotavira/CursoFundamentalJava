package Ejercicio_23_AgendaContactoConBeans;

import java.util.Collection;
import java.util.HashMap;

//import beans.Contacto;

public class GestionContactos {
	HashMap<String,Contacto> agenda;
	public GestionContactos() {
		agenda=new HashMap<>();
	}
	public boolean agregarContacto(String email, String nombre,int telefono) {		
		//se añade si la clave no está ocupada
		if(!agenda.containsKey(email)) {
			Contacto c=new Contacto(nombre,email,telefono);
			agenda.put(email, c);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean agregarContacto(Contacto c) {
		//llamada a la otra versión del método para no repetir las mismas instrucciones
		return agregarContacto(c.getEmail(),c.getNombre(),c.getTelefono());
	}
	
	public Contacto buscarContacto(String email) {
		return agenda.get(email);
	}
	public boolean eliminarContacto(String email) {
		if(agenda.containsKey(email)) {
			agenda.remove(email);
			return true;
		}else {
			return false;
		}
	}
	public Contacto[] recuperarContactos() {
			
		Collection<Contacto> nombres=agenda.values();
		return nombres.toArray(new Contacto[0]);
	}
	
}
