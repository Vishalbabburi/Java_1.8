package com.miracle.java.Optional;

import java.util.Optional;

/*Optional class in introduced in java 1.8
 * An optional object can Contain null value and when an operation is performed on it.It does not throw NPE
 * We use ofNullable() method to create Optional object. It accepts potential null value field as argument and return optional object for it.
 * value can be accessed using get() method
 * we can use orElse() method to provide default value in case if null value is returned */
class Employee{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}
public class OptionalDemo {

	public static void main(String[] args) {
		
		Employee employee1=new Employee("John",20);
		Employee employee2=new Employee(null,22); // null value for employee2 name
		
		String Firstemployee=employee1.getName();
		System.out.println(Firstemployee);
		
		//String Secondemployee=employee2.getName();
		//System.out.println(Secondemployee); //will result in Null Pointer exception, So use Optional Class object
		
		Optional<String> SecondEmployee=Optional.ofNullable(employee2.getName());
		System.out.println(SecondEmployee.orElse("Name Unknown"));

	}
	
}
