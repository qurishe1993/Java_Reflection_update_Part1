package java_reflection_example_part1;

class Simple1 {

}

public class Test2 {
	public static void main(String[] args) {
		Simple1 sm = new Simple1();
		Class c=sm.getClass();
		System.out.println(c.getName());
		System.out.println(c.getPackageName());
	}
}
