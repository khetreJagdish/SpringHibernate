package com.fulcrum.collection;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapInternalWorkingDemo {
	
	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		long starttimetree = System.currentTimeMillis();
		for(int i=0; i<= 1000000;i++) {
			treeMap.put("Jagdish", i);
		}
		long endtimetree = System.currentTimeMillis();
		
		System.out.println("TreeMap Insertion time : " + (endtimetree -starttimetree));
		
		System.out.println("==================================");
		
		HashMap<String, Integer> hashMap = new HashMap<>();
		
		long starttimemap = System.currentTimeMillis();
		for(int i=0; i<= 1000000;i++) {
			hashMap.put("Jagdish", i);
		}
		long endtimetmap = System.currentTimeMillis();
		
		System.out.println("HashMap Insertion time : " + (endtimetmap -starttimemap));
		
		System.out.println("==================================");
	}
}
