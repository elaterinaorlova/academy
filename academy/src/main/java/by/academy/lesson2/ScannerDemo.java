package by.academy.lesson2;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите имя");
		String nikname = sc.next();

		System.out.println("Введите цвет");
		String color = sc.next();

		System.out.println("Введите вес");
		double weight = sc.nextDouble();

		System.out.println("Введите возраст");
		int age = sc.nextInt();

		System.out.println("Введите рост");
		double height = sc.nextDouble();

		System.out.println("Введите деньги");
		int money = sc.nextInt();

		sc.close();

		Cat cat = new Cat(nikname, color, weight, age, height, money);
		System.out.println(cat);
	}

}
