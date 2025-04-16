package com.conditionalstatements.class4;

import java.util.Scanner;

public class NestedIfElseStatement {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter A Number !");
		int a = s.nextInt();
		System.out.println("Enter B Number !");
		int b = s.nextInt();
		System.out.println("Enter C Number !");
		int c = s.nextInt();
		
		if (a>b && a > c) {
			System.out.println(a + " is a greater");
			
		} else if(b> a && b >c) {
			System.out.println(b + " is a greater");
		} else {
			
			System.out.println(c + "  is graeter");
		}

//		
//		if (num > 0) {
//			System.out.println(num + " is a positive number");
//			
//		} else if(num < 0 ) { 
//			System.out.println(num + " is a negitive number");
//		} else {
//			System.out.println(num + " is zero");
//		}

	}

}
