package com.miracle.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/*
 * sorted() method is used on stream of objects to sort them in particular order
 * if you do not specify any arguments, it sorts the stream using default natural sorting order
 * it accepts only a comparator object as argument for customized sorting. 
 * You can pass lambda expression in place of comparator object as an argument to it for customized sorting.*/
public class SortedDemo {

	public static void main(String[] args) {
		List<Integer> marks=new ArrayList<>();
		marks.add(10);
		marks.add(62);
		marks.add(35);
		marks.add(90);
		marks.add(80);
		// use sorted() for default natural sorting (Ascending order)
		List<Integer> defaultSortedList=marks.stream().sorted().collect(Collectors.toList());
		System.out.println("default sorted List is: "+defaultSortedList);
		
		//use sorted(Comparator c) for Customized sorting (descending order)
		List<Integer> CustomizedSortedList=marks.stream()
												.sorted( (i1,i2)->-i1.compareTo(i2))
												.collect(Collectors.toList());
		System.out.println("Customized Sorting List is: "+CustomizedSortedList);
	}

}
