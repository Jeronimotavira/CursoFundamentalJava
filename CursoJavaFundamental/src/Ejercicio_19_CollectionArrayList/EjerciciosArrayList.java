package Ejercicio_19_CollectionArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class EjerciciosArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> nums=new ArrayList<>();
		nums.add(25);
		nums.add(10);
		nums.add(1,50);
		nums.add(90);
		for(Integer i:nums) {
			
			System.out.println(i);
		}
		//trasformar arraylist en array
		Integer[] miarray= nums.toArray(new Integer[0]);	
		for(Integer b:miarray) {
			
			System.out.println(b);
		}
		miarray[0]=miarray[0]+100;
		System.out.println(nums.get(0));
		
		ArrayList<StringBuilder> palabras=new ArrayList<>();
		palabras.add(new StringBuilder("java"));
		StringBuilder[] pds=palabras.toArray(new StringBuilder[0]);
		pds[0].append("9");
		System.out.println(palabras.get(0));
		// el motivo es porque sigen apuntando al mismo objeto y el StringBuilder es Mutable
		
	//	String[] nombres= {"uno", "dos","tres"};
	//	ArrayList<String> valores = (ArrayList<String>)Arrays.asList(nombres);
	}

}
