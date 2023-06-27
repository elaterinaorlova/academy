package by.academy.homework3;

class Wine extends Product {

	private String color;
	private double strength;

	Wine() {
		super();
	}

	Wine(String name, double price, double quantity) {
		super(name, price, quantity);
	}

	Wine(String color, double strength) {
		super();
		this.color = color;
		this.strength = strength;
	}

	Wine(String name, double price, double quantity, String color, double strength) {
		super();
		this.color = color;
		this.strength = strength;
	}

	String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

	double getStrength() {
		return strength;
	}

	void setStrength(double strength) {
		this.strength = strength;
	}

	@Override
	double discount() {
		if (strength < 12) {
			return 0.8;
		}
		return 1;
	}

	@Override
	public String toString() {
		return "Wine [color=" + color + ", strength=" + strength + ", name=" + name + ", price=" + price + ", quantity="
				+ quantity + "]";
	}

}
