package by.academy.homework3;

public class Cheese extends Product {
	private double fatPercentage;
	private boolean isMoldy;

	public Cheese() {
		super();
	}

	public Cheese(String name, double price, double quantity, double fatPercentage, boolean isMoldy) {
		super(name, price, quantity);
		this.fatPercentage = fatPercentage;
		this.isMoldy = isMoldy;
	}

	public double getFatPercentage() {
		return fatPercentage;
	}

	public void setFatPercentage(double fatPercentage) {
		this.fatPercentage = fatPercentage;
	}

	public boolean isMoldy() {
		return isMoldy;
	}

	public void setMoldy(boolean isMoldy) {
		this.isMoldy = isMoldy;
	}

	@Override
	public double discount() {
		if (isMoldy == false) {
			return 0.5;
		}
		return 1;
	}

	@Override
	public String toString() {
		return "Cheese [name=" + name + ", price=" + price + ", quantity=" + quantity + ", fatPercentage="
				+ fatPercentage + ", isMoldy=" + isMoldy + "]";
	}

}
