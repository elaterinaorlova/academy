package by.academy.homework1;

public class Cat {

	String nickname;
	int age;
	int money;

	public Cat() {
		super();
	}

	public Cat(String nickname) {
		super();
		this.nickname = nickname;

	}

	public void grow() {
		age = age + 1;
		System.out.println(nickname + " Кот растет");
	}

	public void sleep() {
		System.out.println(nickname + " Кот спит ");
	}

	public void eat() {
		System.out.println(nickname + " Кот ест ");
	}

	public void walk() {
		System.out.println(nickname + " Кот гуляет");
	}

	@Override

	public String toString() {
		return "nickname : " + nickname + " age : " + age + " money: " + money;
	}

}
