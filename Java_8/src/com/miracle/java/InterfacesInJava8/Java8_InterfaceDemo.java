package com.miracle.java.InterfacesInJava8;


interface interf1{
	
	//abstract method 
	public void m1();
	
	//default method
	 default void m2() { System.out.println("I am default method from interf1");}
	 
	 //static method
	 static void m3() { System.out.println("Iam static method from interf1");}
}

public class Java8_InterfaceDemo implements interf1 {

	@Override
	public void m1() {
		System.out.println("abstract method of interf1 successfully implemented");	
	}
	
	@Override
	public void m2() {
		System.out.println("default method of interf1 is overidden by implentation class");
	}
	
	public static void main(String[] args) {
		//use static method of interf1
		interf1.m3();
		
		//method calls to m1 and m2
		Java8_InterfaceDemo obj=new Java8_InterfaceDemo();
		obj.m1();
		obj.m2();
	}
		
}
