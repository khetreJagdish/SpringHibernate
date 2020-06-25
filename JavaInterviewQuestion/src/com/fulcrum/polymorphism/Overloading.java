package com.fulcrum.polymorphism;

public class Overloading {
	public static void main(String[] args) {
		
		A a = new A();
		a.print("JK",2);
		
		System.out.println(a.print(3,"JK"));
		
	}	
}

class A{
	
	public int print(int num,String name) {
		//System.out.println("Inside class A print(num,name)"+ num +" "+ name);
		return 1;
	}
	
	public void print(String name,int num) {
		System.out.println("Inside class A print(name,num) "+ name +" "+ num);
	}
}
