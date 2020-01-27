package com.hackerrank;

interface Sample {
	public void set();
}

public class AnonymousClass {
	
	int x;
	
	public static void main(String[] args) {
		
		
		Sample s = new Sample() {
			public void set() {
				System.out.println("I am working");
			}
		};
		
		s.set();
	}
	
	public void check() {
		
		System.out.println(x);
	}
}
