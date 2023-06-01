package by.academy.homework1;

import java.util.Scanner;

public class Task1Shop2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите сумму покупки");
		double sum = sc.nextDouble();

		System.out.println("Введите возраст покупателя");
		int age = sc.nextInt();

		if (sum < 100) {
			System.out.println("Финальная цена с учетом скидки 5%: " + (sum = sum * 0.95));

		} else if (100 <= sum && sum < 200) {
			System.out.println("Финальная цена с учетом скидки 7%: " + (sum = sum * 0.93));

		} else if (200 <= sum && sum < 300) {
			if (age > 18) {
				System.out.println("Финальная цена с учетом скидки 12% и 4%: " + (sum = sum * 0.84));
			} else {
				System.out.println("Финальная цена с учетом скидки 12%: " + (sum = sum * 0.88));
			}

		} else if (300 <= sum && sum < 400) {
			System.out.println("Финальная цена с учетом скидки 15%: " + (sum = sum * 0.85));

		} else if (400 <= sum) {
			System.out.println("Финальная цена с учетом скидки 20%: " + (sum = sum * 0.80));
		}
		sc.close();
	}
}