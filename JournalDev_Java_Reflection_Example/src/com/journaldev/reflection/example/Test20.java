package com.journaldev.reflection.example;
import java.lang.reflect.Method;
import java.util.*;
public class Test20 {

public static void main(String[] args) throws Exception {

Method method = Class.forName("java.util.HashMap").getMethod("put", Object.class, Object.class);
		Map<String, String> hm = new HashMap<>();
		method.invoke(hm, "key", "value");
		System.out.println(hm); // prints {key=value}
	}
}
