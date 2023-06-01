package by.academy.homework1;

public class Task4Stepen {

	public static void main(String[] args) {
		int x = 2;
		int a = 0;
		double y = 0;
		boolean isWorking = true;

		while (isWorking) {
			if (y > 1_000_000) {
				isWorking = false;
				break;
			} else {
				a++;
				y = Math.pow(x, a);
			}
			System.out.println("2 в степени " + a + " = " + y);
		}

	}

}
