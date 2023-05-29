package by.academy.homework1;

public class Task4StepenIsWorking {

	public static void main(String[] args) {
		int x = 2;
		int a = 0;
		double y = 0;
		boolean isWorking = true;

		while (isWorking) {
			if (y > +1000000) {
				isWorking = false;
			} else {
				y = Math.pow(x, a);
				a++;
			}

			System.out.println("2 в степени " + a + " = " + y);

		}

	}

}
