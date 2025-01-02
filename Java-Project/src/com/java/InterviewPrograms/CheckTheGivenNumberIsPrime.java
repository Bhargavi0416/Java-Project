package com.java.InterviewPrograms;

public class CheckTheGivenNumberIsPrime {

	public static void main(String[] args) {
		
		int primenumber = 11;
		int count = 0;
		if(primenumber >1) {
			
			for(int i = 1;i<=primenumber;i++) {
				
				if(primenumber%i==0) {
					count++;
				}}
				if(count==2) {
					System.out.print("it is a prime number");
				}else {
					System.out.print("it is not a prime number");
				}
			}else {
				System.out.println("it is not a prime number");
			
		}
	}

}
