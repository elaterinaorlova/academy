package by.academy.homework4;

public class MyIteratorDemo {

	public static void main(String[] args) {

		Integer[] array1 = { 50, 40, 30, 20, 10 };
		MyIterator<Integer> iterator1 = new MyIterator<>(array1);

		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}

		String[] array2 = { "cat", "dog", "frog" };
		MyIterator<String> iterator2 = new MyIterator<>(array2);

		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}
}
