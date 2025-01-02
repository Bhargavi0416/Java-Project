package com.java.InterviewPrograms;

public class ProgramOnFactorialNumber {

	public static void main(String[] args) {
		
		int n = 10;
		
		int factorial = 1;
		
		for(int i = 1;i<=n;i++) {
			factorial = factorial *i;
		}
		System.out.print("Factorial of 10 is :"+factorial);
	}

}