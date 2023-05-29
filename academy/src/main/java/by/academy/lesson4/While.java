package by.academy.lesson4;

public class While {

	public static void main(String[] args) {

		int x = 0;
		boolean isWorking = true;
		while (isWorking) {
			if (x % 2 == 0 && x > 10) {
				isWorking = false;
			} else {
				x++;
			}
			System.out.println("x= " + x);
		}
		System.out.println(x);

	}
}
