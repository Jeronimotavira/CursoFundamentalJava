package principal;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class test {

	public static void main(String[] args) {
		try {
		String dir="http://apidev.accuweather.com/locations/v1/search?q=madrid,%20spain&apikey=hoArfRosT1215";
		// establecer comunicación
		URL url = new URL(dir);
		URLConnection con = url.openConnection();
		// lectura de datos
		InputStream is=con.getInputStream();
		try(BufferedReader bf=new BufferedReader(new InputStreamReader(is));){
		bf.lines().forEach(s->System.out.println(s));}
	
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
