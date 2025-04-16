package com.encapsulation.class12;

public class MethodOverload {
	
	void main() {
		System.out.println("Iam a overload method without params");
	}
	
	
	String main(String name) {
		return name;
		
	}

	public static void main(String[] args) {
		
		MethodOverload m =   new MethodOverload();
		m.main("Some")
		
		
		
		;

	}

}
