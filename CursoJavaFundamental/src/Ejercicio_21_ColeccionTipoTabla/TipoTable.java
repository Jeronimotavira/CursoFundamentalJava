package Ejercicio_21_ColeccionTipoTabla;

import java.util.Collection;
import java.util.HashMap;

public class TipoTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> datos=new HashMap<>();
		datos.put("a1f", 100);
		datos.put("a1d", 200);
		datos.put("a1c", 100);
		
		//recorrido de valores
		Collection<Integer> col=datos.values();
		for(Integer i:col) {
			System.out.println(i);
		}
		datos.put("a1c", 700);
		for(Integer i:col) {
			System.out.println("nuevos resultados \n"+i);
		}
		
	}
//	if(datos.containsKey(m)) {	}

}
