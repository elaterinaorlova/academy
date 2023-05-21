package by.academy.lesson2;

public class CatDemo {

	public static void main(String[] args) {

//создаем объекты
		// передаем параметры
		Cat cat1 = new Cat();
		System.out.println(cat1);

		// не передаем параметры
		Cat cat2 = new Cat("Васька", "серый", 8.0, 7);
		System.out.println(cat2);

		// вызываем методы, заставляем кота что-то делать
		cat2.eat();
		System.out.println(cat2);

		cat2.walk();
		System.out.println(cat2);

		cat2.sleep();
	}

}
