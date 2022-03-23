package java_reflection_example_method_part3;

import java.lang.reflect.*;

public class TestClass {

	public static void main(String[] args) {
		Class c = Employee.class;

		Method[] mthd = c.getDeclaredMethods();
		for (Method m1 : mthd) {
			System.out.println("Method Name is :" + m1.getName());
			System.out.println("Method Return Type is :" + m1.getReturnType().getName());

			int modi = m1.getModifiers();
			System.out.println("Modifier is :" + Modifier.toString(modi));

			Class[] parameter = m1.getParameterTypes();
			System.out.println("Parameter Type is :");
			for (Class p1 : parameter) {
				System.out.println(p1.getName());
			}

			Class[] except = m1.getExceptionTypes();
			System.out.println("Exception Type is : ");
			for (Class e1 : except) {
				System.out.println(e1.getName());
			}
			System.out.println("---------------------------------");
		}
	}
}
