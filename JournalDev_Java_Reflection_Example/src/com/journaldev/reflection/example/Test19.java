package com.journaldev.reflection.example;
import java.lang.reflect.Method;
import java.util.*;
import java.lang.reflect.Modifier;
import java.lang.Object;

public class Test19 {

	public static void main(String[] args) throws Exception {

		Method method = Class.forName("java.util.HashMap").getMethod("put", Object.class, Object.class);
//get method parameter types, prints "[class java.lang.Object, class java.lang.Object]"
		System.out.println(Arrays.toString(method.getParameterTypes()));
//get method return type, return "class java.lang.Object", class reference for void
		System.out.println(method.getReturnType());
//get method modifiers
		System.out.println(Modifier.toString(method.getModifiers())); // prints "public"
	}
}
