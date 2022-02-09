package com.duda.datastructure.pile.labs;

import java.util.Scanner;

import com.duda.datastructure.pile.Pile;

public class Exerc01Pile {

	public static void main(String[] args) {

		Pile<Integer> p = new Pile<Integer>();

		Scanner sc = new Scanner(System.in);

		for(int i =1; i <= 10; i++) {

			System.out.println("Choose a number: ");
			int n = sc.nextInt();

			if(n%2 == 0) {
				p.PileUp(n);
				System.out.println(n + " stacked");
			}else {
				Integer d = p.unstack();
				if(d == null) {
					System.out.println("Pile is empty");
				}else {
					System.out.println("Unstacking element " + d);
					
				}
			}
		}
		System.out.println("Unstacking numbers of the pile...");
		while(!p.IsEmpty()) {
			
			System.out.println("Unstacking elements of the pile" + p.unstack());

		}
		System.out.println("Our pile is: "+ p);
	}

}
