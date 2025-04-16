package com.learnstrings.class8;

public class Palindrome {

	public static void main(String[] args) {

		String s = "madama";
		String r = "";
		for (int i = s.length()-1; i >=0; i--) {
			r+= s.charAt(i);
			
		}
		
		System.out.println(r);
		
		
		if(s.equals(r)) {
			System.out.println("Given string is Palindrome !");
		} else {
			System.out.println("Given string is not a palindrome !");
		}
		
	}

}
