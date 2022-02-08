package com.duda.datastructure.queue.test;

import com.duda.datastructure.queue.Queue;

public class Class20 {

	public static void main(String[] args) {
		
		Queue<Integer> q = new Queue<Integer>();
		
		q.Queues(1);
		q.Queues(2);
		q.Queues(3);

		System.out.println(q.IsEmpty());
		System.out.println(q.size());
		System.out.println(q.toString());
	}

}
