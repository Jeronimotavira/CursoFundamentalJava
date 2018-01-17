package Trycatch;

import java.util.Scanner;

public class Principal {
	static int a;
	static int b;
	static int r;
	public static void main(String[] args) {
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
	}
	}
	
	
}
