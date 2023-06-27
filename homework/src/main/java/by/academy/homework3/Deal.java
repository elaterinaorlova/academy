package by.academy.homework3;

import java.util.Arrays;
import java.util.Objects;

class Deal {

	String address;
	User buyer;
	User seller;
	Product[] products;
	int currentIndex = 0;

//	LocalDate today = LocalDate.now();
//	int year = today.getYear();
//	int month = today.getMonth();
//	int dayMonth = today.getDayOfMonth();
//	LocalDate deadlineDate = today.plusDays(10);

	Deal() {
		super();
		products = new Product[10];
	}

	Deal(String address, User buyer, User seller, Product[] products) {
		super();
		this.address = address;
		this.buyer = buyer;
		this.seller = seller;
		this.products = products;
	}

	double calcDealPrice() {
		double price = 0;
		for (Product product : products) {
			if (product == null)
				continue;
			price += product.calcProductPrice();
		}
		return price;
	}

	void addProduct(Product product) {
		if (products == null) {
			products = new Product[10];
		}
		if (currentIndex >= products.length) {
			grows();
		}

		products[currentIndex++] = product;
	}

	void grows() {
		Product[] temp = new Product[products.length * 2 + 1];
		System.arraycopy(products, 0, temp, 0, temp.length);
		products = temp;
	}

	void print() {
		for (int i = 0; i < currentIndex; i++)
			System.out.println(i + ".[" + products[i] + " ]");
	}

	void remove() {
		if (currentIndex == 0) {
			return;
		}
		products[--currentIndex] = null;
	}

	void remove(int index) {
		if (products == null || currentIndex == 0) {
			return;
		}
		if (index >= 0 && index < currentIndex) {
			products[index] = null;
			System.arraycopy(products, index + 1, products, index, currentIndex - index);
			currentIndex--;
		} else
			return;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public int getCurrentIndex() {
		return currentIndex;
	}

	public void setCurrentIndex(int currentIndex) {
		this.currentIndex = currentIndex;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(products);
		result = prime * result + Objects.hash(address, buyer, currentIndex, seller);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deal other = (Deal) obj;
		return Objects.equals(address, other.address) && Objects.equals(buyer, other.buyer)
				&& currentIndex == other.currentIndex && Arrays.equals(products, other.products)
				&& Objects.equals(seller, other.seller);
	}

	@Override
	public String toString() {
		return "Deal [address=" + address + ", buyer=" + buyer + ", seller=" + seller + ", products="
				+ Arrays.toString(products) + ", currentIndex=" + currentIndex + "]";
	}

}
