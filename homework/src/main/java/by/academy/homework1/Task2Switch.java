package by.academy.homework1;

import java.util.Scanner;

public class Task2Switch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите тип данных");
		String type = sc.next();

		System.out.println("Введите переменную");

		switch (type) {
		case "int":
			int i = sc.nextInt();
			System.out.println("Остаток от деления на 2: " + (i = i % 2));
			break;
		case "double":
			double d = sc.nextDouble();
			System.out.println("70 % от числа: " + (d = d * 70 / 100));
			break;
		case "float":
			float f = sc.nextFloat();
			System.out.println("Возведение в квадрат: " + (f = f * f));
			break;
		case "char":
			int c = sc.next().charAt(0);
			System.out.println("Код символа: " + c);
			break;
		case "String":
			String s = sc.next();
			System.out.println("Hello " + s);
			break;
		default:
			System.out.println("Unsupported type");
			break;
		}
		sc.close();
	}

}
