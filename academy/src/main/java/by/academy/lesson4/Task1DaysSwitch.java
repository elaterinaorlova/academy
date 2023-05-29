package by.academy.lesson4;
//Написать программу, которая в зависимости от номера дня недели выводит название дня недели на экран. Использовать switch/case

import java.util.Scanner;

public class Task1DaysSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите номер дня недели");
		int a = sc.nextInt();

		sc.close();

		switch (a) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");

			break;

		default:
			System.out.println("There is no such a day");
			break;
		}
	}

}
