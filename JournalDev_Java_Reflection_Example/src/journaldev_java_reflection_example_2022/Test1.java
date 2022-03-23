package journaldev_java_reflection_example_2022;

import java.util.*;
import java.lang.reflect.Method;


public class Test1 {

	public static void main(String[] args) throws ClassNotFoundException {

		Class<?> superClass = Class.forName("journaldev_java_reflection_example_2022.ConcreteClass").getSuperclass();
		System.out.println(superClass); // prints "class com.journaldev.reflection.BaseClass"
		System.out.println(Object.class.getSuperclass()); // prints "null"
		System.out.println(String[][].class.getSuperclass());// prints "class java.lang.Object"

		Method[] publicMethods = Class.forName("journaldev_java_reflection_example_2022.BaseClass").getMethods();
		//prints public methods of ConcreteClass, BaseClass, Object

		String s=Arrays.toString(publicMethods);
		System.out.println(s);

	}

}
