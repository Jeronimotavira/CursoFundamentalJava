package Ejercicio_18_ArrayNotasEnString;

public class SacarNota {

	public static void main(String[] args) {
		
	String datalist = "9.1,4.6,8.5,5.0,2.3,4.5,1.5,2.2,3.3,4.5,5.0,5.0";
	
	String arraydata[] = datalist.split("[,]");
	System.out.println("Aprobados = "+aprobados(arraydata));
	System.out.println("media = "+media(arraydata)+" numero de notas "+arraydata.length);
		
	}
	
	private static int aprobados(String[] valores) {
		int ap = 0;
		for(String n:valores) {
			if(Double.parseDouble(n)>=5) {
				ap++;
			}
			
		}
		return ap;
	}
	
	private static double media(String[] valores) {
		double media = 0 ;
		for(String n:valores) {
			
			media+=Double.parseDouble(n);
		}
		return media/valores.length;
		
		
	}

	}


