package com.methodoverridingfinalsuperkeyword.class15;


class P  {
	
	int x = 100;
}

class Q extends P {
	
	
	int x =200;
	
	int y = super.x;
}



public class SuperKeyword {

	public static void main(String[] args) {
		
		P p1 = new Q();
		System.out.println("Upcasting"+ p1.x);

		Q c1 = (Q) p1;
		System.out.println("Downcasting = " + c1.x);
		
	    Q c = new Q();
		System.out.println("From Child class" + c.x);
		System.out.println(c.y);
		System.out.println(c.x);

		
		P p = new P();
		System.out.println("From Parent class " + p.x);
		
		

	}

}
