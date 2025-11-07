package com.codingkiddo.api.streams;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

import org.jetbrains.annotations.NotNull;

import com.codingkiddo.api.streams.internal.Params;
import com.codingkiddo.api.streams.iterator.LazyIterator;

public class Stream<T> implements Closeable {

	private final Iterator<? extends T> iterator;
	private final Params params;
	
	private Stream(Iterator<? extends T> iterator) {
		this(null, iterator);
	}
	
	private Stream(Iterable<? extends T> iterator) {
		this(null, new LazyIterator<>(iterator));
	}
	
	Stream(Params params, Iterator<? extends T> iterator) {
		this.params = params;
		this.iterator = iterator;
	}
	
	@NotNull
	public static <T> Stream<T> of(@NotNull Iterator<? extends T> iterator) {
		Objects.requireNonNull(iterator);
		return new Stream<T>(iterator);
	}
	
	@Override
	public void close() throws IOException {
		
	}

}
