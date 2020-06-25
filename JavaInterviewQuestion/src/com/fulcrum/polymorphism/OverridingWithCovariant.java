package com.fulcrum.polymorphism;

class Parent {
	public Parent bark() {
		//System.out.println("Inside bark() of Parent");
		return new Parent();
		
	}
	
	public void sniff() {
		System.out.println("Inside sniff() of Parent");
	}
}

class Child extends Parent {

	public Child bark() {
		//System.out.println("Inside bark() of Child");
		return new Child();
		
	}
	
}

public class OverridingWithCovariant {
	
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.bark();
	}
	
	
}
