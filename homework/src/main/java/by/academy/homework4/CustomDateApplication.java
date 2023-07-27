package by.academy.homework4;

import java.util.Scanner;

public class CustomDateApplication {
	public static void main(String[] args) {

		String scannerDate;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Insert first date  (dd-mm-yyy)");
			scannerDate = sc.next();
		} while (!CustomDateFormat.isValidDate(scannerDate));

		CustomDate date1 = new CustomDate(scannerDate);

		do {
			System.out.println("Insert second date  (dd-mm-yyy)");
			scannerDate = sc.next();
		} while (!CustomDateFormat.isValidDate(scannerDate));

		CustomDate date2 = new CustomDate(scannerDate);

		sc.close();

		System.out.println(date1);
		date1.getDayOfWeek(date1);
		System.out.println(date2);
		date2.getDayOfWeek(date2);
		CustomDate.countDaysBetweenDates(date1, date2);
		System.out.println("The Year in your First date is Leap:" + date1.isLeapYear());
		System.out.println("The Year in your Second date is Leap:" + date2.isLeapYear());

	}
}
