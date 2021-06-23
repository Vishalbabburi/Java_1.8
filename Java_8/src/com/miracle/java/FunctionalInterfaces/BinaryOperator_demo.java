
package com.miracle.java.FunctionalInterfaces;

import java.util.function.BinaryOperator;

/* BinaryOperator is a functional interface in java.util.function package
 * It is a Child interface of BiFunction.
 * As a functional interface it contains only one abstract method called apply()
 * We can provide implementation for apply() method using a lambda expression 
 * BinaryOperator is used when your function takes two inputs and your function's inputs and return values are of same type*/
public class BinaryOperator_demo {
	public static void main(String[] args) {
		
		//BinaryOperator that takes Integer as inputs and returns a value which is also Integer 
		BinaryOperator<Integer> bo=(i1,i2)->i1%i2;
		System.out.println(bo.apply(20,3));
					
	}
}

