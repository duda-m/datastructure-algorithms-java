package com.duda.datastructure.pile.test;

import com.duda.datastructure.pile.Pile;

public class Class17 {

	public static void main(String[] args) {
		
		Pile<Integer> p = new Pile<Integer>();
		
		p.PileUp(2);
		p.PileUp(8);
		p.PileUp(12);
		
		System.out.println(p);
		
		p.unstack();
		
		System.out.println(p);

	}

}
