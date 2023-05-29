package by.academy.lesson4;

public class DoWhile {

	public static void main(String[] args) {
		int i = 10;

		do {
			System.out.println("i=" + i);
			i++;
		} while (i < 0);
		System.out.println("Result:" + i);
	}

}
