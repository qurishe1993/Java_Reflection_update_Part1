package com.journaldev.reflection.example;
import java.util.*;
public class Test13 {

	public static void main(String[] args) throws SecurityException, ClassNotFoundException {

		java.lang.annotation.Annotation[] annotations = Class.forName("com.journaldev.reflection.example.ConcreteClass")
				.getAnnotations();
//prints [@java.lang.Deprecated()]
		System.out.println(Arrays.toString(annotations));

	}
}
