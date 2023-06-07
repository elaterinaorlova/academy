package by.academy.homework2;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите строку 1: ");
		String w1 = sc.next();
		System.out.println("Введите строку 2: ");
		String w2 = sc.next();
		sc.close();

		int length1 = w1.length();
		int length2 = w2.length();

		if (length1 != length2) {
			System.out.println(w1 + " and " + w2 + "-> false");

		}
		int l1[] = new int[128];
		int l2[] = new int[128];

		for (int i = 0; i < length1; i++) {
			int charWord1 = w1.charAt(i);
			int charWord2 = w2.charAt(i);
			++l1[charWord1];
			++l2[charWord2];
		}
		for (int i = 0; i < l1.length; i++) {
			if (l1[i] != l2[i])
				System.out.println(w1 + " and " + w2 + "-> false");

		}

		System.out.println(w1 + " and " + w2 + "-> true");

	}
}
