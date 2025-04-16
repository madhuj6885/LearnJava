package com.arrays.class6;

import java.util.Scanner;

public class GettingArrayValuesFromUser {

	public static void main(String[] args) {
 int[] a = new int[5];
 
 
 Scanner s =  new Scanner(System.in);
 for (int i = 0; i < a.length; i++) {
	 
	 System.out.println("Enter a value!  for the " + i + " position");
	 a[i] = s.nextInt();
	
}
 
 
 for (int i : a) {
	 System.out.print("Entered values are : " + i + " ");

	
}
	}

}
