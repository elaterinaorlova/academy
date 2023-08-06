package by.academy.homework7.task2;

public class User extends Person {

	private String login;
	private String password;
	private String email;

	public User() {
		super();
	}

	public User(String firstName, String lastName, int day, int month, int year, String login, String password,
			String email) {
		super(firstName, lastName, day, month, year);
		this.login = login;
		this.password = password;
		this.email = email;
	}

	public void printUserInfo() {
		System.out.println("User info: \n" + "first name: " + getFirstName() + "\n" + "last name: " + getLastName()
				+ "\n" + "age: " + getAge() + "\n" + "date of birth: " + getDateOfBirth() + "\n" + "email: " + email);
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [login=" + login + ", password=" + password + ", email=" + email + "]" + super.toString();
	}

}
