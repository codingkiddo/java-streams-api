package com.codingkiddo.api.streams.operator;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.jetbrains.annotations.NotNull;

import com.codingkiddo.api.streams.iterator.LsaIterator;

public class ObjSorted<T> extends LsaIterator<T> {

	private final Iterator<? extends T> iterator;
	private final Comparator<? super T> comparator;
	
	public ObjSorted(
			@NotNull Iterator<? extends T> iterator, 
			@NotNull Comparator<? super T> comparator
			) {
		this.iterator = iterator;
		this.comparator = comparator;
	}
	
	@Override
	public T nextIteration() {
		if ( isInitialized ) {
//			final List<T> list = Operat
		}
		return null;
	}

}
