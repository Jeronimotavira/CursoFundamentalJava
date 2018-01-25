package crearPath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class JavaIO_path {

	public static void main(String[] args) throws IOException {
		String fichero="d:\\temporal\\dias.txt";
		Path pt=Paths.get(fichero);
		//file.copy(pt, new FileOutputStream("d:\\manana\\dias.txt"));
		ArrayList<String> masDias=new ArrayList<>();
		masDias.add("jueves");
		masDias.add("miercoles");
		masDias.add("sabado");
		//para pasar todo esto a un archivo sin usar for. volcado masivo de datos. 
		Files.write(pt, masDias,StandardOpenOption.APPEND);
		
		// para lectura es mas comodo usando el Files.lines(path)
		// esto nos  ahorra el tener que crear todo el proceso del bufferedReader. 
		// FORMA DE APLICAR: 
		
		// String Linea=Files.lines(path).aperacionesintermedias().operacoinesintermedias().operacionfinal();
		
		// y el readAllLines te devuelve una List ya directamente de todas las lineas. 
	}

}
