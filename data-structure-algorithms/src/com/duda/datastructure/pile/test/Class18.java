package com.duda.datastructure.pile.test;

import java.util.Stack;

import com.duda.datastructure.pile.Pile;

public class Class18 {

	public static void main(String[] args) {
		
		Pile<Integer> p = new Pile<Integer>();
		
		Stack<Integer> s = new Stack<Integer>();
		
		System.out.println(s.isEmpty());
		
		s.push(3);
		s.push(7);
		s.push(9);
		
		System.out.println(s.size());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s);
		
		
	}

}
