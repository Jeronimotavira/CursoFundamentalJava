package presentacion;

import java.util.Scanner;

import beans.Contacto;
import modelo.GestionContactos;

public class Principal {

	public static void main(String[] args) {
		//creamos un objeto de la clase que contiene
				//la lógica de negocio
		        GestionContactos gcontactos=new GestionContactos();
		        Scanner sc=new Scanner(System.in);
		        String nombre,email;
		        
		        int telefono,op;//opcion elegida
		        do{
		           System.out.println("1.- Añadir contacto");
		           System.out.println("2.- Buscar contacto");
		           System.out.println("3.- Eliminar contacto");
		           System.out.println("4.- Mostrar todos");
		           System.out.println("5.- recuperar por edad");
		           System.out.println("6.- Stream edad mayor");  
		           System.out.println("7.- Salir");
		           op=Integer.parseInt(sc.nextLine());
		           switch(op){
		               case 1:
		                   System.out.println("Nombre:");
		                   nombre=sc.nextLine();
		                   System.out.println("Email:");
		                   email=sc.nextLine();
		                   System.out.println("Teléfono:");
		                   telefono=Integer.parseInt(sc.nextLine());
		                   //llamada a los métodos del objeto de la lógica de negocio
		                   if(gcontactos.agregarContacto(email, nombre,telefono)) {
		                	   System.out.println("Contacto añadido");
		                   }else {
		                	   System.out.println("Email repetido, no se ha podido añadir");
		                   }
		                   break;
		               case 2:
		            	   System.out.println("Email:");
		                   email=sc.nextLine();
		                   Contacto con=gcontactos.buscarContacto(email);
		                   if(con!=null) {
		                	   System.out.println(con.getNombre()+"-"+con.getEmail()+"-"+con.getTelefono()); 
		                   }else {
		                	   System.out.println("Contacto no encontrado"); 
		                   }
		                   break;
		               case 3:
		            	   System.out.println("Email:");
		                   email=sc.nextLine();
		                   if(gcontactos.eliminarContacto(email)) {
		                	   System.out.println("Contacto eliminado!"); 
		                   }else {
		                	   System.out.println("No existe ese email!"); 
		                   }
		                   break;
		               case 4:
		            	   Contacto[] todos=gcontactos.recuperarContactos();
		            	   for(Contacto s:todos) {
		            		   System.out.println(s.getNombre()+"-"+s.getEmail()+"-"+s.getTelefono());
		            	   }
		            	   break;
		               case 5:
		            	   // recuperar por telefono
		            	   System.out.println("telefono:");
		                   telefono=Integer.parseInt(sc.nextLine());
		            	   Contacto con1=gcontactos.recuperarPorTelefono(telefono);
		                   if(con1!=null) {
		                	   System.out.println(con1.getNombre()+"-"+con1.getEmail()+"-"+con1.getTelefono()); 
		                   }else {
		                	   System.out.println("Contacto no encontrado"); 
		                   }
		            	   break;
		               case 6:
		            	   // contacto telefono mayor
		            	   Contacto con2=gcontactos.contactoMayor();
		                   if(con2!=null) {
		                	   System.out.println(con2.getNombre()+"-"+con2.getEmail()+"-"+con2.getTelefono()); 
		                   }else {
		                	   System.out.println("Contacto no encontrado"); 
		                   }
		            	   
		            	   break;   
		               case 7:
		                   break;
		               default:
		                   System.out.println("debes escribir una opción válida");
		           }
		        }while(op!=7);

	}



}
