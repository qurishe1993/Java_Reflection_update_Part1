package com.journaldev.reflection.example;

public class Test5 {

	public static void main(String[] args) throws ClassNotFoundException {

		Class<?> innerClass = Class.forName("com.journaldev.reflection.example.ConcreteClass$ConcreteClassDefaultClass");
		//prints com.journaldev.reflection.ConcreteClass
		System.out.println(innerClass.getDeclaringClass().getCanonicalName());
		System.out.println(innerClass.getEnclosingClass().getCanonicalName());
	}
}
