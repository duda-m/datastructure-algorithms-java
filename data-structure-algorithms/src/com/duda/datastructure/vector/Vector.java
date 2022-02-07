package com.duda.datastructure.vector;

import java.util.Arrays;

public class Vector {

	private String[] elements;
	
	//the size measures the quantity of elements in the vector, could be less than the total capacity or could be equal
	private int size;
	
	public Vector(int capacity) {
		this.elements = new String[capacity];
		this.size = 0;
	}
	
	/*public void add(String element) {
		for(int i = 0; i<this.elements.length; i++) {
			if(this.elements[i] == null) {
				this.elements[i] = element;
				break;
			}
		}
	}*/
	
	/*public void add(String element) throws Exception {
		//Verifying if the length of the vector is large than the size. If yes we can add more elements. If not a message will appear.
		if(this.size<this.elements.length) {
			this.elements[this.size] = element;
			this.size++;
		}else {
			throw new Exception("The vector is full, this action is not possible");
		}
	}*/
	
	public boolean add(String element){
		if(this.size<this.elements.length) {
			this.elements[this.size] = element;
			this.size++;
			return true;
		}
		return false;
	}
	
	public int size() {
		return this.size;
	}

	@Override
	public String toString() {
		return Arrays.toString(elements);
	}
	
}
