package com.miracle.java.streams;

import java.util.stream.IntStream;

/*
 * Parallel stream is used to process objects on multiple cores of the processor unlike normal Stream which processes on single core
 * So it is relatively faster than normal Stream
 * we use ParallelStream() method to create a parallel stream on Collection
 * we use parallel() method to create parallel stream for group of values.
 * Order of processing is not guaranteed as we process on multiple cores*/

public class ParallelStreamDemo {
	public static void main(String[] args) {
		//create a parallel stream for numbers 1 to 50 and print every number. Note that order is not guaranteed.
		IntStream.rangeClosed(1, 50).parallel().forEach(System.out::println);
	}
}
