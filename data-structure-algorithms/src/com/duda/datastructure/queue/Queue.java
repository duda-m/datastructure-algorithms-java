package com.duda.datastructure.queue;

import com.duda.datastructure.base.StaticStructure;

public class Queue<T> extends StaticStructure<T> {

	public Queue() {
		super();
	}
	public Queue(int capacity) {
		super(capacity);
	}
	public void Queue(T element) {
		/*this.elements[this.size] = elements;
		this.size++;

		this.elements[this.size++] = element;*/

		this.add(element);

	}

}
