package by.academy.homework4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("unchecked")
public class Box<T> {

	private T[] things;
	private int currentIndex = 0;

	public Box() {
		super();
		this.things = (T[]) new Object[16];

	}

	public Box(int index) {
		super();
		this.things = (T[]) new Object[index];
	}

	public void addItem(T thing) {
		if (things == null) {
			things = (T[]) new Object[things.length];
		}
		if (currentIndex >= things.length) {
			grow();
		}
		things[currentIndex++] = thing;
	}

	private void grow() {
		T[] temp = (T[]) new Object[things.length * 2 + 1];
		System.arraycopy(things, 0, temp, 0, things.length);
		things = temp;
	}

	public T get(int index) {
		if (index < 0 || index >= currentIndex) {
			System.out.println("There is no thing under such index");
		}

		return things[index];
	}

	public T getLast() {
		return things[things.length - 1];
	}

	public T getFirst() {
		return things[0];
	}

	public void boxSize() {
		System.out.println("Size of the box:" + things.length);
	}

	public void boxLastIndex() {
		System.out.println("Index of the last element:" + (things.length - 1));
	}

	public T[] remove(int index) {
		if (things == null || currentIndex == 0) {
			System.out.println("There is no thing under such index");
		}

		List<T> list = new ArrayList<>(Arrays.asList(things));
		list.remove(index);
		things = (T[]) list.toArray(new Object[list.size()]);
		currentIndex--;
		return things;
	}

	public T[] removeObject(T object) {

		List<T> list = new ArrayList<>(Arrays.asList(things));
		list.remove(object);
		things = (T[]) list.toArray(new Object[list.size()]);
		currentIndex--;
		return things;

	}

	@Override
	public String toString() {
		return "Box " + Arrays.toString(things);
	}

}
