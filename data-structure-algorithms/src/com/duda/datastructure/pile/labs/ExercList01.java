package com.duda.datastructure.pile.labs;

import com.duda.datastructure.vector.List;

public class ExercList01 {

	public static void main(String[] args) {
		
		List<String> l = new List<String>(5);
		
		l.add("ma��");
		l.add("morango");
		l.add("uva");
		l.add("laranja");
		
		System.out.println(l.contem("ma��"));
		
		/*System.out.println(l.contem("Ma��"));
		System.out.println(l.contem("MA��"));*/
		
		System.out.println(l.contem("abacaxi"));
		
		
	}

}
