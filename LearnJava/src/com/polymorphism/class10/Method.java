package com.polymorphism.class10;

public class Method {
	
	
	
	void add() {
		
		System.out.println("This is no arguments method");
	}
	
	void add(int a, int b) {
		System.out.println(a+b);
		
		
	}
	
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	double add(int a, double b) {
		return a+b;
		
		
	}

	public static void main(String[] args) {
		Method m =  new Method();
m.add();
m.add(5, 4);
m.add(5, 6);
m.add(4, 5, 3);

	}

}
