package by.academy.lesson4;

public class Task2 {

	// Составьте программу, выводящую на экран квадраты чисел от 10 до 20.

	public static void main(String[] args) {

		int x = 10;
		boolean isWorking = true;
		while (isWorking) {
			if (x >= 10 && x <= 20) {
				isWorking = false;
			} else {
				x++;
			}
			System.out.println(x * x);
		}
	}
}