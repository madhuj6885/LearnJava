package com.abstractionnterface.class16;


interface SBI {
	
	void rateOfInterest();
	
}


interface  HDFC {
	void rateOfInterest();
}

public abstract class Banks implements SBI, HDFC {

	public static void main(String[] args) {
		
//		Banks  b = new Banks();
//		
//
//	}

	@Override
	public void rateOfInterest() {
System.out.println("is 5 %");		
	}

}
