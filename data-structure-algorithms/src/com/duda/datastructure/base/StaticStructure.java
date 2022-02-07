package com.duda.datastructure.base;

public class StaticStructure<T> {

	protected T[] elements;
	protected int size;

	public StaticStructure(int capacity) {
		this.elements = (T[])new Object[capacity];
		this.size =0;
	}
	public StaticStructure() {
		this(10);
	}
	protected boolean add(T element){
		this.increaseCapacity();
		if(this.size<this.elements.length) {
			this.elements[this.size] = element;
			this.size++;
			return true;
		}
		return false;
	}
	protected boolean add(int position, T element) {

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
	public void increaseCapacity() {
		//checking if the vector is full. 
		if(this.size == this.elements.length) {
			//creating a new vector with twice the size of the old one
			T[] newElements = (T[])new Object[this.elements.length*2];

			for(int i = 0; i < this.elements.length; i++) {
				newElements[i] = this.elements[i];
			}
			this.elements = newElements;
		}
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
}
