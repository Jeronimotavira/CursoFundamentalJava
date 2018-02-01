package modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import beans.Pedido;

public class GestionAgenda {
	private LocalDateTime fecha;
	
	
		public JSONObject alta(String produc, int unidades ) {
			
			
			
			JSONObject ob=new JSONObject();
			ob.put("producto", produc);
			ob.put("unidades", unidades);
			ob.put("cliente", "ipcliente");
			ob.put("fecha", fecha.now().toString());
			
			
			return ob;
			

		}
		
		public List<Pedido> buscarContactos(String cad){
			String ip="10.1.1.100";
			int puerto=9000;
			List<Pedido> pedidos=null;
			try {
				Socket sc=new Socket(ip,puerto);
				InputStream is=sc.getInputStream();
				OutputStream os=sc.getOutputStream();
				
				try(PrintStream salida=new PrintStream(os);BufferedReader bf=new BufferedReader(new InputStreamReader(is));){
					salida.println(cad);
					String respJSON=bf.readLine();
					pedidos=transformarEnLista(respJSON);
				}
			}
			catch(IOException ex) {
				ex.printStackTrace();
			}
			return pedidos;
		}
		private List<Pedido> transformarEnLista(String json){
			ArrayList<Pedido> pedidos=new ArrayList<>();
			JSONParser parser=new JSONParser();
			try {
				JSONArray array=(JSONArray)parser.parse(json);
				//recorremos el array JSON y mostramos los nombres de todos
				//los contactos
				//for(Object ob:array) {
				array.forEach(ob->{
					JSONObject data=(JSONObject)ob;
					Pedido c=new Pedido(data.get("producto").toString(), 
							data.get("unidades").toString(), 
							Integer.parseInt(data.get("ipcliente").toString()));
					pedidos.add(c);
				});
					
				//}
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			
			return pedidos;
			
		}
		
		
				
		
	


	} 

