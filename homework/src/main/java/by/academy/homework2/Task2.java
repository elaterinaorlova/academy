package by.academy.homework2;

import java.util.Scanner;

public class Task2 {

	private static int findWordWithMinChars(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			String c1 = String.valueOf(s.charAt(i));
			if (sb.indexOf(c1) == -1)
				sb.append(c1);
		}
		return sb.length();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert number of words: ");
		int n = sc.nextInt();
		String[] strings = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Insert word number " + (i + 1) + ":");
			strings[i] = sc.next();
		}
		String result = strings[0];
		for (int i = 1; i < strings.length; i++) {
			if ((findWordWithMinChars(strings[i])) < (findWordWithMinChars(result)))
				result = strings[i];
		}
		sc.close();
		System.out.println("The first word with min chars: " + result);
	}

}
