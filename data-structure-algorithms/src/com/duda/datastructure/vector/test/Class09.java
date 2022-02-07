package com.duda.datastructure.vector.test;

import com.duda.datastructure.vector.Vector;

public class Class09 {

	public static void main(String[] args) {
		
		Vector v = new Vector(2);

		v.add("B");
		v.add("C");
		v.add("D");
		v.add("E");
		
		System.out.println(v);
		
		v.remove(1);
		
		System.out.println(v);
	}

}
