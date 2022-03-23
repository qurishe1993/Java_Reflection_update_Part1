package com.journaldev.reflection.example;
import java.lang.reflect.Field;
public class Test14 {

	public static void main(String[] args) throws Exception {

		Field field = Class.forName("com.journaldev.reflection.example.ConcreteClass").getField("interfaceInt");
		System.out.println(field);
	}
}
