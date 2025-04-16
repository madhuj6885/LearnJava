package com.abstractionnterface.class16;



interface I1  {
	
	int x=10;
	void print();
	
}

interface I2 {
	
	
	int y=20;
	void show();
	
}


class C1 {
	
	
	
	void display() {
		
		System.out.println("Iam from display method from class C1");
	}
}





public class MultipleInheritence extends C1 implements I1, I2 {

	public static void main(String[] args) {
		
		MultipleInheritence m = new MultipleInheritence();
		m.display();
		System.out.println(m.x);
		m.print();
		System.out.println(m.y);
		m.show();

	}

	@Override
	public void show() {
System.out.println("Implemented for I2 interface");		
	}

	@Override
	public void print() {
System.out.println("Implemented for I1 interface");		
	}

}
