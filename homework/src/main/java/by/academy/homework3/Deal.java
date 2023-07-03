package by.academy.homework3;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Deal {

	private User buyer;
	private User seller;
	private Product[] products;
	private int currentIndex = 0;
	private LocalDate today = LocalDate.now();
	public LocalDate deadlineDate = today.plusDays(10);

	public Deal() {
		super();
		products = new Product[10];
	}

	public Deal(User buyer, User seller, Product[] products) {
		super();
		this.buyer = buyer;
		this.seller = seller;
		this.products = products;
	}

	public double calcDealPrice() {
		double price = 0;
		for (Product product : products) {
			if (product == null)
				continue;
			price += product.calcProductPrice();
		}
		return price;
	}

	public void addProduct(Product product) {
		if (products == null) {
			products = new Product[10];
		}
		if (currentIndex >= products.length) {
			grows();
		}
		products[currentIndex++] = product;
	}

	public void grows() {
		Product[] temp = new Product[products.length * 2 + 1];
		System.arraycopy(products, 0, temp, 0, temp.length);
		products = temp;
	}

	public void print() {
		for (int i = 0; i < currentIndex; i++)
			System.out.println(i + ".[" + products[i] + " ]");
	}

	public void remove() {
		if (currentIndex == 0) {
			return;
		}
		products[--currentIndex] = null;
	}

	public void remove(int index) {
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

	public LocalDate getToday() {
		return today;
	}

	public void setToday(LocalDate today) {
		this.today = today;
	}

	public LocalDate getDeadlineDate() {
		return deadlineDate;
	}

	public void setDeadlineDate(LocalDate deadlineDate) {
		this.deadlineDate = deadlineDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(products);
		result = prime * result + Objects.hash(buyer, currentIndex, seller);
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
		return Objects.equals(buyer, other.buyer) && currentIndex == other.currentIndex
				&& Arrays.equals(products, other.products) && Objects.equals(seller, other.seller);
	}

	@Override
	public String toString() {
		return "Deal [buyer=" + buyer + ", seller=" + seller + ", products=" + Arrays.toString(products)
				+ ", currentIndex=" + currentIndex + "]";
	}

}
