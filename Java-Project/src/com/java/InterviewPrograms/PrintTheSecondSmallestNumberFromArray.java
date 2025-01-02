package com.java.InterviewPrograms;

public class PrintTheSecondSmallestNumberFromArray {

	public static void main(String[] args) {
		
		int arr[] = new int[] {10,20,30,40,50,60,70};
		
		int temp;
		for(int i = 0; i<arr.length;i++) {
			
			for(int j = i+1; j<arr.length; j++) {
				
				if(arr[i]>arr[j]) {
					
					temp = arr[i];
					
					arr[i] = arr[j];
					
					arr[j] = temp;
					
				}}}
			  System.out.println("element in ascending order :");
			   for(int i = 0;i<arr.length;i++) {
				   System.out.print(arr[i]+",");
			}
			   System.out.print("\nsecond smallest element in an array "+arr[1]);
		}
		

	}


