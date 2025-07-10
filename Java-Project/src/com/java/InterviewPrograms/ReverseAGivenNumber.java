package com.java.InterviewPrograms;

import java.util.Scanner;

public class ReverseAGivenNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a value of number :"); // output : 12345
		int number = sc.nextInt();
		System.out.print("enter a value of reverse :"); // value : 0
		int reverse = sc.nextInt();
		System.out.print("enter a value for remainder :"); // value : 0
		int remainder = sc.nextInt();
		while(number>0) {
			remainder = number%10;
			reverse  = reverse*10+remainder;
			number = number/10;
		}
		
		System.out.println("Reverse A given number is :"+reverse); // output : 54321
	}

}
