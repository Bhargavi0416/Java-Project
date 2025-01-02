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
		
		System.out.print(name +" : "+hashmap);
	}

}
