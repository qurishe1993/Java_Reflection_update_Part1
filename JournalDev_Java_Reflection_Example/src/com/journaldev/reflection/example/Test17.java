package com.journaldev.reflection.example;
import java.lang.reflect.Field;
public class Test17 {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException {

		Field field = Class.forName("com.journaldev.reflection.example.ConcreteClass").getField("publicInt");
		ConcreteClass obj = new ConcreteClass(5);
		System.out.println(field.get(obj)); // prints 5
		field.setInt(obj, 10); // setting field value to 10 in object
		System.out.println(field.get(obj)); // prints 10
	}
}
