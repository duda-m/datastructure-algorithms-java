package com.duda.datastructure.pile.test;

import com.duda.datastructure.pile.Pile;

public class Class15 {

	public static void main(String[] args) {
		
		Pile<Integer> p = new Pile<Integer>();
		
		System.out.println(p.IsEmpty());
		
		p.PileUp(8);
		
		System.out.println(p.IsEmpty());

	}

}
