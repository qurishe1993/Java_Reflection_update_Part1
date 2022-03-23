package com.journaldev.reflection.example;
import java.lang.reflect.Field;

public class Test18 {

	public static void main(String[] args) throws Exception{

		Field privateField = Class.forName("com.journaldev.reflection.example.ConcreteClass").getDeclaredField("privateString");
		//turning off access check with below method call
		privateField.setAccessible(true);
		ConcreteClass objTest = new ConcreteClass(1);
		System.out.println(privateField.get(objTest)); // prints "private string"
		privateField.set(objTest, "private string updated");
		System.out.println(privateField.get(objTest)); // prints "private string updated"
	}
}
