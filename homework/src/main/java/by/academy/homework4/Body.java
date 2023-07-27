package by.academy.homework4;

public class Body {

	private Body.Heart heart;
	private Body.Lungs lungs;

	public Body() {
		super();
		this.heart = new Body.Heart();
		this.lungs = new Body.Lungs();
	}

	public void live() {
		heart.live();
		lungs.live();
		System.out.println("You stand on the shore and feel the salty smell of the wind that blows from the sea.\n"
				+ "And I believe that you are free, and life has only begun.");
	}

	private class Heart {
		private void live() {
			for (int i = 0; i >= 0 && i <= Integer.MAX_VALUE; i = i + 100) {
				System.out.println(" Knock-knock-knockin'on heaven's door");
			}
		}
	}

	private class Lungs {
		private void live() {
			for (int i = 1; i <= Integer.MAX_VALUE; i++)
				if (i % 100 == 0) {
					System.out.println("breathe out");
				} else if (i % 50 == 0) {
					System.out.println("breathe in");

				}
		}
	}
}
