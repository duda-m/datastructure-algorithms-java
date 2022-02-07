package com.duda.datastructure.pile.test;

import com.duda.datastructure.pile.Pile;

public class Class14 {

	public static void main(String[] args) {
		
		Pile<Integer> p = new Pile<Integer>();
		
		for(int i = 1; i<=10; i++) {
			p.PileUp(i);
		}
		System.out.println(p);
		System.out.println(p.size());
	}

}
