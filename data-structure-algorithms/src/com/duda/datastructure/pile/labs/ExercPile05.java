package com.duda.datastructure.pile.labs;

import java.util.Scanner;

import com.duda.datastructure.pile.Pile;

public class ExercPile05 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Type a word: ");

		String word = sc.nextLine();

		solution(word);

		/*
		solution("ABCCBA");

		solution("ADA");

		solution("ABCD");

		solution("Galinha");
		 */

	}

	public static void solution(String word){
		System.out.println(word + " it is a palindrome? " + testingPalindrome(word));
	}

	public static boolean testingPalindrome(String word){

		Pile<Character> p = new Pile<Character>(); 

		for (int i = 0; i < word.length(); i++){
			p.PileUp(word.charAt(i));
		}

		String reverseWord = "";
		while (!p.IsEmpty()){
			reverseWord += p.unstack();
		}

		if (reverseWord.equalsIgnoreCase(word)){
			return true;
		}

		return false;
	}


}
