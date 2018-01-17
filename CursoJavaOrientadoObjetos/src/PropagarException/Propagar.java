package PropagarException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Propagar {
//EN EL METODO QUE LLAMA AL METODO
	public static void main(String[] args) throws IOException{
		int a,b,r;
		
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("introduce tu nombre");
		try {
		String n = bf.readLine();
		System.out.println("te llamas : "+n);
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
	
		
		/*
		r=0;
		Scanner sc=new Scanner(System.in);
		while(r==0){try {
		System.out.println("introduce numero:");
		a=Integer.parseInt(sc.nextLine());
		System.out.println("introduce otro numero");
		b=Integer.parseInt(sc.nextLine());
		r=a/b;
		System.out.println(r);}
		catch(NumberFormatException ex) {
			System.out.println("numero incorrecto :"+ex.getMessage());
		}
		catch(ArithmeticException ex) {
			System.out.println("el denominador no es valido : "+ex.getMessage());		
		}
		catch(Exception ex) {
			//System.out.println("el denominador no es valido. ");
			ex.printStackTrace();
			break;
		}
		}*/
		}

	}


