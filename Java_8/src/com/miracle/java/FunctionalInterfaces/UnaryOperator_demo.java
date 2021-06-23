package com.miracle.java.FunctionalInterfaces;

import java.util.function.UnaryOperator;

/* UnaryOperator is a functional interface in java.util.function package
 * It is a Child interface of Function.
 * As a functional interface it contains only one abstract method called apply()
 * We can provide implementation for apply() method using a lambda expression 
 * UnaryOperator is used when your function's input and return value are of same type*/
public class UnaryOperator_demo {
	public static void main(String[] args) {
		
		//UnaryOperator that takes Integer as input and returns a value which is also Integer 
		UnaryOperator<Integer> u=(i)->(i*i)+i;
		System.out.println(u.apply(6));
					
	}
}
