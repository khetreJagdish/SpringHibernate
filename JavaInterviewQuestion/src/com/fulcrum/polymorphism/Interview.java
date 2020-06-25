package com.fulcrum.polymorphism;


class ABC{
	
	ABC(){
		System.out.println("ABC");
		print();
	}
	
	public void print() {
		System.out.println("Inside print of ABC");
	}
}

class PQR extends ABC{
	
	PQR(){
		System.out.println("PQR Constructor");
	}
	public void print() {
		System.out.println("Inside print() of PQR constructor");
	}
}

public class Interview {
	
	public static void main(String[] args) {
		ABC abc = new PQR();
		abc.print();
	}
}
