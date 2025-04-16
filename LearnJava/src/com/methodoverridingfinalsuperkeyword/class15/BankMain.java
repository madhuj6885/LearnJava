package com.methodoverridingfinalsuperkeyword.class15;



class Bank {
	
	double roi() {
		
		
	return 0;
	
	}
	
}


class SBI extends Bank {
	
	
	double roi() {
		super.roi();
		return 10.5;
	}
}

class ICICI extends Bank {
	
	double roi() {
		
		return 12.5;
	}
}








public class BankMain {

	public static void main(String[] args) {
		Bank b = new Bank();
//		System.out.println(b.roi());
		SBI sbi = new SBI();
		System.out.println("Rate of Interest in SBI :"+ sbi.roi());
//		System.out.println("Rate of Interest in SBI :"+super.roi());

		ICICI i = new ICICI();
		System.out.println("Rate of Interest in ICICI is: " + i.roi());
		

	}

}
