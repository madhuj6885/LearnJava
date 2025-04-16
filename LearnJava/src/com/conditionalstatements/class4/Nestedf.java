package com.conditionalstatements.class4;

import java.util.Scanner;

public class Nestedf {

	public static void main(String[] args) {

		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name!");
		String name = s.nextLine();
		System.out.println("Enter Your age !");
		int age = s.nextInt();
		
		if (name == "Madhu") {
			if (age >= 18) {
				System.out.println("Hi" + name + " You are able vote to BJP");
				
			} else {
				System.out.println("Your minor !");
			}
			
		}
	}

}
