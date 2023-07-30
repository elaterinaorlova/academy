package by.academy.homework5.task3;

public class TwoDIteratorApplication {

	public static void main(String[] args) {

		String[][] array1 = { { "B", "C", "K", "A", "M" }, { "Ss", "Mm", "Oo" } };
		TwoDIterator<String> iterator1 = new TwoDIterator<>(array1);

		while (iterator1.hasNext()) {
			System.out.print(iterator1.next() + " ");
		}

		System.out.println();

		Integer[][] array2 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8, 9 } };
		TwoDIterator<Integer> iterator2 = new TwoDIterator<>(array2);

		while (iterator2.hasNext()) {
			System.out.print(iterator2.next() + " ");
		}

	}
}