package com.duda.datastructure.pile;

import com.duda.datastructure.base.StaticStructure;

public class Pile<T> extends StaticStructure<T> {

	public Pile() {
		super();
	}
	public Pile(int capacity) {
		super(capacity);
	}
	public void PileUp(T element) {
		super.add(element);
	}
	public T top() {
		if(this.IsEmpty()) {
			return null;
		}
		return this.elements[size-1];
	}
	public T unstack() {
		if(this.IsEmpty()) {
			return null;
		}
		T element = this.elements[size-1];
		size--;
		
		return element;
		/*return this.elements[--size];*/
	}

}
