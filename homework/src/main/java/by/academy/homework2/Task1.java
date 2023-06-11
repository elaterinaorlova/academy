package by.academy.homework2;

import java.util.Scanner;

public class Task1 {

	static boolean compareSymbols(String w1, String w2) {

		if (w1.length() != w2.length()) {
			return false;
		}

		int letters1[] = new int[128];
		int letters2[] = new int[128];

		for (int i = 0; i < w1.length(); i++) {
			int charWord1 = w1.charAt(i);
			int charWord2 = w2.charAt(i);
			++letters1[charWord1];
			++letters2[charWord2];
		}

		for (int i = 0; i < letters1.length; i++) {
			if (letters1[i] != letters2[i])
				return false;
		}

		return true;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите строку 1: ");
		String word1 = sc.next();
		System.out.println("Введите строку 2: ");
		String word2 = sc.next();
		sc.close();
		System.out
				.println("“" + word1 + "“" + " " + " and " + "“" + word2 + "“" + " -> " + compareSymbols(word1, word2));
	}
}
