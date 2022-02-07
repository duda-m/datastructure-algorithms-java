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

}
