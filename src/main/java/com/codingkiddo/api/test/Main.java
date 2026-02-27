package com.codingkiddo.api.test;

import com.codingkiddo.api.streams.Stream;
import com.codingkiddo.api.streams.function.Consumer;

public class Main {
	public static void main(String[] args) {
//		Consumer<Object> co1 = new Consumer<Object>() {
//			@Override
//			public void accept(Object t) {
//				System.out.println(t);
//			}
//		};
//		
		Consumer<String> cs1 = System.out::println;
		System.out.println("-----------------------------------");
		Stream<String> s1 = Stream.of("Monkey", "Lion", "Giraffe", "Lemur", "Lion");
		
		Stream.of("Monkey", "Lion", "Giraffe", "Lemur", "Lion").forEach(cs1);
		System.out.println("-----------------------------------");
		Stream.of("Monkey", "Lion", "Giraffe", "Lemur", "Lion").distinct().forEach(cs1);
		System.out.println("-----------------------------------");
		Stream.of("Monkey", "Lion", "Giraffe", "Lemur", "Lion").sorted().forEach(cs1);
		System.out.println("-----------------------------------");
		Stream.of("Monkey", "Lion", "Giraffe", "Lemur", "Lion").distinct().sorted().forEach(cs1);
		System.out.println("-----------------------------------");
	}
}
