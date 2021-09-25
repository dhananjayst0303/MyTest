package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) {

		
		calOccur("Shree Swami Samartha s".toUpperCase());
		
		
		
	}

	
	public static void calOccur(String str) {
	
		Map<Character,Integer> map1 = new HashMap<Character, Integer>();
	
		char[] charArray= str.toCharArray();
		
		for(char a : charArray) {
			
			if(map1.containsKey(a)) {
				
				map1.put(a, map1.get(a)+1);
				
			}
			
			else {
				
				
				map1.put(a, 1);
			}
			
		}
		
		
	
	System.err.println(map1);
	
	
	}
}
