package com.conditionalstatements.class4;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number from 1 to 7");
		int num = s.nextInt();
		
		
		switch (num) {
		case 1:System.out.println("Monday");
			break;
		case 2:System.out.println("Tuesday");
		break;
		case 3:System.out.println("Wednesday");
		break;
		case 4:System.out.println("Thirsday");
		break;
		case 5:System.out.println("Friday");
		break;
		case 6:System.out.println("Saturday");
		break;
		case 7:System.out.println("Sunday");
		break;
       default:System.out.println("Invalid Number Selected !");
			break;
		}
		

	}

}
