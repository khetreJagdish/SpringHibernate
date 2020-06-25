package com.fulcrum.collection;

public class ArrayIndexOutOfBound {
	
	public static void main(String[] args) {
		
		Integer[] integers = new Integer[10];
		
		integers[0]=10;
		integers[1]=10;
		integers[2]=10;
		integers[3]=10;
		integers[4]=10;
		integers[5]=10;
		integers[6]=10;
		integers[7]=10;
		integers[8]=10;
		integers[9]=10;
		
		
		for(Integer intnum :integers) {
			System.out.println(intnum);
		}
	}
}
