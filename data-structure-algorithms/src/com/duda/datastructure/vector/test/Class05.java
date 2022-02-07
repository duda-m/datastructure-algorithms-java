package com.duda.datastructure.vector.test;

import com.duda.datastructure.vector.Vector;

public class Class05 {

	public static void main(String[] args) {
		
		Vector v = new Vector(12);
		
		v.add("first element");
		v.add("2nd element");
		v.add("3rd element");
		
		System.out.println(v.search(9));

	}

}
