package com.methodoverridingfinalsuperkeyword.class15;



class Parent {
	
	String name = "Madhu";
	
	
	String getName() {
		
		return name;
	}
	
	
}

class Child extends Parent {
	
	
	static int age=14;

	int getAge() {
		return age;
	}
}









public class MethodOverriding {

	public static void main(String[] args) {
		
		Child c = new Child();
		int age = c.getAge();
		String name = c.getName();
		System.out.println(age);
		System.out.println(name);

	}

}
