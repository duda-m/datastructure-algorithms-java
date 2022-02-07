package com.duda.datastructure.vector.test;

import com.duda.datastructure.vector.Vector;

public class Class04 {

	public static void main(String[] args) {
		
		Vector v = new Vector(10);

		v.add("first element");
		v.add("2nd element");
		v.add("3rd element");

		System.out.println(v.size());

	}

}
