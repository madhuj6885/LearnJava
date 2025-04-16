package com.thistatickeyword.class13;

public class StaticDemo {
	
static int a=10;
int b=20;
static void m1() {
	System.out.println("Static method ");
}

void m2() {
	
	
	System.out.println("Non-static method !");
}


	public static void main(String[] args) {
		
		//static methods can access static stuff directly without creating any objects
		
		m1();
		System.out.println(a);
		
		
		StaticDemo s = new StaticDemo();
		System.out.println(s.b);
		s.m2();
		
		
		
		

	}

}
