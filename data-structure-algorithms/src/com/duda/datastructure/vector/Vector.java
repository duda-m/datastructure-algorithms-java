package com.duda.datastructure.vector;

public class Vector {

	private String[] elements;
	private int size;
	
	public Vector(int capacity) {
		this.elements = new String[capacity];
		this.size = 0;
	}
	
	public void add(String element) {
		for(int i = 0; i<this.elements.length; i++) {
			if(this.elements[i] == null) {
				this.elements[i] = element;
				break;
			}
		}
	}
}
