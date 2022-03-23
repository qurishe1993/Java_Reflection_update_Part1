package com.journaldev.reflection.example;
import java.lang.reflect.Method;
public class Test21 {

	public static void main(String[] args) throws Exception {

		// invoking private method
		Method method = Class.forName("com.journaldev.reflection.example.BaseClass").getDeclaredMethod("method3", null);
		method.setAccessible(true);
		method.invoke(null, null); // prints "Method3"
	}
}
