package com.java.BasicProgram;

import java.util.Scanner;

public class CheckTheGivenNumberIsArmstrong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number");
		
		int number = sc.nextInt();
		
		int n = number;
		
		System.out.println("enter the value of remainder ");
		
		int rem = sc.nextInt();
		
		System.out.println("enter the value of armstrong");
		
		int armstrong = sc.nextInt();
		
		while(number>0) {
			
			rem = number %10;
			
			armstrong = armstrong+rem*rem*rem;
			
			number = number/10;
		}
		
		System.out.println("armstrong number value is arstrong "+armstrong);
	
		if(armstrong==n)
			System.out.println(armstrong + " it is a armstrong number ");
		else {
			System.out.println(armstrong + " it is not a armstrong number ");
		}

	}

}
