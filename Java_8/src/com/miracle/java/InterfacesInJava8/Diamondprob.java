package com.miracle.java.InterfacesInJava8;
/*
 * when in case of multiple inheritance.
 * If parent interfaces have methods with same signature, be it abstract methods or default methods
 then child implementation class must and should override those methods to avoid ambiguity or diamond problem
 *static methods with same signature in parent interfaces need not be overridden in child class as static methods of interface 
 cannot be referenced using child class object. it can only be done with parent Interface reference */
interface FirstInterf{
	
	//abstract method 
	public void m1();
	
	//default method
	 default void m2() { System.out.println("Iam default method from FirstInterf");}
	 
	 //static method
	 static void m3() { System.out.println("Iam static method from FirstInterf");}
}
interface SecondInterf{
	
	//abstract method 
	public void m1();
	
	//default method
	 default void m2() { System.out.println("I am default method from SecondInterf");}
	 
	 //static method
	 static void m3() { System.out.println("Iam static method from SecondInterf");}
}
public class Diamondprob implements FirstInterf,SecondInterf{

	@Override
	public void m1() {
		System.out.println("overridded ambiguos method m1 of parent interfaces to solve ambiguity problem");
		
	}
	@Override
	public void m2() {
		System.out.println("overridded ambiguos method m2 of parent interfaces to solve ambiguity problem");
		FirstInterf.super.m2();
	}
	public static void main(String[] args) {
		Diamondprob obj=new Diamondprob();
		obj.m1();
		obj.m2();
		FirstInterf.m3();
		SecondInterf.m3();

	}

	

}
