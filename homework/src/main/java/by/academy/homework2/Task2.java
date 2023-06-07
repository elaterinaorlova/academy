package by.academy.homework2;

import java.util.Scanner;

public class Task2 {

	private static int findDifferentChars(String s) {
		StringBuilder sb = new StringBuilder();
		String c;
		for (int i = 0; i < s.length(); i++) {
			c = String.valueOf(s.charAt(i));
			if (sb.indexOf(c) == -1)
				sb.append(c);
		}
		return sb.length();
	}

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Insert number of words: ");
		int n = sc.nextInt();
		String[] strings = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Insert word number " + (i + 1) + ":");
			strings[i] = sc.next();
		}
		String result = strings[0];
		for (int i = 1; i < strings.length; i++) {
			System.out.println(strings[i] + ", ");
			if ((findDifferentChars(strings[i])) < (findDifferentChars(result)))
				result = strings[i];
		}
		sc.close();
		System.out.println("Min chars word: " + result);
	}

}
