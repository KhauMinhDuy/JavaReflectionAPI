package com.khauminhduy;

import java.lang.reflect.Field;

public class ReflectionDemo {

	public static void main(String[] args) {
		Class<?> classPerson = Person.class;
		Field fieldName = null;
		Field declaredFieldAge = null;
		try {
			fieldName = classPerson.getField("name"); // for public field and field inherited
			
			declaredFieldAge = classPerson.getDeclaredField("age"); // for private field > public and no inherited 
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		
		String name = fieldName.getName();
		System.out.println(name);
		
		String name2 = declaredFieldAge.getName();
		System.out.println(name2);
		
		
	}

}
