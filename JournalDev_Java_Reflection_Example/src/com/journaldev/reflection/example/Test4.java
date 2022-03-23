package com.journaldev.reflection.example;

import java.util.*;
public class Test4 {

	public static void main(String[] args) throws SecurityException, ClassNotFoundException {

		// getting all of the classes, interfaces, and enums that are explicitly
		// declared in ConcreteClass
		Class<?>[] explicitClasses = Class.forName("com.journaldev.reflection.example.ConcreteClass").getDeclaredClasses();
		for (Class<?> class1 : explicitClasses) {
			System.out.println(class1);
		}
	}
}
