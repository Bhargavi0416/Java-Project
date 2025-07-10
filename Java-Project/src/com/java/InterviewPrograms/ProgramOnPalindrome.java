package com.java.InterviewPrograms;


//palindromeNumber:A palindrome number is a number which remains same when its digits are reversed. ex;44644,12321

public class ProgramOnPalindrome {

	public static void main(String[] args) {
		
		int number = 12321;
		int remainder = 0;
		int reverse = number;
		int result = 0;
		while(number>0) { //while loop is used when we does know the fixed iteration on a loop // if the condition is true then will executes the statement//
			
			remainder = number%10;  //1234%10=4;123%10=3;12%10=2;1%10=1
			result = result*10+remainder;
			number = number/10;  //1234/10=123;123/10=12;12/10=1;1/10=0//
		}
		System.out.println("reverse  number :"+reverse);
		if(reverse==result) {                               //output : 12321 it is a palindrome number 
			System.out.println("it is palindrome number");
	}
		else {
			System.out.println("it is not a palindrome number");
		}
	}
	
}
