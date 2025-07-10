package com.java.InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class CharacterCountProgramUsingMap {

	public static void main(String[] args) {
		
		String name = "Bhargavi";
		
		Map<Character,Integer> hashmap = new HashMap<Character,Integer>();
		
		char strArray[] = name.toCharArray();
		
		for(char c : strArray) {
			
			if(hashmap.containsKey(c)){
				
				hashmap.put(c, hashmap.get(c)+1);
			
			}else {
				
				hashmap.put(c,1);
				
				
			}
		}
		
		System.out.print(name +" : "+hashmap);  // output : Bhargavi : {a=2,B=1,r=1,v=1,g=1,h=1,i=1}
	}

}
