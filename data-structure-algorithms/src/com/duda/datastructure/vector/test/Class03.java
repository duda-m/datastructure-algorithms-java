package com.duda.datastructure.vector.test;

import com.duda.datastructure.vector.Vector;

public class Class03 {

	public static void main(String[] args) {
		
		Vector v = new Vector(2);
		
		try {
			v.add("first element");
			v.add("2nd element");
			v.add("3rd element");
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
