package by.academy.homework3;

import java.util.regex.Pattern;

public class ValidatorBelarusPhone implements Validator {

	private Pattern pattern = Pattern.compile("^[/+]375[0-9]{9}$");

	@Override
	public Pattern getPattern() {
		return pattern;
	}

}
