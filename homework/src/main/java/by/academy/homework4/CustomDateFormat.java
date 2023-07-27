package by.academy.homework4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomDateFormat {

	public static final Pattern DATE_FORMAT_DD_MM_YYYY = Pattern
			.compile("(0?[1-9]|[12][0-9]|3[01])(-)(0?[1-9]|1[012])(-)((19|20)\\d\\d)");

	protected static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");

	protected static boolean isValidDate(String scannerDate) {
		Matcher matcher = DATE_FORMAT_DD_MM_YYYY.matcher(scannerDate);
		return matcher.matches();
	}

	public static LocalDate parse(String scannerDate) {
		if (isValidDate(scannerDate)) {
			return LocalDate.parse(scannerDate, FORMATTER);
		}
		return null;
	}
}
