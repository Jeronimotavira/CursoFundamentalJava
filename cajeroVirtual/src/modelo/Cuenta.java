package modelo;

import java.util.ArrayList;

public class Cuenta {
 private double saldo;
 ArrayList<Double> movimientos = new ArrayList<Double>();	
	   public Cuenta(double saldo) {
		   
		
		this.saldo=saldo;
		
	}
	   public void ingresar(double cant) {
		   saldo+=cant;
	
	   }

	   public void extraer(double cant) {
	
		   saldo-=cant;
	   }
	   public double getsaldo() {
		   return saldo;
	   }
	
}
