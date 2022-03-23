package java_reflection_example_part1;

import java.lang.reflect.Modifier;

/*--
 * in this example we will learn how to get 
 * class name , super class , modifier ,
 * interfaces 
 * first we declare super class B then 
 * declare child Class Employee and use 
 * java built in interfaces name
 * 
 * --*/
class B {

}

class Employee extends B implements java.io.Serializable, Cloneable {

}

public class Test4 {

	public static void main(String[] args) throws Exception{
		Class c=Class.forName("java_reflection_example_part1.Employee");
		
		System.out.println("Class Name is :" +c.getName());
		System.out.println();
		System.out.println("Super Class Name is :" +c.getSuperclass().getName());
		System.out.println();
		
		/*--
		 *interface is a class then we use 
		 *public Class[] getInterfaces() method
		* --*/
		Class[] cls=c.getInterfaces();
		System.out.println("Interfaces is : ");
		for (Class c1 : cls) {
			System.out.println(c1.getName());
		}
		System.out.println();
		
		/*--
		 * if we need to know get modifier then
		 * use this method
		 * public int getModifiers()
		 * --*/
		int i=c.getModifiers();
		System.out.println("Modifier is :" +Modifier.toString(i));
		
	}
}
