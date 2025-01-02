package com.java.InterviewPrograms;

public class ProgramOnPalindrome {

	public static void main(String[] args) {
		
		int number = 12321;
		int remainder = 0;
		int reverse = number;
		int result = 0;
		while(number>0) {
			
			remainder = number%10;
			result = result*10+remainder;
			number = number/10;
		}
		System.out.println("reverse  number :"+reverse);
		if(reverse==result) {
			System.out.println("it is palindrome number");
	}
		else {
			System.out.println("it is not a palindrome number");
		}
	}
	
}
