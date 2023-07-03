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

	public void start() {
		int choice;
		do {
			printMenu();

			choice = scanner.nextInt();
			switch (choice) {
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
				return;
			default:
				System.out.println("No such choice");
				break;
			}

		} while (choice != 0);

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
			System.out.println("Enter user phone (+375...) : ");
			phone = scanner.next();
		} while (!phoneValidator.validate(phone));
		user.setPhone(phone);

		String email;
		do {
			System.out.println("Enter user email : ");
			email = scanner.next();
		} while (!emailValidator.validate(email));
		user.setEmail(email);
		return user;
	}

	public void createSeller() {
		System.out.println("Enter seller info: ");
		deal.setSeller(createUser());
		System.out.println("You added Seller: " + deal.getSeller());
		System.out.println("-----------------");
	}

	public void createBuyer() {
		System.out.println("Enter buyer info: ");
		deal.setBuyer(createUser());
		System.out.println("You added Buyer: " + deal.getBuyer());
		System.out.println("-----------------");
	}

	public void removeProduct() {
		System.out.println("Print product index: ");
		int index = scanner.nextInt();
		deal.remove(index);
		System.out.println("You removed product");
		System.out.println("-----------------");
	}

	public void printProducts() {
		deal.print();
		System.out.println("-----------------");
	}

	public void deal() {
		System.out.println("Full deal cost: " + deal.calcDealPrice());
		System.out.println("Deadline Date: " + deal.deadlineDate);
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
		case "cheese":
			System.out.println("Enter cheese fatPercentage: ");
			double fatPercentage = scanner.nextDouble();
			System.out.println("Enter if isMoldy (true or false): ");
			boolean isMoldy = scanner.nextBoolean();
			deal.addProduct(new Cheese(name, price, quantity, fatPercentage, isMoldy));
			break;
		case "apricot":
			System.out.println("Enter apricot sort(from 1 to 3): ");
			int sort = scanner.nextInt();
			System.out.println("Enter apricot producer: ");
			String producer = scanner.next();
			deal.addProduct(new Apricot(name, price, quantity, sort, producer));
			break;

		default:
			System.out.println("Wrong type");
		}
		System.out.println("You added product " + type);
		System.out.println("-------------------");
	}

	public void printMenu() {
		System.out.println("Make some choice:");
		System.out.println("0 - Exit program");
		System.out.println("1 - Add product");
		System.out.println("2 - Set buyer");
		System.out.println("3 - Set seller");
		System.out.println("4 - Remove product");
		System.out.println("5 - Print products");
		System.out.println("6 - Deal");
	}

}
