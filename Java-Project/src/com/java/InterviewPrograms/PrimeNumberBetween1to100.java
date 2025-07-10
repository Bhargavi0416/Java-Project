package com.java.InterviewPrograms;

public class PrimeNumberBetween1to100 {

	public static void main(String[] args) {
		
		int prime = 100;
		int count = 0;
		
		System.out.print("prime numbers from 1 to 100 : ");
		for(int i = 1; i<=prime;i++) {
			
			count =0;
			for(int j = 1;j<=i;j++) {
				
				 if(i%j==0) {
					 count++;
					 
				 }
			} // output : 2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97
			if(count==2) {
				System.out.print( i +",");
			}
		}
	}

}
