package com.miracle.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Streams_demo {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(62);
		l.add(35);
		l.add(90);
		l.add(80);
		
		//open stream of Integer type on this list
		Stream<Integer> streamoflist=l.stream();
		
		//use the stream to print all the numbers in list
		streamoflist.forEach(System.out::println);
	}
		
}