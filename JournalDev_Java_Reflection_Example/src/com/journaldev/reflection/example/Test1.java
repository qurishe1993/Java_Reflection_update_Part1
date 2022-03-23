package com.journaldev.reflection.example;

public class Test1 {

	public static void main(String[] args) throws ClassNotFoundException {
		//get class using reflection
		Class<?> concreteClass=ConcreteClass.class;
		concreteClass=new ConcreteClass(5).getClass();
		try {
			// below method is used most of the times in frameworks like JUnit
			//Spring dependency injection, Tomcat web container
			//Eclipse auto completion of method names, hibernate, Struts2 etc.
			//because ConcreteClass is not available at compile time
			concreteClass = Class.forName("com.journaldev.reflection.example.ConcreteClass");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(concreteClass.getCanonicalName());
		
		// for primitives types, wrapper classes and arrays
		Class<?> booleanClass=boolean.class;
		System.out.println(booleanClass.getCanonicalName());
		
		Class<?> cDouble=Double.TYPE;
		System.out.println(cDouble.getCanonicalName());
		
		Class<?> cDoubleArray = Class.forName("[D");
		System.out.println(cDoubleArray.getCanonicalName());
		
		Class<?> twoStringArray=String[][].class;
		System.out.println(twoStringArray.getCanonicalName());
	}

}


