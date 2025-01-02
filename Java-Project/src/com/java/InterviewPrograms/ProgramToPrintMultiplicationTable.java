package com.java.InterviewPrograms;

public class ProgramToPrintMultiplicationTable {

	public static void main(String[] args) {
		
		int num = 5;
		
		System.out.println("Multiplication table of given number");
		for(int i = 1 ; i<=10;i++) {
			
			System.out.println(num+ " * " + i + " = "+(num*i));
		}
		

	}

}
