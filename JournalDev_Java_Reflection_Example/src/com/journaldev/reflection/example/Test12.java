package com.journaldev.reflection.example;
import java.lang.reflect.Field;
import java.util.*;
public class Test12 {

	public static void main(String[] args) throws SecurityException, ClassNotFoundException {

		// Get All public fields
		Field[] publicFields = Class.forName("com.journaldev.reflection.example.ConcreteClass").getFields();
		// prints public fields of ConcreteClass, it's superclass and super interfaces
		for (Field field : publicFields) {
			System.out.println(field);
		}
		System.out.println(Arrays.toString(publicFields));

	}
}
