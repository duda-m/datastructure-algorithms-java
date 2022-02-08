package com.duda.datastructure.queue.test;

import com.duda.datastructure.queue.Queue;

public class Class21 {

	public static void main(String[] args) {
		
		Queue<Integer> q = new Queue<>();
		
		q.Queues(1);
		q.Queues(2);
		q.Queues(3);
		q.Queues(4);
		
		System.out.println(q.peek());
		System.out.println(q.toString());
	}

}
