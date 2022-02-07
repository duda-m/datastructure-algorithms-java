package com.duda.datastructure.vector.test;

import com.duda.datastructure.vector.VectorObjects;

public class Class10 {

	public static void main(String[] args) {
		
		VectorObjects vector = new VectorObjects(3);
		
		PersonalInformation p1 = new PersonalInformation("1person", "1234-5678","person1@email.com");
		PersonalInformation p2 = new PersonalInformation("2person", "9000-0009","person2@email.com");
		PersonalInformation p3 = new PersonalInformation("3person", "8000-0008","person3@email.com");
		
		//same content however different memory location
		PersonalInformation p4 = new PersonalInformation("1person", "1234-5678","person1@email.com");
		
		vector.add(p1);
		vector.add(p2);
		vector.add(p3);
		
		System.out.println(vector);
		System.out.println("Size = " + vector.size());
		
		int pos = vector.search(p4);
		
		if(pos >= 0) {
			System.out.println("Found it!");
		}else {
			System.out.println("This element does not exist");
		}
	}

}
