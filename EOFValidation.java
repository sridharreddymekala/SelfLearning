package com.hackerrank;

import java.util.Scanner;

public class EOFValidation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int counter = 0;
		while(scanner.hasNextLine()) {
			counter++;
			String s = scanner.nextLine();
			System.out.println(counter + " " + s);
			
		}
		scanner.close();
	}

}
