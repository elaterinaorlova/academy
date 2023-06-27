package by.academy.homework3;

abstract class Product {

	protected String name;
	protected double price;
	protected double quantity;

	Product() {
		super();
	}

	Product(String name, double price, double quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	double calcProductPrice() {
		return price * quantity * discount();
	}

	abstract double discount();

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	double getQuantity() {
		return quantity;
	}

	void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

}
