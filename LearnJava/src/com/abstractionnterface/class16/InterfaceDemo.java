package com.abstractionnterface.class16;




interface Shape {
	
	int length=10;
	int height=10;
	
	
	default void square() {
		System.out.println("Iam a square from shape interface");
	}
	
	void rectangle();
	static void circle() {
		
		System.out.println("Iam a circle from interface");
	}
	
	
	
}
public class InterfaceDemo implements Shape {
	
	void triangle() {
		
		System.out.println("Triangle from Class");
	}
	@Override
	public void rectangle() {
System.out.println("Iam a rectangle method from class");		
	}



	public static void main(String[] args) {
		InterfaceDemo i = new InterfaceDemo();
		i.square();
		i.rectangle();
		Shape.circle();
		i.triangle();
		
		
		Shape s = new InterfaceDemo();
		s.square();
		s.rectangle();
		Shape.circle();
		System.out.println(Shape.length * Shape.height);
	}

	

}
