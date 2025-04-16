package com.operators.class3;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {

//		int age =10;
//		char c = 'M';
//		String result = (c >656) ? "You can vote " : " You are a child bro !";
//		
//		System.out.println(result);
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age ?");
		int age = s.nextInt();
		String result = (age > 18 ) ? "You can vote " : "You cannot vote bro";
		System.out.println(result);
		
		
	}

}
