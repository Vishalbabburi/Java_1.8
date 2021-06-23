package com.miracle.java.FunctionalInterfaces;

import java.util.function.Predicate;
import java.util.function.BiPredicate;

/* Predicate is a functional interface in java.util.function package
 * As a functional interface it contains only one abstract method called test()
 * We can provide implementation for test() method using a lambda expression 
 * Predicate is used when your function accepts one input and always returns a boolean value
 * A BiPredicate's test() takes two arguments as input and returns a boolean value*/
public class Predicate_demo {

	public static void main(String[] args) {
		
		//Predicate to check whether a number is even
		Predicate<Integer> p=i->i%2==0;
		System.out.println(p.test(100));
		
		//BiPredicate to check whether sum of two numbers is even
		BiPredicate<Integer,Integer> bp=(i1,i2)->(i1+i2)%2==0;
		System.out.println(bp.test(4, 7));
	}

}
