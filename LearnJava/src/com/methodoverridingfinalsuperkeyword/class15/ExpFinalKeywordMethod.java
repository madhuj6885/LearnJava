package com.methodoverridingfinalsuperkeyword.class15;


 class Test1 {
	
	static void m() {
		
		
		System.out.println(" m method from Test1 Class");
	}
}


class Test2 extends Test1 {
	
	
	static void m() {
		
		System.out.println("m method from Test2 Class");
	}
}





public class ExpFinalKeywordMethod {

	public static void main(String[] args) {
//Test2 t2 = new Test2();
//t2.m();
		
		Test2.m();
		Test1.m();
	}

}
