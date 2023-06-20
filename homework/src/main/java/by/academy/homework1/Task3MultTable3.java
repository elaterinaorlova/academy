package by.academy.homework1;

import java.util.Scanner;

public class Task3MultTable3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Insert the number");
		int x = sc.nextInt();
		sc.close();

		for (int i = 1; i <= 10; i++) {
			System.out.println(x + " * " + i + " = " + x * i);
		}
	}
}