package by.academy.homework5.task2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayAndLinkedList {

	private static List<Integer> addItems(List<Integer> list) {
		Random random = new Random();
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1_000_000; i++) {
			list.add(i, random.nextInt(10));
		}
		System.out.println("Duration of adding 1_000_000 items= " + (System.currentTimeMillis() - start));
		return list;

	}

	private static void getItems(List<Integer> list) {
		Random random = new Random();
		long start = System.currentTimeMillis();

		for (int i = 0; i < 1_000_000; i++) {
			list.get(random.nextInt(1_000_000 - 1));
		}
		System.out.println("Duration of getting 1_000_000 items= " + (System.currentTimeMillis() - start));
	}

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();

		ArrayAndLinkedList.addItems(arrayList);
		System.out.println("Array List size: " + arrayList.size());
		ArrayAndLinkedList.getItems(arrayList);

		System.out.println();

		ArrayAndLinkedList.addItems(linkedList);
		System.out.println("Linked List size: " + linkedList.size());
		ArrayAndLinkedList.getItems(linkedList);

		System.out.println(
				"The ArrayList, compared to a LinkedList, spent much less time getting an element with a random index. "
						+ "Since the ArrayList has fast access to the element by index, and the LinkedList has slow access.");

	}
}
