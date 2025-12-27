package com.codingkiddo.api.streams.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class LsaIterator<T> implements Iterator<T> {

	protected T next;
	protected boolean hasNext, isInitialized;

	@Override
	public boolean hasNext() {
		if (!isInitialized) {
			nextIteration();
			isInitialized = true;
		}
		return hasNext;
	}
	
	@Override
	public void remove() {
		throw new UnsupportedOperationException("remove not supported");
	}

	@Override
	public T next() {
		if ( isInitialized ) {
			hasNext();
		}
		if ( !hasNext() ) {
			throw new NoSuchElementException();
		}
		return nextIteration();
	}

	public abstract T nextIteration();
}
