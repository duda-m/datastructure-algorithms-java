package com.duda.datastructure.pile.labs;

import com.duda.datastructure.pile.Pile;

public class ExercPile03 {

	public static void main(String[] args) {


		Pile<Livro> p = new Pile<Livro>(20);

		Livro l1 = new Livro();
		l1.setNome("Breves respostas para grandes questões");
		l1.setAutor("Stephen Hawking");
		l1.setAnoLancamento(2018);
		l1.setIsbn("855100431X");

		Livro l2 = new Livro();
		l1.setNome("Teoria da relatividade: sobre a teoria da relatividade especial e geral");
		l1.setAutor("Albert Einstein");
		l1.setAnoLancamento(2015);
		l1.setIsbn("852543275X");

		Livro l3 = new Livro();
		l1.setNome("Cosmos");
		l1.setAutor("Carl Sagan");
		l1.setAnoLancamento(2017);
		l1.setIsbn("8535929886");

		Livro l4 = new Livro();
		l1.setNome("Astrofísica para apressados");
		l1.setAutor("Neil deGrasse Tyson");
		l1.setAnoLancamento(2020);
		l1.setIsbn("6555351284");

		Livro l5 = new Livro();
		l1.setNome("Buracos Negros: Palestra da BBC Reith Lectures");
		l1.setAutor("Stephen Hawking");
		l1.setAnoLancamento(2017);
		l1.setIsbn("8551000985");

		System.out.println("Pile is empty: " + p.IsEmpty());

		p.PileUp(l1);
		p.PileUp(l2);
		p.PileUp(l3);
		p.PileUp(l4);
		p.PileUp(l5);

		System.out.println("Pile is being filled...");
		System.out.println(p.size() + " books stacked");
		System.out.println("Filled stack: " + p);

		System.out.println("Peeking the top of the pile: " + p.top());

		while(!p.IsEmpty()) {

			System.out.println("Unstacking elements of the pile: " + p.unstack());

		}
		System.out.println("Our pile is: "+ p);


	}

}
