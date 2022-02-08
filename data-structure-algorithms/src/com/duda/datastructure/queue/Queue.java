package com.duda.datastructure.queue;

import com.duda.datastructure.base.StaticStructure;

public class Queue<T> extends StaticStructure<T> {

	public Queue() {
		super();
	}
	public Queue(int capacity) {
		super(capacity);
	}
	public void Queues(T element) {
		/*this.elements[this.size] = elements;
		this.size++;

		this.elements[this.size++] = element;*/

		this.add(element);

	}
	public T peek(){

		if (this.IsEmpty()){
			return null;
		}

		return this.elements[0];
	}
	public T dequeue(){

		final int pos = 0;

		if (this.IsEmpty()){
			return null;
		}

		T elementtoberemoved = this.elements[pos];

		this.remove(pos);

		return elementtoberemoved;

	}


}
