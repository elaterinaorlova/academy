package by.academy.homework3;

import java.util.Scanner;

public class Menu {

	private Deal deal;
	private Validator phoneValidator = new ValidatorBelarusPhone();
	private Validator emailValidator = new ValidatorEmail();
	private Scanner scanner = new Scanner(System.in);

	public Menu(Deal deal) {
		super();
		this.deal = deal;
	}

//	public void printMenu() {
//		System.out.println("Make some choise:");
//		System.out.println("0 - Exit program");
//		System.out.println("1 - Add product");
//		System.out.println("2 - Set buyer");
//		System.out.println("3 - Set seller");
//		System.out.println("4 - Remove product");
//		System.out.println("5 - Print products");
//		System.out.println("6 - Deal");
//	}
	public void start() {
		int choise;
		do {
			printMenu();

			choise = scanner.nextInt();
			switch (choise) {
			case 0:
				System.out.println("Program is finished");
				return;
			case 1:
				addProduct();
				break;
			case 2:
				createBuyer();
				break;
			case 3:
				createSeller();
				break;
			case 4:
				removeProduct();
				break;
			case 5:
				printProducts();
				break;
			case 6:
				deal();
				break;
			default:
				System.out.println("No such choise");
				break;
			}

		} while (choise != 0);

	}

	private User createUser() {

		User user = new User();

		System.out.println("Enter user name: ");
		user.setName(scanner.next());

		System.out.println("Enter user age: ");
		user.setAge(scanner.nextInt());

		System.out.println("Enter user money");
		user.setMoney(scanner.nextDouble());

		String dateOfBirth;
		do {
			System.out.println("Enter user dateOfBirth (dd/mm/yyyy or dd-mm-yyyy): ");
			dateOfBirth = scanner.next();

		} while (!DateFormat.isValidDate(dateOfBirth));

		user.setDateOfBirth(DateFormat.parse(dateOfBirth));

		String phone;
		do {
			System.out.println("Enter user phone : ");
			phone = scanner.next();

		} while (!phoneValidator.isValid(phone));
		user.setPhone(phone);

		String email;
		do {
			System.out.println("Enter user email : ");
			email = scanner.next();

		} while (!emailValidator.isValid(email));
		user.setEmail(email);

		return user;
	}

	public void createSeller() {
		System.out.println("Enter seller info: ");
		deal.setSeller(createUser());

	}

	public void createBuyer() {
		System.out.println("Enter buyer info: ");
		deal.setBuyer(createUser());
	}

	public void removeProduct() {
		System.out.println("Print product index: ");
		int index = scanner.nextInt();
		deal.remove(index);
	}

	public void printProducts() {
		deal.print();
	}

	public void deal() {
		System.out.println("Deal is finished");
		scanner.close();
	}

	public void addProduct() {
		System.out.println("Enter product type");
		String type = scanner.next();
		System.out.println("Enter " + type + " name: ");
		String name = scanner.next();
		System.out.println("Enter " + type + " price: ");
		Double price = scanner.nextDouble();
		System.out.println("Enter " + type + " quantity: ");
		Double quantity = scanner.nextDouble();
		switch (type) {
		case "wine":
			System.out.println("Enter wine color: ");
			String color = scanner.next();
			System.out.println("Enter wine strength: ");
			Double strength = scanner.nextDouble();
			deal.addProduct(new Wine(name, price, quantity, color, strength));
			break;

		default:
			System.out.println("Wrong type");
		}
	}

	public void printMenu() {
		System.out.println("Make some choise:");
		System.out.println("0 - Exit program");
		System.out.println("1 - Add product");
		System.out.println("2 - Set buyer");
		System.out.println("3 - Set seller");
		System.out.println("4 - Remove product");
		System.out.println("5 - Print products");
		System.out.println("6 - Deal");
	}

}
