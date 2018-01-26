package modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import beans.Contacto;

public class GestionContactos {
	HashMap<String,Contacto> agenda;
	boolean res;
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
	public List<Contacto> recuperarContactos() {
		System.out.println(agenda);	
		Collection<Contacto> nombres=agenda.values();
		return new ArrayList(nombres);
	}
	
	public boolean buscarPorTelefono(int tel) {
		res=false;
		agenda.forEach((k,v)->{if(v.getTelefono()==tel)
								res=true;
		
							  });
		return res;
	}
	
	public void cambiarDominio(String nuevo) {
		agenda.replaceAll((k,v)->{
			String email=v.getEmail();
			//elimina la última parte .xxx
			email=email.substring(0, email.lastIndexOf("."));
			email+="."+nuevo;
			v.setEmail(email);
			return v;
		});
	}
	//********************************************************************************
	public List<Contacto> recuperarPorEdadMaxima(int edad){
		Stream<Contacto> stc= agenda.values().stream();
		return  stc.filter(s->s.getTelefono()<=edad).collect(Collectors.toList());
		
		 
	}
	//********************************************************************************
	
	public Contacto recuperarPorTelefono(int tel) {
		Stream<Contacto> stc= agenda.values().stream();
	return	stc.filter(c->c.getTelefono()==tel).findFirst().orElse(null);
		
		
		
	}
	//********************************************************************************
	public double edadMedia() {
		Stream<Contacto> stc= agenda.values().stream();
		return stc.mapToInt(c->c.getTelefono()).average().getAsDouble();
		
		
	}
	public String[] nombresDominio(String d) {
		Stream<Contacto> stc= agenda.values().stream();
		return stc.filter(c->c.getEmail().endsWith(d)).map(c->c.getNombre()).toArray(t->new String[t]);
		
	}
	public Contacto contactoMayor() {
		Stream<Contacto> stc= agenda.values().stream();
		IntStream edades=stc.mapToInt(e->e.getTelefono());
		int max=edades.max().getAsInt();
	   return recuperarPorTelefono(max);
	   
	   //opcion de Antonio
	   // return stc.max((a,b)->a.getTeleono()-b.getTelefono()).orElse(null);
	}
	

}
