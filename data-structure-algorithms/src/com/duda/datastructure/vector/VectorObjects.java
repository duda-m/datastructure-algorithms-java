package com.duda.datastructure.vector;

public class VectorObjects {

	private Object[] elements;

	//the size measures the quantity of elements in the vector, could be less than the total capacity or could be equal
	private int size;

	public VectorObjects(int capacity) {
		this.elements = new Object[capacity];
		this.size = 0;
	}

	public boolean add(Object element){
		this.increaseCapacity();
		if(this.size<this.elements.length) {
			this.elements[this.size] = element;
			this.size++;
			return true;
		}
		return false;
	}

	public boolean add(int position, Object element) {

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

	public Object search(int position) {
		if(!(position >=0 && position < size)) {
			throw new IllegalArgumentException("Invalid position");
		}
		return elements[position];
	}

	public int search(Object element) {
		for(int i = 0; i < size; i++) {
			if(this.elements[i].equals(element)) {
				return i;
			}
		}
		return -1;
	}

	public void increaseCapacity() {
		//checking if the vector is full. 
		if(this.size == this.elements.length) {
			//creating a new vector with twice the size of the old one
			Object[] newElements = new Object[this.elements.length*2];

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
