package com.fulcrum.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ArrayListDemo {
	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(10);
		arrayList.add(10);
		arrayList.add(10);
		arrayList.add(10);
		arrayList.add(10);
		arrayList.add(10);
		arrayList.add(10);
		arrayList.add(10);

		Map<String, String> map = new HashMap<String, String>();
		map.put("Jagdish", "1");
		map.put("Jagdish1", "1");
		map.put("Jagdish2", "2");
		map.put("Jagdish3", "3");
		map.put("Jagdish4", "4");
		map.put("Jagdish5", "5");
		map.put("Jagdish6", "6");
		map.put("Jagdish6", "6");

		Iterator<Entry<String, String>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) iterator.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());

		}
		System.out.println("==================================");
		
		
		
		TreeMap<String, String> treeMap = new TreeMap<>(map);
		
		Iterator<Entry<String, String>> iteratorTreeMap = treeMap.entrySet().iterator();
		
		while (iteratorTreeMap.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) iteratorTreeMap.next();
			System.out.println("-------------");
			System.out.println(entry.getKey() + " : " + entry.getValue());

		}

	}

}
