package com.duda.datastructure.vector.test;

import com.duda.datastructure.vector.VectorObjects;

public class Class10 {

	public static void main(String[] args) {
		
		VectorObjects vector = new VectorObjects(3);
		
		
		vector.add(3);
		vector.add(4);
		vector.add(5);
		
		System.out.println(vector);
		System.out.println("Size = " + vector.size());
	}

}
