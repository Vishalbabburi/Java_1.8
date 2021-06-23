package com.miracle.java.FunctionalInterfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* Consumer is a functional interface in java.util.function package
 * As a functional interface it contains only one abstract method called accept()
 * We can provide implementation for accept() method using a lambda expression 
 * Consumer is used when your function accepts one input and returns nothing
 * A BiConsumer interfaces's accept() takes two arguments as input and returns nothing*/
public class Consumer_demo {

	public static void main(String[] args) {
		 
		//Consumer that takes a String input and prints out UpperCase version of it
		Consumer<String> c=s->System.out.println(s.toUpperCase());
		c.accept("miracle");
		
		//BiConsumer that takes two strings as input and prints out after concatenating them
		BiConsumer<String,String> bc=(s1,s2)->System.out.println(s1.concat(s2));
		bc.accept("Miracle", "Software");
	}

}
