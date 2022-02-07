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
		this.increaseCapacity();
		if(this.size<this.elements.length) {
			this.elements[this.size] = element;
			this.size++;
			return true;
		}
		return false;
	}
	
	public boolean add(int position, String element) {
		
		//checking whether the position is valid 
		if(!(position >=0 && position < size)) {
			throw new IllegalArgumentException("Invalid position");
		}
		
		this.increaseCapacity();
		
		//moving the elements
		for(int i = size-1; i >= position; i--) {
			this.elements[i+1] = this.elements[i];
		}
		this.elements[position] = element;
		this.size++;
		
		return true;
	}
	
	public int size() {
		return this.size;
	}

	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		//covers all elements of the vector, except the last one.
		for(int i = 0; i < this.size-1; i++) {
			s.append(this.elements[i]);
			s.append(", ");
		}
		
		//adds the last element of the vector
		if(this.size > 0) {
			s.append(this.elements[this.size-1]);
		}
		
		s.append("]");
		
		return s.toString();
	}
	
	public String search(int position) {
		if(!(position >=0 && position < size)) {
			throw new IllegalArgumentException("Invalid position");
		}
		return elements[position];
	}
	
	public boolean search(String element) {
		for(int i = 0; i < size; i++) {
			if(this.elements[i].equals(element)) {
				return true;
			}
		}
		return false;
	}
	
	public void increaseCapacity() {
		//checking if the vector is full. 
		if(this.size == this.elements.length) {
			//creating a new vector with twice the size of the old one
			String[] newElements = new String[this.elements.length*2];
			
			for(int i = 0; i < this.elements.length; i++) {
				newElements[i] = this.elements[i];
			}
			this.elements = newElements;
		}
	}
	
	public void remove(int position) {
		if(!(position >=0 && position < size)) {
			throw new IllegalArgumentException("Invalid position");
		}
		for(int i = position; i <this.size-1; i++) {
			this.elements[i] = this.elements[i+1];
		}
		this.size--;
	}
	
}
