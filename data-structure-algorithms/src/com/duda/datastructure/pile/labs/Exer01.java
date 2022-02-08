package com.duda.datastructure.pile.labs;

import java.util.Scanner;

import com.duda.datastructure.pile.Pile;

public class Exer01 {

	public static void main(String[] args) {
		
		Pile<Integer> p = new Pile<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i<=10; i++) {
			
			System.out.println("Choose a number: ");
			int n = sc.nextInt();
			
			if(n%2 == 0) {
				p.PileUp(n);
				System.out.println(n + "stacked");
			}else {
				p.unstack();
			}
			
		}
	}

}
