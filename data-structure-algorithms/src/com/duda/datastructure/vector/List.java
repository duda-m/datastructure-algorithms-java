package com.duda.datastructure.vector;

public class List<T> {

	private T[] elements;

	//the size measures the quantity of elements in the vector, could be less than the total capacity or could be equal
	private int size;

	public List(int capacity) {
		this.elements = (T[])new Object[capacity];
		this.size = 0;
	}

	public boolean add(T element){
		this.increaseCapacity();
		if(this.size<this.elements.length) {
			this.elements[this.size] = element;
			this.size++;
			return true;
		}
		return false;
	}

	public boolean add(int position, T element) {

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

	public T search(int position) {
		if(!(position >=0 && position < size)) {
			throw new IllegalArgumentException("Invalid position");
		}
		return elements[position];
	}
	//this method does the same thing as the search(int position) method
	public T obtem(int position) {
		return this.search(position);
	}

	public int search(T element) {
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
			T[] newElements = (T[]) new Object[this.elements.length*2];

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
	public void remove(T element) {
		int p = this.search(element);
		if(p>=0) {
			this.remove(p);
		}
	}
	public boolean contem(T element) {
		int pos = search(element);
		if(pos >=0) {
			return true;
		}
		return false;
	}
	
	//more efficiently
	public int ultimoIndice(T element) {
		for(int i = this.size-1; i >= 0; i--) {
			return i;
		}
		return -1;
	}
	
	public void limpar() {
		this.size = 0;
		
		//2option
		//this.elements = (T[]) new Object[this.elements.length];
		
		//3option
		/*for(int i =0; i < this.size; i++){
			this.elements[i] = null;
		}
		this.size = 0;
		*/
	
	}
}
