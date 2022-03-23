package com.journaldev.reflection.example;

public class Test6 {

	public static void main(String[] args) throws ClassNotFoundException {

		// prints "com.journaldev.reflection"
		System.out.println(Class.forName("com.journaldev.reflection.example.BaseInterface").getPackage().getName());
	}
}
