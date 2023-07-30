package by.academy.homework5.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListWithoutDublicates {

	public static <T> void listWithoutDublicates1(List<T> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) != null && list.get(i).equals(list.get(j)))
					list.remove(j);
			}
		}
	}

	public static <T> Set<T> listWithoutDublicates2(List<T> list) {
		return new TreeSet<T>(list);
	}

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(100);
		list1.add(70);
		list1.add(90);
		list1.add(80);
		list1.add(80);
		list1.add(70);
		list1.add(100);

		System.out.println(list1);
		ListWithoutDublicates.listWithoutDublicates1(list1);
		System.out.println(list1);

		List<String> list2 = new ArrayList<>();
		list2.add("Minsk");
		list2.add("Riga");
		list2.add("London");
		list2.add("Oslo");
		list2.add("Minsk");
		list2.add("Dublin");
		list2.add("London");

		System.out.println(list2);
		System.out.println(listWithoutDublicates2(list2));

	}

}
