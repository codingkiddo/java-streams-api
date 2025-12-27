package com.codingkiddo.api.streams.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jetbrains.annotations.NotNull;

public class Operators {

	private Operators() {}
	
	@NotNull
	public static <T> List<T> toList(@NotNull Iterator<? extends T> iterator) {
		final List<T> result = new ArrayList<>();
		while ( iterator.hasNext() ) {
			result.add(iterator.next());
		}
		return result;
	}
}
