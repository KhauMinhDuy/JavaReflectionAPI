package com.khauminhduy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.stream.Stream;

public class CustomerReflection {

	public static void main(String[] args) {
		Class<?> customerClass = Customer.class;
		
		Field[] declaredFields = customerClass.getDeclaredFields();
		
		Stream.of(declaredFields).forEach(e -> {
			int modifiers = e.getModifiers();
			boolean public1 = Modifier.isPublic(modifiers);
			System.out.println( "Name: " + e.getName() + " | public : " + public1);
		});
		
		
		
		Method[] declaredMethods = customerClass.getDeclaredMethods();
		
		Stream.of(declaredMethods).forEach(e -> {
			int modifiers = e.getModifiers();
			boolean public1 = Modifier.isPublic(modifiers);
			System.out.println("Name: " + e.getName() + " | public: " + public1);
		});
		
		Constructor<?>[] declaredConstructors = customerClass.getDeclaredConstructors();
		
		Stream.of(declaredConstructors).forEach(e -> {
			System.out.println(e.getName() + " | " + e.getParameterCount() +
					 "| " +Arrays.toString(e.getParameters()));
		});
	}

}
