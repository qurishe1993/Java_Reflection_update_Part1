package java_reflection_example_constructor_part4;

import java.lang.reflect.*;


public class TestClass {

	public static void main(String[] args) {
		Class c = Employee.class;
		Constructor[] con = c.getDeclaredConstructors();
		for (Constructor c1 : con) {
			System.out.println("Constructor Name is :" + c1.getName());
			int modi = c1.getModifiers();
			System.out.println("Modifier is :" + Modifier.toString(modi));

			Class[] cls = c1.getParameterTypes();
			System.out.println("Parameter Type is :");
			for (Class c2 : cls) {
				System.out.println(c2.getName() + " ");
			}
			Class[] cls2 = c1.getExceptionTypes();
			System.out.println("Exception Type is :");
			for (Class c3 : cls2) {
				System.out.println(c3.getName());
			}
			System.out.println("----------------------------------------------");
		}
	}

}


