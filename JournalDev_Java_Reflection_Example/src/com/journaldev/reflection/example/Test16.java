package com.journaldev.reflection.example;
import java.lang.reflect.Field;
public class Test16 {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, ClassNotFoundException {

		Field field = Class.forName("com.journaldev.reflection.example.ConcreteClass").getField("publicInt");
		Class<?> fieldType = field.getType();
		System.out.println(fieldType.getCanonicalName()); // prints int

	}
}
