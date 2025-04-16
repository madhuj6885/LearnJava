package com.methodoverridingfinalsuperkeyword.class15;


class ABC {
	
	
	void m1(int a)
	{
		
	System.out.println(a);
	}
	
	
	void m2(int b)
	{
		
	System.out.println(b);
	
	}
	}

class XYZ extends ABC {
	
	
	void m1(int a) {              //overriding
		System.out.println(a*a);
	}
	
	
	
	void m2(int a) {
		
		System.out.println(a);
	}
	void m2(int a, int b) {         //overloaded
		
		System.out.println(a+b);
	}
}
public class OverridingOverloading {
	
	

public static void main(String[] args) {
       XYZ xyz = new XYZ();
       xyz.m1(5);
       xyz.m2(5);
       xyz.m2(5, 4);
       xyz.m2(10);


	}

}
