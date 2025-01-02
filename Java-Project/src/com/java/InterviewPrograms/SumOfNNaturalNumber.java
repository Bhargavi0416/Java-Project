package com.java.InterviewPrograms;

import java.util.Scanner;

public class SumOfNNaturalNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a value of n variable : ");
		int n = sc.nextInt();
		System.out.print("enter the value of sum variable value : ");
		int sum = sc.nextInt();
		sum = n*(n+1)/2;
		System.out.print("sum of n natural numbers is : "+sum);
		
		

	}

}
