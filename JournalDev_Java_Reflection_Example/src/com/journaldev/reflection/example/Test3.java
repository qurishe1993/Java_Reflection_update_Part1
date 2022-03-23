package com.journaldev.reflection.example;

import java.util.*;

public class Test3 {

	public static void main(String[] args) {
		
		Class<?> concreteClass=ConcreteClass.class;
		Class<?>[] classes = concreteClass.getClasses();
		//[class com.journaldev.reflection.ConcreteClass$ConcreteClassPublicClass, 
		//class com.journaldev.reflection.ConcreteClass$ConcreteClassPublicEnum, 
		//interface com.journaldev.reflection.ConcreteClass$ConcreteClassPublicInterface,
		//class com.journaldev.reflection.BaseClass$BaseClassInnerClass, 
		//class com.journaldev.reflection.BaseClass$BaseClassMemberEnum]
		for (Class<?> class1 : classes) {
			System.out.println(class1);
		}
		System.out.println("\n-------------------------------------------------------------");
		System.out.println(Arrays.toString(classes));
	}
}
