package by.academy.lesson2;

public class Cat {

//поля, переменные - хранить состояние объекта, описываем объект
	String nikname;
	String color;
	double weight;
	int age;
	double height;
	int money;

//конструктор, чтобы создавать нового кота
	// без параметров
	public Cat() {
		super();
	}

	// с параметрами
	public Cat(String nikname, String color, double weight, int age) {
		super();
		this.nikname = nikname;
		this.color = color;
		this.weight = weight;
		this.age = age;
	}

//метод, поведение кота - наделение возможностями, придавать объекту какое-то поведение
	public void sleep() {
		System.out.println(nikname + " спит ");
		System.out.println();
	}

	public void eat() {
		weight = weight + 1;
		System.out.println(nikname + " ест, вес кота теперь" + weight);
	}

	public void walk() {
		weight = weight - 1;
		System.out.println(nikname + " гуляет, вес кота теперь" + weight);
	}

	@Override

	public String toString() {
		return "nikname : " + nikname + " color : " + color + " weight : " + weight + " age : " + age;
	}

}
