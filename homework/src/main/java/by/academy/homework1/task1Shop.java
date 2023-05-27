package by.academy.homework1;

import java.util.Scanner;

public class task1Shop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите сумму покупки");
		double sum = sc.nextDouble();

		System.out.println("Введите возраст покупателя");
		int age = sc.nextInt();

		if (sum < 100) {
			System.out.println("Финальная цена с учемтом скидки: " + (sum = sum * 0.95));

		} else if (100 <= sum && sum < 200) {
			System.out.println("Финальная цена с учемтом скидки: " + (sum = sum * 0.93));

		} else if (200 <= sum && sum < 300) {
			if (age >= 18) {
				System.out.println("Финальная цена с учемтом скидки: " + (sum = sum * 0.84));
			} else {
				System.out.println("Финальная цена с учемтом скидки: " + (sum = sum * 0.91));
			}

		} else if (300 <= sum && sum < 400) {
			System.out.println("Финальная цена с учемтом скидки: " + (sum = sum * 0.85));

		} else if (400 <= sum) {
			System.out.println("Финальная цена с учемтом скидки: " + (sum = sum * 0.80));
		}
		sc.close();
	}
}