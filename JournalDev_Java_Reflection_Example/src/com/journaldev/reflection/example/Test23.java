package com.journaldev.reflection.example;
import java.util.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
public class Test23 {

	public static void main(String[] args) throws Exception {

		Constructor<?> constructor = Class.forName("com.journaldev.reflection.example.ConcreteClass").getConstructor(int.class);
        //getting constructor parameters
		System.out.println(Arrays.toString(constructor.getParameterTypes())); // prints "[int]"

		Object myObj = constructor.newInstance(10);
		Method myObjMethod = myObj.getClass().getMethod("method1", null);
		myObjMethod.invoke(myObj, null); // prints "Method1 impl."

		Constructor<?> hashMapConstructor = Class.forName("java.util.HashMap").getConstructor(null);
		System.out.println(Arrays.toString(hashMapConstructor.getParameterTypes())); // prints "[]"
		HashMap<String, String> myMap = (HashMap<String, String>) hashMapConstructor.newInstance(null);
	}
}
