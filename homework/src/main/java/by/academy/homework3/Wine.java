package by.academy.homework3;

class Wine extends Product {

	private String color;
	private double strength;

	public Wine() {
		super();
	}

	public Wine(String name, double price, double quantity, String color, double strength) {
		super(name, price, quantity);
		this.color = color;
		this.strength = strength;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getStrength() {
		return strength;
	}

	public void setStrength(double strength) {
		this.strength = strength;
	}

	@Override
	public double discount() {
		if (strength < 12) {
			return 0.5;
		}
		return 1;
	}

	@Override
	public String toString() {
		return "Wine [name=" + name + ", price=" + price + ", quantity=" + quantity + ", color=" + color + ", strength="
				+ strength + "]";
	}

}
