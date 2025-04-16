package com.arrays.class6;

public class SmallestNmber {

	public static void main(String[] args) {
		 int [] arr = {1, 2, 3, -4, 5, 6, 7, 8, 9};

		 int min = arr[0];
		 for (int i : arr) {
			 if (i < min) {
				 
				 min = i;
				
			}
			 
			 
			
		}
		 System.out.println("The smallest number in an given array is : " + min);

	}

}
