package com.journaldev.reflection.example;
import java.lang.reflect.Constructor;
import java.util.*;
public class Test11 {

	public static void main(String[] args) throws SecurityException, ClassNotFoundException  {

		//Get All public constructors
		Constructor<?>[] publicConstructors = Class.forName("com.journaldev.reflection.example.ConcreteClass").getConstructors();
		//prints public constructors of ConcreteClass
		for (Constructor<?> constructor : publicConstructors) {
			System.out.println(constructor);
		}
		System.out.println(Arrays.toString(publicConstructors));
	}
}
