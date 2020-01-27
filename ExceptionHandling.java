package com.hackerrank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			System.out.println(x/y);
			
			sc.close();
		} catch (InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		} catch (ArithmeticException e) {
			System.out.println("java.lang.ArithmeticException: / by zero");
		} 
		
		
	}
}
