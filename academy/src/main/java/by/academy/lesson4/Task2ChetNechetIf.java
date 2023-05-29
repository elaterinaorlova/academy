package by.academy.lesson4;

import java.util.Scanner;

public class Task2ChetNechetIf {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число");

		int a = sc.nextInt();
		sc.close();

		if (a % 2 == 0) {
			System.out.println("chetnoye");
		} else {
			System.out.println("nechetnoe");

		}

	}
}