package com.duda.datastructure.queue.test;

import com.duda.datastructure.queue.Queue;

public class Class22 {

	public static void main(String[] args) {
		
		Queue<Integer> q = new Queue<>();
		
		q.Queues(8);
		q.Queues(13);
		q.Queues(79);
		q.Queues(57);
		
		System.out.println(q);
		
		System.out.println(q.dequeue());
		
		System.out.println(q);
	}

}
