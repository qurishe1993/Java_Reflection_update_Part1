package com.journaldev.reflection.example;
import java.lang.reflect.Constructor;
import java.util.*;

public class Test22 {

	public static void main(String[] args) throws Exception {

		Constructor<?> constructor = Class.forName("com.journaldev.reflection.example.ConcreteClass").getConstructor(int.class);
		//getting constructor parameters
		System.out.println(Arrays.toString(constructor.getParameterTypes())); // prints "[int]"

		Constructor<?> hashMapConstructor = Class.forName("java.util.HashMap").getConstructor(null);
		System.out.println(Arrays.toString(hashMapConstructor.getParameterTypes())); // prints "[]"
	}
}
