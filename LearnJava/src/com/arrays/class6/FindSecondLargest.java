package com.arrays.class6;

public class FindSecondLargest {

	public static void main(String[] args) {

		
		int[] a = {1, 56, 7, 4, 38, 98, 87};
		
		
		int first = a[0]; int second =a[0];
		
		
		for (int i : a) {
			
			
			if(i>first) {
				second = first;
				first = i;
			} else if(i > second) {
				second = i;
			}
			
			
		}
		System.out.println(second);

	}

}
