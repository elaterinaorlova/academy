package by.academy.homework7.task2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private LocalDate dateOfBirth;

	public Person() {
		super();
	}

	public Person(String firstName, String lastName, int day, int month, int year) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = LocalDate.of(year, month, day);
		this.age = Period.between(dateOfBirth, LocalDate.now()).getYears();

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, dateOfBirth, firstName, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(dateOfBirth, other.dateOfBirth)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName);
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", dateOfBirth="
				+ dateOfBirth + "]";
	}

}
