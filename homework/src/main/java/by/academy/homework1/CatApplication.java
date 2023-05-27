package by.academy.homework1;

public class CatApplication {

	public static void main(String[] args) {

		Cat cat1 = new Cat();

		Cat cat2 = new Cat(" Том ");

		cat2.eat();
		System.out.println();
		cat2.sleep();
		System.out.println();
		cat2.walk();
		System.out.println();

		cat1.grow();
		System.out.println();
		cat1.grow();
		System.out.println();
		cat1.grow();
		System.out.println(cat1);

	}

}
