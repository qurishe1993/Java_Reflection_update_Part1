package com.journaldev.reflection.example;

import java.lang.reflect.TypeVariable;

public class Test8 {

	public static void main(String[] args) throws ClassNotFoundException {

		//Get Type parameters (generics)
		TypeVariable<?>[] typeParameters = Class.forName("java.util.HashMap").getTypeParameters();
		for(TypeVariable<?> t : typeParameters)
		System.out.print(t.getName()+",");
	}
}
