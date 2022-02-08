package com.duda.datastructure.queue.test;

import com.duda.datastructure.queue.Queue;

public class Class20 {

	public static void main(String[] args) {
		
		Queue<Integer> q = new Queue<Integer>();
		
		q.Queue(1);
		q.Queue(2);
		q.Queue(3);

		System.out.println(q.IsEmpty());
		System.out.println(q.size());
		System.out.println(q.toString());
	}

}
