package by.academy.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		String[] arraySuit = { "Пики", "Бубны", "Трефы", "Червы" };
		String[] arrayRank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз" };
		System.out.println(Arrays.toString(arraySuit));
		System.out.println(Arrays.toString(arrayRank));

		int cardsNumber = arraySuit.length * arrayRank.length;
		System.out.println(cardsNumber);

		Scanner sc = new Scanner(System.in);
		System.out.println("Insert number of players: ");
		int n = sc.nextInt();
		sc.close();

		String[] arrayDeck = new String[cardsNumber];
		for (int i = 0; i < arrayRank.length; i++) {
			for (int j = 0; j < arraySuit.length; j++) {
				arrayDeck[arraySuit.length * i + j] = arrayRank[i] + " " + arraySuit[j];
			}
		}

		for (int i = 0; i < cardsNumber; i++) {
			int card = i + (int) (Math.random() * (cardsNumber - i));
			String temp = arrayDeck[card];
			arrayDeck[card] = arrayDeck[i];
			arrayDeck[i] = temp;
		}

		for (int i = 0; i < n * 5; i++) {
			System.out.println(arrayDeck[i]);
			if (i % 5 == 5 - 1)
				System.out.println();
		}
	}

}
