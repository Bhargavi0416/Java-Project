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
			}
			if(count==2) {
				System.out.print( i +",");
			}
		}
	}

}
