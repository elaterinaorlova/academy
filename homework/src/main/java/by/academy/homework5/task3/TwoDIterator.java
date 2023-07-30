package by.academy.homework5.task3;

import java.util.Iterator;

public class TwoDIterator<T> implements Iterator<T> {
	private T[][] array;
	private int i = 0;
	private int j = 0;

	public TwoDIterator() {
		super();
	}

	public TwoDIterator(T[][] array) {
		super();
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		return i < array.length && j < array[i].length;
	}

	@Override
	public T next() {
		T temp = array[i][j];
		j++;

		if (j >= array[i].length) {
			i++;
			j = 0;

		}
		return temp;

	}

}
