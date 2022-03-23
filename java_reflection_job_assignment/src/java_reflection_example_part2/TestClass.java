package java_reflection_example_part2;
import java.lang.reflect.*;

public class TestClass {

	public static void main(String[] args) throws Exception {
		Employee e=new Employee();
		Class c=e.getClass();
		
		Field[] flds=c.getDeclaredFields();
		for (Field f : flds) {
			System.out.println("Field Name is :" +f.getName());
			System.out.println("Data Type is :" +f.getType().getName());
			int modi=f.getModifiers();
			System.out.println("Modifier is :" +Modifier.toString(modi));
			System.out.println("Value is :" +f.get(f));
			System.out.println("---------------------------------");
		}
	}
}
