package by.academy.homework3;

import java.util.regex.Pattern;

public class ValidatorAmericanPhone implements Validator {

	private Pattern pattern = Pattern.compile("^[/+]1[0-9]{9}$");

	@Override
	public Pattern getPattern() {
		return pattern;
	}

}
