package Ejercicio_20_PanelOpcionesArraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class LogicaNegocio {
	ArrayList<Double> notasLista=new ArrayList<>();
	//Scanner input = new Scanner(System.in);
	public LogicaNegocio() {
		
	}
public void anadirNota(double d) {
	
	//double nota = Double.parseDouble(notas);
	notasLista.add(d);
	//String notas = input.nextLine();
	//double nota = Double.parseDouble(notas);
	//notasLista.add(nota);
	//System.out.println("nota añadida");
	
	
}	

public int notaMedia() {
	
	double media = 0 ;
	int d = notasLista.size();
	for(Double n:notasLista) {
		
		media+=(n);
	}
	return (int)media/d;
	//System.out.println(media/d);
	
	
	
}

public Double[] todasNotas() {
	
	return notasLista.toArray(new Double[0]);
	
	
/*	for(Double n:notasLista) {
		
		System.out.println(n);
	}*/
	
	
	
	
}

public int aprobados() {
	
	int ap = 0;
	for(Double n:notasLista) {
		if(n>=5) {
			ap++;
			}
		}
	//System.out.println((int)ap);
	return (int)ap;
	}


}