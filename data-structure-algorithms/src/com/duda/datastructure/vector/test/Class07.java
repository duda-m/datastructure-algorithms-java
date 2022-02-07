package com.duda.datastructure.vector.test;

import com.duda.datastructure.vector.Vector;

public class Class07 {

	public static void main(String[] args) {
		
		Vector v = new Vector(12);

		v.add("2");
		v.add("3");
		v.add("5");
		v.add("6");
		
		System.out.println(v.add(0, "1"));
		System.out.println(v);
		
		System.out.println(v.add(3, "4"));
		System.out.println(v);
		
	}

}
