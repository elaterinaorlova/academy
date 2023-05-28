package by.academy.homework1;

import java.util.Scanner;

public class Task2Switch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите тип данных");
		String type = sc.next();

		System.out.println("Введите переменную");
		int number = sc.nextInt();

		switch (type) {
		case "int":
			System.out.println(number = number % 2);
			break;
		case "double":
			System.out.println(number = number * 70 / 100);
			break;
		case "float":
			System.out.println(number = number * number);
			break;
		case "char":
			System.out.println("charAt(0)");
			break;
		case "String":
			System.out.println("Hello " + number);
			break;
		default:
			System.out.println("Unsupported type");
			break;
		}

		sc.close();
	}

}
