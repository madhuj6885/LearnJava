package com.arrays.class6;

public class SingleDimensionalArray {

	public static void main(String[] args) {

		
//		int[] a = new int[5];
//		
//		a[0]=15;
//		a[1]=23;
//		a[2]=34;
//		a[3]=35;
//		a[4]=55;
		int[] a = {1, 2, 3, 4, 5, 6, 7};
		
		int search = 5;
		
		
		
		
		for (int i : a) {
			if (i==search) {
				System.out.println(i + " is found !");
				break;
				
			} 
				
			
				
				
			
		}
		System.out.println("Not avaialble in given array !");
//		int sum=0;
//		int count = 0;
		
		
		//System.out.println(a[0]);
		
//		for (int i = a.length-1; i >=0; i--) {
//			sum+= a[i];
//			count++;
////			System.out.println(a[i]);
//			
//		}
//		System.out.println(sum);
//		System.out.println(count);
//		System.out.println("Average is : " + (sum/count));


		
		
	}

}
