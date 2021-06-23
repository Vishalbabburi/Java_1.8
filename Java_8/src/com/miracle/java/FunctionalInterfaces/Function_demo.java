package com.miracle.java.FunctionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

/* Function is a functional interface in java.util.function package
 * As a functional interface it contains only one abstract method called apply()
 * We can provide implementation for apply() method using a lambda expression 
 * A BiFunction interface's apply() takes two arguments as input*/
public class Function_demo {

	public static void main(String[] args) {
		
		//Function to return square of a given number
		Function<Integer,Integer> f=i->i*i;
		System.out.println(f.apply(20));
		
		//BiFunction to subtract given two numbers and return the square of result
		BiFunction<Integer,Integer,Integer> bf=(i1,i2)->{
														int result=i1-i2;
														return result*result;
														};
		System.out.println(bf.apply(5,3));
	}
	
}
