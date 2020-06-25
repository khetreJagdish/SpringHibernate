package com.fulcrum.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class CollectionsDemo {
	
		public static void main(String[] args) {
			
						List<String> list = new ArrayList<>();
			list.add("String1");
			list.add("String2");
			list.add("String3");
			list.add("String4");
			list.add("Wtring5");
			list.add("String6");
			list.add("String7");
			list.add(null);
			list.add(null);
			list.add(null);
			list.add(null);
			
			
			System.out.println(list);
			
			/*Collections.sort(list,new Comparator<String>() {
				
				public int compare(String o1, String o2) {
					if(null != o1 && null != o2)
					  return o1.compareTo(o2);
					
					return 0;
					
				}
			});*/
			
			/*ListIterator<String> listItr = list.listIterator();
			if(null != listItr)
			while (listItr.hasNext()) {
				
				System.out.println("Next : " +listItr.next());
				
			}
*/			
			
		}
}



