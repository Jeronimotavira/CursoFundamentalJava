package view;

import java.util.List;
import java.util.Scanner;

import model.Contacto;
import model.GestionAgenda;

public class PanelControl {

	public static void main(String[] args) {
	
		int op=0;
		GestionAgenda eje = new GestionAgenda();
		Scanner sc = new Scanner(System.in);
		while(op!=5){
			
			System.out.println("Elije una opcion");
			System.out.println("1 - Añadir Contacto");
			//System.out.println("2 - Buscar Contacto");
			System.out.println("2 - Elimnar Contacto");
			System.out.println("3 - Buscar Contacto");
			System.out.println("4 - Mostrar Contactos");
			System.out.println("5 - Salir");
			String opcion =sc.nextLine();
			op = Integer.parseInt(opcion);
			switch(op) {
			
			case 1:  
				System.out.println("añade un Nombre:\n");
				String nombre = sc.nextLine();
				System.out.println("añade un correo:\n");
				String correo = sc.nextLine();
				System.out.println("añade un telefono:\n");
				String telf = sc.nextLine();
				Integer telefono = Integer.parseInt(telf);
				eje.crearContacto(nombre,correo, telefono);
				
	        break;
	        
			case 2:  
				System.out.println("email de contacto a borrar:\n");
				String email = sc.nextLine();
				eje.eliminarContacto(email);
				
	        break;
			case 3:  
				System.out.println("email a buscar:\n");
				String mail = sc.nextLine();
				Contacto con =eje.buscar(mail);
				if(con!=null) {
					System.out.println(con.getNombre()+con.getEmail()+con.getTelefono());
				}else
				{System.out.println("no existe contacto con ese email.");}
				
	        break;
	        
			case 4:  
				List<Contacto> todos=eje.buscarTodo();
				todos.forEach(c->System.out.println("resultado :" + c.getNombre()+" - "+ c.getEmail()+" - "+c.getTelefono()));
				
	        break;
	        
			default: 
				System.out.println("Programa finalizado"); 
				op = 5; 
	        break;
			
			}
			

		}

	}

}
