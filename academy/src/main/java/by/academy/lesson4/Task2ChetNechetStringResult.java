package by.academy.lesson4;

import java.util.Scanner;

public class Task2ChetNechetStringResult {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число");
		int a = sc.nextInt();
		sc.close();
		String result = a % 2 == 0 ? "chetnoye" : "nechetnoe";
		System.out.println(result);

	}

}
