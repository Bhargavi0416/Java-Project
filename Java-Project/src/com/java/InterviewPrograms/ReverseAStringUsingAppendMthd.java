package com.java.InterviewPrograms;

public class ReverseAStringUsingAppendMthd {

	public static void main(String[] args) {
		
		
		String str = "java program";
		StringBuilder  reverse = new StringBuilder();
		
		for(int i = str.length()-1;i>=0;i--) {
			
			reverse.append(str.charAt(i));
		}
		System.out.println("string s value : "+str); //   output : java program
		System.out.print("Reverse a string : "+reverse); // output : margorp avaj

	}

}
