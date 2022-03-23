package journaldev_java_reflection_example_2022;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {


		// Get Class using reflection
		Class<?> concreteClass = ConcreteClass.class;
		concreteClass = new ConcreteClass(5).getClass();
		try {
			// below method is used most of the times in frameworks like JUnit
			//Spring dependency injection, Tomcat web container
			//Eclipse auto completion of method names, hibernate, Struts2 etc.
			//because ConcreteClass is not available at compile time
			concreteClass = Class.forName("journaldev_java_reflection_example_2022.ConcreteClass");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(concreteClass.getCanonicalName()); // prints com.journaldev.reflection.ConcreteClass

		//for primitive types, wrapper classes and arrays
		Class<?> booleanClass = boolean.class;
		System.out.println(booleanClass.getCanonicalName()); // prints boolean

		Class<?> cDouble = Double.TYPE;
		System.out.println(cDouble.getCanonicalName()); // prints double

		Class<?> cDoubleArray = Class.forName("[D");
		System.out.println(cDoubleArray.getCanonicalName()); //prints double[]

		Class<?> twoDStringArray = String[][].class;
		System.out.println(twoDStringArray.getCanonicalName()); // prints java.lang.String[][]
	}

}
