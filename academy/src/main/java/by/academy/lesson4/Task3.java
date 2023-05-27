package by.academy.lesson4;

import java.util.Scanner;

//2. Составьте программу, которая вычисляет сумму чисел от 1 до n. 
//Значение n вводится с клавиатуры.
//
//3. Составьте программу, составьте программу, которая вычисляет произведение чисел от 1 до n. Значение n
// вводится с клавиатуры.
//
//4. С клавиатуры вводятся n чисел. 
//Составьте программу, которая определяет кол-во отрицательных,
//кол-во положительных и кол-во нулей среди введеных чисел.
//Значение n вводится с клавиатуры.
public class Task3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String result = x < 0 ? "negative" : x > 0 ? "positive" : "zero";

		System.out.println(result);

		sc.close();

	}
}