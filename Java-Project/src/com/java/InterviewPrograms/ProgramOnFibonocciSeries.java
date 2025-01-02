package com.java.InterviewPrograms;

public class ProgramOnFibonocciSeries {

	public static void main(String[] args) {
		int number = 10;
		int firstnumber = 0;
		int secondnumber = 1;
		
		int nextnumber ;
		
		for(int i = 0 ;i<=number;i++) {
			
			System.out.print(firstnumber + " ,");
			nextnumber = firstnumber+secondnumber;
			firstnumber = secondnumber;
			secondnumber = nextnumber;
			
		}
		

	}

}
