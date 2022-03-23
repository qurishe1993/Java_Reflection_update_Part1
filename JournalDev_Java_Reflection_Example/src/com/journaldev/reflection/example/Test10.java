package com.journaldev.reflection.example;
import java.lang.reflect.Method;
import java.util.*;
public class Test10 {

public static void main(String[] args) throws SecurityException, ClassNotFoundException  {

	Method[] publicMethods = Class.forName("com.journaldev.reflection.example.ConcreteClass").getMethods();
		//prints public methods of ConcreteClass, BaseClass, Object
	for (Method method : publicMethods) {
		System.out.println(method);
	}
  }
}
