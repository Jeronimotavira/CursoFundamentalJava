package Ejercicio_22_AgendaContactoHashMap;

import java.util.Collection;
import java.util.HashMap;

public class Logica {
	HashMap<String,String> datos=new HashMap<>();
	public Logica() {
		//super();
		
	}
	public String anadir(String m,String n) {
		if(datos.containsKey(m)) {
			return "El contacto ya existe";
		}else {
		datos.put(m, n);
		return "Contacto añadido";
		}
	}
	public String buscar(String m) {
		if(datos.containsKey(m)) {
			return datos.get(m);
		}else {
		return "Contacto no existe";
		}
		
	}
	public String eliminar(String m) {
		if(datos.containsKey(m)) {
			datos.remove(m);
		return "El contacto fue eliminado";}
		else {
			return "Ese Contacto no existe";
		}
	}
	public void mostrar() {
		Collection<String> col=datos.values();
		for(String i:col) {
			System.out.println(i);
		}
		
	}
	
	
	
}
