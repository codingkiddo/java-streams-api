package com.codingkiddo.api.streams;

import com.codingkiddo.api.streams.internal.Parameterss;
import com.codingkiddo.api.streams.iterator.LazyIterator;
import com.codingkiddo.api.streams.operator.ObjectArray;

import java.io.Closeable;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;


public class Stream<T> implements Closeable {

    private final Iterator<? extends T> iterator;
    private final Parameterss params;

    private Stream(Iterator<? extends T> iterator) {
        this(null, iterator);
    }

    private Stream(Iterable<? extends T> iterator) {
        this(null, new LazyIterator<>(iterator));
    }

    Stream(Parameterss params, Iterator<? extends T> iterator) {
        this.params = params;
        this.iterator = iterator;
    }

    @NotNull
    public static <T> Stream<T> empty() {
        return of(Collections.<T>emptyList());
    }
    
    @SafeVarargs
	@NotNull
    public static <T> Stream<T> of( @NotNull final T... elements  ) {
    	Objects.requireNonNull(elements); 
    	if ( elements.length == 0 ) {
    		return Stream.<T>empty();
    	}
    	return new Stream<T>(new ObjectArray<T>(elements));
    }
    
    @NotNull
    public static <K, V> Stream<Map.Entry<K, V>> of(@NotNull Map<K, V> map) {
        Objects.requireNonNull(map);
        return new Stream<Map.Entry<K, V>>(map.entrySet());
    }

    @NotNull
    public static <T> Stream<T> of(@NotNull Iterable<? extends T> iterable) {
        Objects.requireNonNull(iterable);
        return new Stream<T>(iterable);
    }

    @NotNull
    public static <T> Stream<T> of(@NotNull Iterator<? extends T> iterator) {
        Objects.requireNonNull(iterator);
        return new Stream<T>(iterator);
    }

    @Override
    public void close() throws IOException {}
}
