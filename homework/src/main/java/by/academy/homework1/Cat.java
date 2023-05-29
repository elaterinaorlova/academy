package by.academy.homework1;

public class Cat {

	String nickname;
	int age;
	int money;
	char initials;
	boolean isHomeAnimal;

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

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public char getInitials() {
		return initials;
	}

	public void setInitials(char initials) {
		this.initials = initials;
	}

	public boolean getIsHomeAnimal() {
		return isHomeAnimal;
	}

	public void setIsHomeAnimal(boolean isHomeAnimal) {
		this.isHomeAnimal = isHomeAnimal;
	}

	@Override

	public String toString() {
		return "nickname : " + nickname + " age : " + age + " money: " + money;
	}

}
