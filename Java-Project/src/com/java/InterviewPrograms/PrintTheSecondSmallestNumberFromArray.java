
package com.java.InterviewPrograms;

public class PrintTheSecondSmallestNumberFromArray {

	public static void main(String[] args) {
		
		int arr[] = new int[] {153,370,371,1639,401,201,202,502,200,301,404,400};
		
		int temp;
		for(int i = 0; i<arr.length;i++) {
			
			for(int j = i+1; j<arr.length; j++) {
				
				if(arr[i]>arr[j]) { //smallest           If (arr[i]<arr[j]//second largest number 
					
					temp = arr[i];
					
					arr[i] = arr[j];
					
					arr[j] = temp;
					
				}}}
			  System.out.println("element in ascending order :");//output : 153,200,201,202,301,370,371,401,404,502,1639
			   for(int i = 0;i<arr.length;i++) {
				   System.out.print(arr[i]+",");
			}
			   System.out.print("\nsecond smallest element in an array : "+arr[1]);  // output : 200
		}
		

	}


