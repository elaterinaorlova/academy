package by.academy.homework2;

public class Task3 {

	public static void main(String[] args) {
		String s1 = "Summer";
		String s2 = "Winter";
		String s12 = s1.substring(0, s1.length() / 2);
		String s22 = s2.substring(s2.length() / 2, s2.length());
		String concat = s12 + s22;
		System.out.println(concat);

	}
}
