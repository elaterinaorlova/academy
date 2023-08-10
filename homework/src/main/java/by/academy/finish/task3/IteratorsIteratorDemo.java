package by.academy.finish.task3;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorsIteratorDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList<Integer> arrayList1 = new ArrayList<>();
		ArrayList<Integer> arrayList2 = new ArrayList<>();

		arrayList1.add(1);
		arrayList1.add(2);
		arrayList1.add(3);
		arrayList1.add(4);
		arrayList2.add(5);
		arrayList2.add(6);
		arrayList2.add(7);
		arrayList2.add(8);

		Iterator<Integer> iterator1 = arrayList1.iterator();
		Iterator<Integer> iterator2 = arrayList2.iterator();

		Iterator[] iterators = { iterator1, iterator2 };

		IteratorsIterator<Integer> iteratorsIterator = new IteratorsIterator<>(iterators);

		System.out.println(iteratorsIterator.hasNext());

		while (iteratorsIterator.hasNext()) {
			System.out.print(iteratorsIterator.next() + " ");
		}

	}

}
