package by.academy.homework3;

import java.util.regex.Pattern;

public class ValidatorEmail implements Validator {

	private Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@+[a-z0-9]+\\.+[a-zA-Z]{2,6}$");

	@Override
	public Pattern getPattern() {
		return pattern;
	}
}
