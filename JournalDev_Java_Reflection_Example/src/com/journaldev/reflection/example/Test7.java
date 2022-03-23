package com.journaldev.reflection.example;

import java.lang.reflect.Modifier;

public class Test7 {

	public static void main(String[] args) throws ClassNotFoundException {

		Class<?> concreteClass=ConcreteClass.class;
		System.out.println(Modifier.toString(concreteClass.getModifiers())); // prints "public"
        //prints "public abstract interface"
		System.out.println(Modifier.toString(Class.forName("com.journaldev.reflection.example.BaseInterface").getModifiers()));
	}
}
