package com.learnstrings.class8;

public class StringImmutability {
	
	public static void main(String[] args) {
		
		//Reverse a string
		
		String s = "madhu";
		System.out.println(s.concat("jesus"));
		System.out.println(s);
		StringBuffer sb = new StringBuffer(s);
		sb.append("hello");
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		StringBuilder sb2 = new StringBuilder("jesus");
		System.out.println(sb2.reverse());
		
//		String s = "iam from india";
//		String reverse = " ";
//		
//		
//		
//		String[] a = s.split(" ");
//	
//		
//   		for (int i = a.length-1; i >=0 ; i--) {
//			reverse += a[i] + " ";
//		}
////		
//		System.out.println(reverse);
		
		
		
		
	}

}
