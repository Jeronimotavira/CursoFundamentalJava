package stream;

import java.util.stream.Stream;

public class pruebaStreams {

	public static void main(String[] args) {
	
		Stream<Integer> numeros= Stream.of(4,8,7,5,2,16,2,5,4,7,5,3,16,8);
		
		System.out.println(numeros);
	//	numeros = numeros.distinct().limit(5);
		Stream<Integer> res=numeros.distinct().limit(5);
	//	numeros.skip(1);
	//	System.out.println(res.count());
		boolean alguno=res.filter(s->s%2==0).anyMatch(s->s>10);
		System.out.println(alguno);
		
	}

}
