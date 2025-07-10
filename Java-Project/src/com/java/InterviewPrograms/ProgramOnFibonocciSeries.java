package com.java.InterviewPrograms;

//A series in which each number is the sum of two preceding numbers is known as fibonacci number.

public class ProgramOnFibonocciSeries {

	public static void main(String[] args) {
		int number = 10;
		int firstnumber = 0;
		int secondnumber = 1;
		
		int nextnumber ;
		
		System.out.println("fibonocci series of first 10 numbers is :");
		for(int i = 0 ;i<=number;i++) {
			
			System.out.print(firstnumber + " ,"); // output : 0,1,1,2,3,5,8,13,21,34,55
			nextnumber = firstnumber+secondnumber;
			firstnumber = secondnumber;
			secondnumber = nextnumber;
			
		}
		

	}

}
