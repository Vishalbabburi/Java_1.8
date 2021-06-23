package com.miracle.java.streams;

import java.util.ArrayList;
import java.util.List;

/*
 *filter() is an intermediate operation that takes stream of objects and perform some conditional check on each object
 *It takes object of Predicate as an argument. So we can use lambda function as an argument to it.
 *It only returns the object that passes the conditional check
 *count() method is a terminal method that return the count of total objects in the stream */
public class filterDemo {

	public static void main(String[] args) {
		List<Integer> marks=new ArrayList<>();
		marks.add(10);
		marks.add(62);
		marks.add(35);
		marks.add(90);
		marks.add(80);
		
		//open a stream on marks and use filter() and count() to check total number of passed students
		long number_of_passed = marks.stream().filter(i->i>35).count();
		System.out.println(number_of_passed+" students have passed the examination");

	}

}
