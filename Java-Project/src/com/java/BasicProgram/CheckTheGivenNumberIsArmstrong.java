package com.java.BasicProgram;


//ArmStrong number is a special kind of number which is equal to sum of cubes and sum of its digits number is known as ArmStrong number//
                    // ex: 1634 is a 4 digit num so we can cap like 1^4+6^4+3^4+4^4 = 1+1296+81+256 = 1634 

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
			
			armstrong = armstrong+rem*rem*rem;//sum = sum + (num%10)*(num%10)*(num%10);153
			
			
			number = number/10;
		}
		
		System.out.println("armstrong number value is armstrong "+armstrong);
	
		if(armstrong==n)
			System.out.println(armstrong + " it is a armstrong number ");
		else {
			System.out.println(armstrong + " it is not a armstrong number ");
		}

	}

}
