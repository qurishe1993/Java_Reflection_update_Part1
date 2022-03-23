package java_reflection_example_part1;

class Simple {

}

public class Test1 {

	public static void main(String[] args) throws Exception {
		Class c = Class.forName("java_reflection_example_part1.Simple");
		System.out.println(c.getName());
		System.out.println(c.getPackageName());
	}
}
