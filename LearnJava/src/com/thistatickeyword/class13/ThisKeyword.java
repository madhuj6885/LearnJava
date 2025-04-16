package com.thistatickeyword.class13;

public class ThisKeyword {

	int x, y; // class variables /instance variables
	
	
//	ThisKeyword(int x, int y) {
//		this.x=x;
//		this.y=y;
//		
//	}
	
	
	void setValues(int a, int b) {
		
		x=a;
		y=b;
	}
	
	void display() {
		
		System.out.println(x);
		System.out.println(y);
	}
	
	
	public static void main(String[] args) {
		
		ThisKeyword t = new ThisKeyword();
		t.setValues(4, 5);
		t.display();

		
		
		
	}

}
