package com.duda.datastructure.pile.labs;

import com.duda.datastructure.vector.List;

public class ExercList02 {

	public static void main(String[] args) {

		List<String> l = new List<String>(5);

		l.add("maçã");
		l.add("morango");
		l.add("uva");
		l.add("laranja");
		
		System.out.println(l.ultimoIndice("uva"));

	}

}
