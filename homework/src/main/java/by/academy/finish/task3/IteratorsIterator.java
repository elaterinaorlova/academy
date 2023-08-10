package by.academy.finish.task3;

import java.util.Iterator;

public class IteratorsIterator<T> implements Iterator<T> {

	private Iterator<T>[] iterators;
	private int currentIndex;

	public IteratorsIterator(Iterator<T>[] iterators) {
		this.iterators = (Iterator<T>[]) iterators;
		this.currentIndex = 0;
	}

	@Override
	public boolean hasNext() {
		for (int i = 0; i < iterators.length; i++) {
			if (currentIndex + i < iterators.length && iterators[currentIndex + i].hasNext()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public T next() {
		if (iterators[currentIndex].hasNext()) {
			return iterators[currentIndex].next();
		} else if (iterators[++currentIndex].hasNext()) {
			return iterators[currentIndex].next();
		} else {
			return null;
		}

	}
}
