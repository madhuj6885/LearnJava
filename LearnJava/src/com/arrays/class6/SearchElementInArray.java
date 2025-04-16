package com.arrays.class6;

public class SearchElementInArray {

	public static void main(String[] args) {
 int[] a = {1, 2,3, 4, 5, 6, 7, 8, 9};
 int search =5;
 boolean found = false;
 
 
 
 for (int i : a) {
	 
	 if (i==search) {
		 found = true;
		 System.out.println(i + "is found in a given array");
		
	}
	
}
 
 if(found == false) {
	 
	 System.out.println("Element not found ina given array !");
 }
	}

}
