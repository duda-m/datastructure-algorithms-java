package com.duda.datastructure.pile.labs;

import java.util.Stack;

public class ExercPile04 {

	public static void main(String[] args) {


		Stack<Livro> p = new Stack<Livro>();

		Livro l1 = new Livro();
		l1.setNome("Breves respostas para grandes questões");
		l1.setAutor("Stephen Hawking");
		l1.setAnoLancamento(2018);
		l1.setIsbn("855100431X");

		Livro l2 = new Livro();
		l2.setNome("Teoria da relatividade: sobre a teoria da relatividade especial e geral");
		l2.setAutor("Albert Einstein");
		l2.setAnoLancamento(2015);
		l2.setIsbn("852543275X");

		Livro l3 = new Livro();
		l3.setNome("Cosmos");
		l3.setAutor("Carl Sagan");
		l3.setAnoLancamento(2017);
		l3.setIsbn("8535929886");

		Livro l4 = new Livro();
		l4.setNome("Astrofísica para apressados");
		l4.setAutor("Neil deGrasse Tyson");
		l4.setAnoLancamento(2020);
		l4.setIsbn("6555351284");

		Livro l5 = new Livro();
		l5.setNome("Buracos Negros: Palestra da BBC Reith Lectures");
		l5.setAutor("Stephen Hawking");
		l5.setAnoLancamento(2017);
		l5.setIsbn("8551000985");

		System.out.println("Pile is empty: " + p.isEmpty());

		p.push(l1);
		p.push(l2);
		p.push(l3);
		p.push(l4);
		p.push(l5);

		System.out.println("Pile is being filled...");
		System.out.println(p.size() + " books stacked");
		System.out.println("Filled stack: " + p);

		System.out.println("Peeking the top of the pile: " + p.peek());

		while(!p.isEmpty()) {

			System.out.println("Unstacking elements of the pile: " + p.pop());

		}
		System.out.println("Our pile is: "+ p);


	}
}
