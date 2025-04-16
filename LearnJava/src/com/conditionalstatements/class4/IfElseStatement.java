package com.conditionalstatements.class4;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {

		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Random Number !");
		int num = s.nextInt();
		
		if (num > 0) {
			System.out.println(num + " is a positive number !");

			
		} else {
			
			System.out.println(num + " is a negitive number !");
		}
//		if(num % 2 == 0) {
//			
//			System.out.println(num + " Its an Even Number ");
//		} else {
//			System.out.println(num + " it is a odd number !");
//		}
	}

}
