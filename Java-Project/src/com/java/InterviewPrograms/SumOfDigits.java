package com.java.InterviewPrograms;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a value of number variable");
		int number = sc.nextInt();
	    System.out.print(" enter the sum var value");
	    int sum = sc.nextInt();
	    System.out.println("enter the rem value");
	    int rem = sc.nextInt();
	    while(number>0){
	    	
	    	rem = number%10;
	    	sum = sum+rem;
	    	number = number/10;
	    	
	    }
		System.out.print("sum of the digit number is : " + sum);
		// TODO Auto-generated method stub

	}

}
