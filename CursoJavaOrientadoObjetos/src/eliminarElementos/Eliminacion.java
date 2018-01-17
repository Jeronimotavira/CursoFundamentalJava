package eliminarElementos;

import java.util.ArrayList;

public class Eliminacion {
	static ArrayList<Integer> numeros;
	public static void main(String[] args) {
		numeros = new ArrayList<>();
		numeros.add(13);numeros.add(8);numeros.add(15);
		numeros.add(14);numeros.add(41);numeros.add(11);
		numeros.replaceAll((Integer n)->{return n+2;});
		//numeros.removeIf(n->n<15);
		//numero.removeIf((Integer n)->{return n<15;});
		/*for(Integer n:numeros) {
			System.out.println(n);
		}*/
		
		for(int i=0 ;i < numeros.size();i++) {
			if(numeros.get(i)<15) {
				numeros.remove(i);	
				i--;
			}}
		
		numeros.forEach(n->System.out.println(n));
		
		
	}
	
}

