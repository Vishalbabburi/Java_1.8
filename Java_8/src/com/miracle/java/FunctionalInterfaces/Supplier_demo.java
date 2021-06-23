package com.miracle.java.FunctionalInterfaces;

import java.util.function.Supplier;

/* Supplier is a functional interface in java.util.function package
 * As a functional interface it contains only one abstract method called get()
 * We can provide implementation for get() method using a lambda expression 
 * Supplier is used when your function accepts no input but returns something*/
public class Supplier_demo {

	public static void main(String[] args) {
		
		//Supplier that supplies a random number for OTP generation
		Supplier<String> s=()->{
								String otp="";
								for(int i=0;i<=4;i++) {
									otp=otp+(int)(Math.random()*9);
								}
								return otp;
								};
		System.out.println("your otp is: "+s.get());
	}

}
