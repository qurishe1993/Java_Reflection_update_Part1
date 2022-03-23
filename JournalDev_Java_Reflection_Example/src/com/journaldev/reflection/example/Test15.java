package com.journaldev.reflection.example;
import java.lang.reflect.Field;
public class Test15 {

public static void main(String[] args) throws ClassNotFoundException {

		try {
			Field field = Class.forName("com.journaldev.reflection.example.ConcreteClass").getField("interfaceInt");
			Class<?> fieldClass = field.getDeclaringClass();
			System.out.println(fieldClass.getCanonicalName()); // prints com.journaldev.reflection.BaseInterface
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
	}
}
