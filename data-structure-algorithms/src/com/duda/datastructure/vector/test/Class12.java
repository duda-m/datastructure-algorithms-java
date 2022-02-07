package com.duda.datastructure.vector.test;

import java.util.ArrayList;

public class Class12 {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");

		System.out.println(arrayList);

		arrayList.add(1, "F");

		System.out.println(arrayList);

		//search an element
		boolean exists = arrayList.contains("G");

		if(exists) {
			System.out.println("Found it!");
		}else{
			System.out.println("This element does not exist");
		}

		//returns the position of an element
		int pos = arrayList.indexOf("C");

		if(pos >= 0) {
			System.out.println("Found it! "+ pos);
		}else{
			System.out.println("This element does not exist"+ pos);
		}
		
		//search by position
		System.out.println(arrayList.get(2));
		
		//remove method
		arrayList.remove(0);
		arrayList.remove("B");
		
		System.out.println(arrayList);
		
		//checking the size 
		System.out.println(arrayList.size());
		
		
	}

}
