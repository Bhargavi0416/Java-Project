package com.java.InterviewPrograms;

//factorial number is number which is multiple by every number below it 1*2*3*4 4! either it may be Ascending order or descending order.
//a number which multiple by all positive numbers in a given factorial number it is denoted by n!
//A factorial n number which is the product of all positive integers in either ascending or descending order.

public class ProgramOnFactorialNumber {

	public static void main(String[] args) {
		
		int n = 10;
		
		int factorial = 1;
		
		for(int i = 1;i<=n;i++) {
			factorial = factorial *i;
		}
		System.out.print("Factorial of 10 is :"+factorial);
	}                                                               // output : 3628800

}