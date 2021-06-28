package com.khauminhduy;

public class ClassDemo {

	public static void main(String[] args) {
		String name = "Khau Minh Duy";
		Class<? extends String> class1 = name.getClass();
		
		String name2 = "Nguyen Van A";
		Class<? extends String> class2 = name2.getClass();
		if(class1 == class2) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		Class<?> class3 = String.class;
		
		if(class1 == class3) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		Class<?> class4 = null;
		try {
			class4 = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		if(class2 == class4) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		Class<?> superclass = class1.getSuperclass();
		Class<?>[] interfaces = class1.getInterfaces();
		String superClassName = superclass.getName();
		System.out.println(superClassName);
		
		int length = interfaces.length;
		System.out.println(length);
		for(Class<?> interf : interfaces) {
			System.out.println(interf.getName());
		}
		
	}

}
