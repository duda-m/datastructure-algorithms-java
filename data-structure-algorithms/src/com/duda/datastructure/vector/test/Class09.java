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
		
		System.out.println("Removing D element");
		
		int p = v.search("D");
		if(p >= 0) {
			v.remove(p);
		}else {
			System.out.println("Element doesn't exist");
		}
		
		System.out.println(v);
	}

}
