package com.duda.datastructure.vector.test;

import com.duda.datastructure.vector.List;
import com.duda.datastructure.vector.VectorObjects;

public class Class11 {

	public static void main(String[] args) {
		
		List<String> vector = new List<String>(1);
				
		vector.add("Element");		
		//expects a string argument, this one doesn't work
		//vector.add(2);
		
		System.out.println(vector);
	}

}
