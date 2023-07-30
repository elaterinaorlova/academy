package by.academy.homework5.task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ArrayListMarks {

	public static void main(String[] args) {
		List<Integer> marks = new ArrayList<>();

		getStudentMarks(marks);

		Iterator<Integer> iterator = marks.iterator();

		int max = 0;
		int temp;
		while (iterator.hasNext()) {
			temp = iterator.next();
			if (temp > max) {
				max = temp;
			}
		}
		System.out.println("Student's max mark is:" + max);

	}

	private static void getStudentMarks(List<Integer> marks) {
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			marks.add(i, random.nextInt(10 + 1));

		}
		System.out.println("Student's marks: " + marks);
	}

}
