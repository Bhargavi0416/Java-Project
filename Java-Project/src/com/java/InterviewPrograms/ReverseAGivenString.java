package com.java.InterviewPrograms;

import java.util.Scanner;

public class ReverseAGivenString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a string value s : ");
		String s = sc.nextLine();
		System.out.println("enter a reverse value :");
		String reverse = "";
		for(int i = s.length()-1;i>=0;i-- ) {
			
			//System.out.print("print the string value : "+s);
			
			reverse = reverse+s.charAt(i);
			
		}
		System.out.println("print the string value : "+s);
		System.out.println("reversed  string value is : "+reverse);
			
		
	}

}
