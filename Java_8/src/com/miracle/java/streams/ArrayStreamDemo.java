package com.miracle.java.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * we use Stream.of() method to create a stream for an array or group of values*
 * This method takes group of values or array as input and creates a stream */
public class ArrayStreamDemo {

	public static void main(String[] args) {
		String[] names= {"John","Doe","Alexander"};

		//create a stream for names array and print every name in it.
		Stream.of(names).forEach(System.out::println);
		
		
		//create a stream for random group of integer values and sort them
		List<Integer> sortedList=Stream.of(23,1,44,7,54).sorted().collect(Collectors.toList());
		System.out.println("Sorted List of random values is: "+sortedList);
	}

}
