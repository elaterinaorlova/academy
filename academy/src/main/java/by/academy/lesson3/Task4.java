package by.academy.lesson3;

import java.util.Scanner;

//4. Ввести с консоли 2 числа, найти большее, меньшее, 
//среднее арифметическое.

public class Task4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите число 1");
		double a = sc.nextDouble();

		System.out.println("Введите число 2");
		double b = sc.nextDouble();

		sc.close();

		if (a > b) {
			System.out.println("наибольшее число: " + a);
		} else {
			System.out.println("наибольшее число: " + b);
		}

		if (a < b) {
			System.out.println("наименьшее число: " + a);
		} else {
			System.out.println("наименьшее число: " + b);
		}
		double c;
		c = (a + b) / 2;
		System.out.println("среднее арифметическое: " + c);

	}

}
