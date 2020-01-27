package com.hackerrank;

class Singleton  {

	public static String str;
	private static Singleton pattern;
	private Singleton () {
	}
	
	static Singleton getSingleInstance() {
		if (pattern == null) {
			pattern = new Singleton();
		}
		
		return pattern;
	}
	
}


public class SingletonPattern {
	
	public static void main(String[] args) {
		Singleton.getSingleInstance();
	}
	
}