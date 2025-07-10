package com.java.InterviewPrograms;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		
		int arr[] = new int[] {1,2,3,4,5,6,7,8};
		int temp ;
		int i=0,j=arr.length-1;
		while(i<j) {
			temp = arr[i];
			arr[i]= arr[j];
			arr[j]=temp;
			i++;
			j--;
			
		}
		//System.out.print(Arrays.toString(arr));
		for(i = 0; i<=arr.length-1;i++){
           System.out.print(arr[i]+","); }
		
	}}


