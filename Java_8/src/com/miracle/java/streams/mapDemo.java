package com.miracle.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/*
 * map() method is an intermediate operation
 * it is used to perform certain operation on each element of the stream.
 * it accepts an object of Function interface as an argument. so we can use a lambda expression as an argument
 * collect() method is a terminal method which collects the results of intermediate functions.*/
public class mapDemo {
	
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(62);
		l.add(35);
		l.add(90);
		l.add(80);
		System.out.println("list before implementing map method : "+l);
		//create a stream and use map() method on stream. such that all the objects in list
		//are incremented by 1 and results should be collected and returned as a list using collect()
		
		List<Integer> resultList= l.stream().map(i->i+1).collect(Collectors.toList());
		System.out.println("list after implementing map method : "+resultList);
}
}
