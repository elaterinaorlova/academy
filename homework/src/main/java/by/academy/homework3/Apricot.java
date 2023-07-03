package by.academy.homework3;

public class Apricot extends Product {
	private int sort;
	private String producer;

	public Apricot() {
		super();
	}

	public Apricot(String name, double price, double quantity, int sort, String producer) {
		super(name, price, quantity);
		this.sort = sort;
		this.producer = producer;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	@Override
	public double discount() {
		if (sort == 3) {
			return 0.5;
		}
		return 1;
	}

	@Override
	public String toString() {
		return "Apricot [name=" + name + ", price=" + price + ", quantity=" + quantity + ", sort=" + sort
				+ ", producer=" + producer + "]";
	}

}
