package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class Test1 {

	public static void main(String[] args) {

		Map<Integer,String> map1= new HashMap<Integer,String>();
		
		map1.put(1, "Ram");
		map1.put(2, "Laxman");
		
		System.out.println(map1);
		
		
		for(int a: map1.keySet()) {
			
			System.out.println("For key >"+a+" value is>"+map1.get(a));
			
		}
	
		
		map1.forEach((k,v) -> System.out.println("Key is >"+k+" value is > "+v));
		
	}

}
