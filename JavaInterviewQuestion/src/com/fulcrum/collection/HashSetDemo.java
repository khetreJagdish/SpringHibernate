package com.fulcrum.collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Strng1");
		hashSet.add("Strng1");
		hashSet.add("wtrng1");
		hashSet.add(null);
		
		System.out.println(hashSet);
	}

}
