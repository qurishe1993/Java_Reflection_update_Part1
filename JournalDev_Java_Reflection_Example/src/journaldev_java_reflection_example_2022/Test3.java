package journaldev_java_reflection_example_2022;

import java.util.*;
public class Test3 {

	public static void main(String[] args) throws SecurityException, ClassNotFoundException  {

		//getting all of the classes, interfaces, and enums that are explicitly declared in ConcreteClass
		Class<?>[] explicitClasses = Class.forName("journaldev_java_reflection_example_2022.BaseClass").getDeclaredClasses();
		//prints [class journaldev_java_reflection_example_2022.ConcreteClass$ConcreteClassDefaultClass, 
		//class com.journaldev.reflection.ConcreteClass$ConcreteClassDefaultEnum, 
		//class com.journaldev.reflection.ConcreteClass$ConcreteClassPrivateClass, 
		//class com.journaldev.reflection.ConcreteClass$ConcreteClassProtectedClass, 
		//class com.journaldev.reflection.ConcreteClass$ConcreteClassPublicClass, 
		//class com.journaldev.reflection.ConcreteClass$ConcreteClassPublicEnum, 
		//interface com.journaldev.reflection.ConcreteClass$ConcreteClassPublicInterface]
		for (Class<?> class1 : explicitClasses) {
			System.out.println(class1);
			
		}
		System.out.println("\n");
		System.out.println(Arrays.toString(explicitClasses));

	}

}
