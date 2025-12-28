package com.codingkiddo.api.streams.operator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.jetbrains.annotations.NotNull;

import com.codingkiddo.api.streams.iterator.LsaExtIterator;

public class ObjDistinct<T> extends LsaExtIterator<T> {

	private final Iterator<? extends T> iterator;
	private final Set<T> set;
	
	public ObjDistinct(@NotNull Iterator<? extends T> iterator) {
		this.iterator = iterator;
		this.set = new HashSet<>();
	}
	
	@Override
	protected void nextIteration() {
		while (hasNext = iterator.hasNext()) {
			next = iterator.next();
			if(set.add(next))
				return;
		}
	}

}
