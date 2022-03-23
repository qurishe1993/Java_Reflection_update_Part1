package com.journaldev.reflection.example;
import java.lang.reflect.Type;
import java.lang.reflect.Array;
import java.util.Arrays;
public class Test9 {

	public static void main(String[] args) throws ClassNotFoundException   {

		Type[] interfaces = Class.forName("java.util.HashMap").getGenericInterfaces();
		//prints "[java.util.Map<K, V>, interface java.lang.Cloneable, interface java.io.Serializable]"
		System.out.println(Arrays.toString(interfaces));
		//prints "[interface java.util.Map, interface java.lang.Cloneable, interface java.io.Serializable]"
		System.out.println(Arrays.toString(Class.forName("java.util.HashMap").getInterfaces()));

	}
}
