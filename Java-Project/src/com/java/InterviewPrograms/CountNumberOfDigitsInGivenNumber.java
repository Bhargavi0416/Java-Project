package com.java.InterviewPrograms;

import java.util.Scanner;

public class CountNumberOfDigitsInGivenNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a value of number variable :");
		int number = sc.nextInt(); // 987654
		System.out.print("enter a value of count :");  
		int count = sc.nextInt(); //0
		System.out.print("");
		while(number>0) {
			number = number/10;
			count++;
		}
		System.out.print("Number of digits count in a given number is :"+count); //output: 6
		// TODO Auto-generated method stub

	}

}
