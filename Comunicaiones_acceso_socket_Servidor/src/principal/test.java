package principal;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import comunicaciones.HiloCliente;

public class test {

	public static void main(String[] args) {
		try {
			ServerSocket serv=new ServerSocket(9000);
			//quedamos a la espera de una llamada
			while(true) {
				System.out.println("Esperando llamadas...");
				Socket sc=serv.accept();
				System.out.println("Llamada recibida..."+sc.getInetAddress().getHostAddress());
				new HiloCliente(sc).start();
			}
			
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
