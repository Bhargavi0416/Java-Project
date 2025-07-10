package com.java.InterviewPrograms;

public class PrintTheEvenFromArray {

	public static void main(String[] args) {
		
		int arr[] = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		//System.out.println("even numbers from the array");
		System.out.println("odd numbers from array :");
		for(int i = 0; i<arr.length;i++) {
			
			if(i%2==0)
			   System.out.print(arr[i]+",");  // output : 2, 4, 6, 8, 10, 12,14
		}
		//System.out.println("odd numbers from array");
		System.out.println("\neven numbers from the array :");
	for(int i = 0; i<arr.length;i++) {
		
	             if(i%2!=0)
	            	 System.out.print(arr[i]+",");    // output :  1, 3, 5, 7, 9, 11, 13 
	}

}}
