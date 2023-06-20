package by.academy.homework1;

public class CatApplication {

	public static void main(String[] args) {

		Cat cat1 = new Cat();

		Cat cat2 = new Cat(" Том ");

		cat2.eat();
		cat2.sleep();
		cat2.walk();

		cat1.grow();
		cat1.grow();
		cat1.grow();
		System.out.println("Возраст кота2 теперь: " + cat1.age);

	}

}
