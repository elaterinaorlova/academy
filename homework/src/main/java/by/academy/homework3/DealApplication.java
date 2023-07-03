package by.academy.homework3;

public class DealApplication {

	public static void main(String[] args) {
		Deal deal = new Deal();
		Menu menu = new Menu(deal);
		menu.start();
	}
}