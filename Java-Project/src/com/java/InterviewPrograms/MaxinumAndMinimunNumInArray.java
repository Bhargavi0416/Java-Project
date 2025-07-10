package com.java.InterviewPrograms;

public class MaxinumAndMinimunNumInArray {

	public static void main(String[] args) {
		
		int arr[] = new int [] { 100,98,987,2109,1232,9876,59};
		
		int max = arr[0];
		for (int i =0;i<arr.length;i++) {
			
			if(arr[i]>max) {
			
			    max=arr[i];
			}	
		}
		System.out.println("Maximum number in a given array : "+max);  // output : 9876
		
		int min = arr[0];
		for(int i = 0;i<arr.length;i++) {
			
			if(arr[i]<min) {
				
				min = arr[i];
			}}
			System.out.print("Minimum number in a given array : "+min); // output :59
		}
	}
	


